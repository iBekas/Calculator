package smart.simple.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView calcText;
    private StringBuilder entryField = new StringBuilder();
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_rubber);
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
                setTextOnField(0);
                break;
            case R.id.button_1:
                setTextOnField(1);
                break;
            case R.id.button_2:
                setTextOnField(2);
                break;
            case R.id.button_3:
                setTextOnField(3);
                break;
            case R.id.button_4:
                setTextOnField(4);
                break;
            case R.id.button_5:
                setTextOnField(5);
                break;
            case R.id.button_6:
                setTextOnField(6);
                break;
            case R.id.button_7:
                setTextOnField(7);
                break;
            case R.id.button_8:
                setTextOnField(8);
                break;
            case R.id.button_9:
                setTextOnField(9);
                break;
            case R.id.button_plus:
                setTextOnField('+');
                break;
            case R.id.button_minus:
                setTextOnField('-');
                break;
            case R.id.button_composition:
                setTextOnField('×');
                break;
            case R.id.button_division:
                setTextOnField('/');
                break;
            case R.id.button_dot:
                setTextOnField('.');
                break;
            case R.id.button_root:
                setTextOnField('√');
                break;
            case R.id.button_percent:
                setTextOnField('%');
                break;
            case R.id.button_delete:
                if (entryField.length() != 0) {
                    entryField.deleteCharAt(entryField.length()-1);
                }
                calcText.setText(entryField.toString());
                break;
            case R.id.button_delete_all:
                entryField.delete(0,entryField.length());
                calcText.setText(entryField.toString());
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
    }

    private void setTextOnField(int number){
        entryField.append(number);
        calcText.setText(entryField.toString());
    }

    private void setTextOnField(char operation){
        entryField.append(operation);
        calcText.setText(entryField.toString());
    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle instanceState) {
        super.onSaveInstanceState(instanceState);
        instanceState.putString(KEY, entryField.toString());
    }


    @Override
    protected void onRestoreInstanceState(@NonNull Bundle instanceState) {
        super.onRestoreInstanceState(instanceState);
        calcText.setText(instanceState.getString(KEY));
    }
}