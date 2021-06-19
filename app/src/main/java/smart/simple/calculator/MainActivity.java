package smart.simple.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView calcText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onClick(View v) {
        
    }

    private void initButtonAndText(){
        Button buttonZero = findViewById(R.id.button_0);
        Button buttonOne = findViewById(R.id.button_1);
        Button buttonTwo = findViewById(R.id.button_2);
        Button buttonThree = findViewById(R.id.button_3);
        Button buttonFour = findViewById(R.id.button_4);
        Button buttonFive = findViewById(R.id.button_5);
        Button buttonSix = findViewById(R.id.button_6);
        Button buttonSeven = findViewById(R.id.button_7);
        Button buttonEight = findViewById(R.id.button_8);
        Button buttonNine = findViewById(R.id.button_9);
        Button buttonPlus = findViewById(R.id.button_plus);
        Button buttonMinus = findViewById(R.id.button_minus);
        Button buttonComposition = findViewById(R.id.button_composition);
        Button buttonDivision = findViewById(R.id.button_division);
        Button buttonRoot = findViewById(R.id.button_root);
        Button buttonPercent = findViewById(R.id.button_percent);
        Button buttonDot = findViewById(R.id.button_dot);
        Button buttonDelete = findViewById(R.id.button_delete);
        Button buttonDeleteAll = findViewById(R.id.button_delete_all);
        calcText = findViewById(R.id.show_result);
    }
}