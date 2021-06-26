package smart.simple.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public abstract class Options extends AppCompatActivity{

    private static final String NAME_SHARED_PREFERENCE = "KEY";

    private static final String THEME = "THEME";

    protected static final int FIRST_STYLE = 0;
    protected static final int SECOND_STYLE = 1;
    protected static final int THIRD_STYLE = 2;

    private static Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

//        back.findViewById(R.id.button_back);
//        back.setOnClickListener(v -> {
//            finish();
//        });
    }

}