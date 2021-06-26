package smart.simple.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Options extends AppCompatActivity implements View.OnClickListener{

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
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_back:
                finish();
                break;
        }

    }


    private void initButton() {
        firstStyle.findViewById(R.id.style_one);
        firstStyle.findViewById(R.id.style_two);
        firstStyle.findViewById(R.id.style_three);
        back.findViewById(R.id.button_back);
    }

    private void listenerButton(){
        firstStyle.setOnLongClickListener(this);
    }
}