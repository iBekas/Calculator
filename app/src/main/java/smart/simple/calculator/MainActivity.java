package smart.simple.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView calcText;
    private SetTextOnField memory;
    private static final String KEY = "KeyValues";

    private Button buttonZero;
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFour;
    private Button buttonFive;
    private Button buttonSix;
    private Button buttonSeven;
    private Button buttonEight;
    private Button buttonNine;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonComposition;
    private Button buttonDivision;
    private Button buttonRoot;
    private Button buttonPercent;
    private Button buttonDot;
    private Button buttonDelete;
    private Button buttonDeleteAll;
    private Button buttonEquals;
    private Button buttonOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        memory = new SetTextOnField();
        initButtonAndText();
    }

    @Override
    protected void onResume() {
        super.onResume();
        listenerButton();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_0:
                memory.setTextOnField(0);
                showField();
                break;
            case R.id.button_1:
                memory.setTextOnField(1);
                showField();
                break;
            case R.id.button_2:
                memory.setTextOnField(2);
                showField();
                break;
            case R.id.button_3:
                memory.setTextOnField(3);
                showField();
                break;
            case R.id.button_4:
                memory.setTextOnField(4);
                showField();
                break;
            case R.id.button_5:
                memory.setTextOnField(5);
                showField();
                break;
            case R.id.button_6:
                memory.setTextOnField(6);
                showField();
                break;
            case R.id.button_7:
                memory.setTextOnField(7);
                showField();
                break;
            case R.id.button_8:
                memory.setTextOnField(8);
                showField();
                break;
            case R.id.button_9:
                memory.setTextOnField(9);
                showField();
                break;
            case R.id.button_plus:
                memory.setTextOnField('+');
                showField();
                break;
            case R.id.button_minus:
                memory.setTextOnField('-');
                showField();
                break;
            case R.id.button_composition:
                memory.setTextOnField('×');
                showField();
                break;
            case R.id.button_division:
                memory.setTextOnField('/');
                showField();
                break;
            case R.id.button_dot:
                memory.setTextOnField('.');
                showField();
                break;
            case R.id.button_root:
                memory.setTextOnField('√');
                showField();
                break;
            case R.id.button_percent:
                memory.setTextOnField('%');
                showField();
                break;
            case R.id.button_delete:
                memory.deleteLast();
                showField();
                break;
            case R.id.button_delete_all:
                memory.deleteAll();
                showField();
                break;
            case R.id.button_options:
                Intent intent = new Intent(MainActivity.this, Options.class);
                startActivity(intent);
                break;
//            case R.id.button_equals:
//
//                break;
        }
    }

    private void initButtonAndText(){
        buttonZero = findViewById(R.id.button_0);
        buttonOne = findViewById(R.id.button_1);
        buttonTwo = findViewById(R.id.button_2);
        buttonThree = findViewById(R.id.button_3);
        buttonFour = findViewById(R.id.button_4);
        buttonFive = findViewById(R.id.button_5);
        buttonSix = findViewById(R.id.button_6);
        buttonSeven = findViewById(R.id.button_7);
        buttonEight = findViewById(R.id.button_8);
        buttonNine = findViewById(R.id.button_9);
        buttonPlus = findViewById(R.id.button_plus);
        buttonMinus = findViewById(R.id.button_minus);
        buttonComposition = findViewById(R.id.button_composition);
        buttonDivision = findViewById(R.id.button_division);
        buttonRoot = findViewById(R.id.button_root);
        buttonPercent = findViewById(R.id.button_percent);
        buttonDot = findViewById(R.id.button_dot);
        buttonDelete = findViewById(R.id.button_delete);
        buttonDeleteAll = findViewById(R.id.button_delete_all);
        buttonEquals = findViewById(R.id.button_delete_all);
        calcText = findViewById(R.id.show_result);
        buttonOptions = findViewById(R.id.button_options);

    }

    private void listenerButton(){
        buttonZero.setOnClickListener(this);
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonNine.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonComposition.setOnClickListener(this);
        buttonDivision.setOnClickListener(this);
        buttonRoot.setOnClickListener(this);
        buttonPercent.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonDelete.setOnClickListener(this);
        buttonDeleteAll.setOnClickListener(this);
        buttonEquals.setOnClickListener(this);
        buttonOptions.setOnClickListener(this);
    }

    private void showField(){
        calcText.setText(memory.entryField.toString());
    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle instanceState) {
        super.onSaveInstanceState(instanceState);
        instanceState.putParcelable(KEY, memory);
    }


    @Override
    protected void onRestoreInstanceState(@NonNull Bundle instanceState) {
        super.onRestoreInstanceState(instanceState);
        memory = instanceState.getParcelable(KEY);
        showField();
    }
}