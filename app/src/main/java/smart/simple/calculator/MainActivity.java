package smart.simple.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends Options implements View.OnClickListener{

    private TextView calcText;
    private TextView calcTextResult;
    private SetTextOnField memory;
    private Calculator calculator;
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
        calculator = new Calculator();
        initButtonAndText();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setTheme(getAppTheme(styleCode));
        recreate();
    }

    @Override
    protected void onResume() {
        super.onResume();
        listenerButton();
        pasteText();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_0:
                pushFieldAndResult(0,"0");
                break;
            case R.id.button_1:
                pushFieldAndResult(1,"1");
                break;
            case R.id.button_2:
                pushFieldAndResult(2,"2");
                break;
            case R.id.button_3:
                pushFieldAndResult(3,"3");
                break;
            case R.id.button_4:
                pushFieldAndResult(4,"4");
                break;
            case R.id.button_5:
                pushFieldAndResult(5,"5");
                break;
            case R.id.button_6:
                pushFieldAndResult(6,"6");
                break;
            case R.id.button_7:
                pushFieldAndResult(7,"7");
                break;
            case R.id.button_8:
                pushFieldAndResult(8,"8");
                break;
            case R.id.button_9:
                pushFieldAndResult(9,"9");
                break;
            case R.id.button_plus:
                operationOnField(calculator.getPLUS());
                break;
            case R.id.button_minus:
                operationOnField(calculator.getMINUS());
                break;
            case R.id.button_composition:
                operationOnField(calculator.getCOMPOSITION());
                break;
            case R.id.button_division:
                operationOnField(calculator.getDIVISION());
                break;
            case R.id.button_dot:
                // TODO криво читает точку
                pushFieldAndResult('.',".");
                break;
            case R.id.button_root:
                operationOnField(calculator.getROOT());
                break;
            case R.id.button_percent:
                operationOnField(calculator.getPERCENT());
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
            case R.id.button_equals:
                operationOnField(calculator.getEQUALS());
                break;
        }
    }

    private void operationOnField(char operationAction) {
        memory.setTextOnField(operationAction);
        if(calculator.getVal1()==0){
            calculator.setVal1(Double.parseDouble(calculator.getNumber()));
        } else {
            calculator.setVal2(Double.parseDouble(calculator.getNumber()));
        }
        calcTextResult.setText(Double.toString(calculator.operation(calculator.getAction(), calculator.getVal1(), calculator.getVal2())));
        calculator.setVal1(calculator.operation(calculator.getAction(), calculator.getVal1(), calculator.getVal2()));
        calculator.setAction(operationAction);
        calculator.clearNumber();
        showField();
    }

    private void pushFieldAndResult(int num, String number) {
        memory.setTextOnField(num);
        calculator.setNumber(number);
        showField();
    }

    private void pushFieldAndResult(char num, String number) {
        memory.setTextOnField(num);
        calculator.setNumber(number);
        showField();
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
        calcTextResult = findViewById(R.id.show_result_two);
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

    private void pasteText(){
        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();

        if(Intent.ACTION_SEND.endsWith(action)&&type.equals("text/*")){
//            buttonOptions.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
            memory.setTextOnField(intent.getStringExtra(Intent.EXTRA_TEXT));
            showField();
        }
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