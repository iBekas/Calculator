package smart.simple.calculator;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public abstract class ThemeChange extends AppCompatActivity {


    private static final String NAME_SHARED_PREFERENCE = "KEY";

    private static final String THEME = "THEME";

    protected static final int FIRST_STYLE = 0;
    protected static final int SECOND_STYLE = 1;
    protected static final int THIRD_STYLE = 2;
    protected int styleCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(getAppTheme(R.style.ThemeСalculator));
    }

    int getAppTheme(int codeStyle) {
        return codeStyleToStyleId(getCodeStyle(codeStyle));
    }

    protected int getCodeStyle(int codeStyle){
        SharedPreferences sharedPref = getSharedPreferences(NAME_SHARED_PREFERENCE, MODE_PRIVATE);
        return sharedPref.getInt(THEME, codeStyle);
    }

    // Сохранение настроек
    protected void setAppTheme(int codeStyle) {
        SharedPreferences sharedPref = getSharedPreferences(NAME_SHARED_PREFERENCE, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(THEME, codeStyle);
        editor.apply();
    }

    private int codeStyleToStyleId(int codeStyle){
        switch(codeStyle){
            case FIRST_STYLE:
                return R.style.ThemeСalculator;
            case SECOND_STYLE:
                return R.style.ThemeMiracle;
            case THIRD_STYLE:
                return R.style.ThemeNight;
            default:
                return R.style.ThemeСalculator;
        }
    }
}
