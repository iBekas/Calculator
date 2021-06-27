package smart.simple.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Options extends ThemeChange implements View.OnClickListener{

    private RadioButton firstStyle;
    private RadioButton secondStyle;
    private RadioButton thirdStyle;
    private Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        initButton();
    }

    @Override
    protected void onResume() {
        super.onResume();
        listenerButton();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_back:
                finish();
                break;
            case R.id.style_one:
                setAppTheme(FIRST_STYLE);
                styleCode = FIRST_STYLE;
                recreate();
                break;
            case R.id.style_two:
                setAppTheme(SECOND_STYLE);
                styleCode = SECOND_STYLE;
                recreate();
                break;
            case R.id.style_three:
                setAppTheme(THIRD_STYLE);
                styleCode = THIRD_STYLE;
                recreate();
                break;
        }

    }


    private void initButton() {
        firstStyle = findViewById(R.id.style_one);
        secondStyle = findViewById(R.id.style_two);
        thirdStyle = findViewById(R.id.style_three);
        back = findViewById(R.id.button_back);
    }

    private void listenerButton(){
        firstStyle.setOnClickListener(this);
        secondStyle.setOnClickListener(this);
        thirdStyle.setOnClickListener(this);
        back.setOnClickListener(this);
    }
}