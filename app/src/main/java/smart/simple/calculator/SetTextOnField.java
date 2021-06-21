package smart.simple.calculator;

public class SetTextOnField {

    void setTextOnField(int number){
        MainActivity.entryField.append(number);
        MainActivity.calcText.setText(MainActivity.entryField.toString());
    }

    void setTextOnField(char operation){
        MainActivity.entryField.append(operation);
        MainActivity.calcText.setText(MainActivity.entryField.toString());
    }
}
