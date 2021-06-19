package smart.simple.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView calcText;
    private StringBuilder entryField = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calcText = findViewById(R.id.show_result);
        Button buttonZero = findViewById(R.id.button_0);
        Button buttonOne = findViewById(R.id.button_1);
        Button buttonTwo = findViewById(R.id.button_2);
        Button buttonPlus = findViewById(R.id.button_plus);
        buttonZero.setOnClickListener(this);
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_0:
                entryField.append("0");
                calcText.setText(entryField.toString());
                break;
            case R.id.button_1:
                entryField.append(1);
                calcText.setText(entryField.toString());
                break;
            case R.id.button_2:
                entryField.append(2);
                calcText.setText(entryField.toString());
                break;
            case R.id.button_plus:
                entryField.append("+");
                calcText.setText(entryField.toString());
                break;
        }
    }

//    private void initButtonAndText(){
//        Button buttonZero = findViewById(R.id.button_0);
//        Button buttonOne = findViewById(R.id.button_1);
//        Button buttonTwo = findViewById(R.id.button_2);
//        Button buttonThree = findViewById(R.id.button_3);
//        Button buttonFour = findViewById(R.id.button_4);
//        Button buttonFive = findViewById(R.id.button_5);
//        Button buttonSix = findViewById(R.id.button_6);
//        Button buttonSeven = findViewById(R.id.button_7);
//        Button buttonEight = findViewById(R.id.button_8);
//        Button buttonNine = findViewById(R.id.button_9);
//        Button buttonPlus = findViewById(R.id.button_plus);
//        Button buttonMinus = findViewById(R.id.button_minus);
//        Button buttonComposition = findViewById(R.id.button_composition);
//        Button buttonDivision = findViewById(R.id.button_division);
//        Button buttonRoot = findViewById(R.id.button_root);
//        Button buttonPercent = findViewById(R.id.button_percent);
//        Button buttonDot = findViewById(R.id.button_dot);
//        Button buttonDelete = findViewById(R.id.button_delete);
//        Button buttonDeleteAll = findViewById(R.id.button_delete_all);
//        calcText = findViewById(R.id.show_result);
//    }
}