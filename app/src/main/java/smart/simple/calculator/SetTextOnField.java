package smart.simple.calculator;

public class SetTextOnField {

    private MainActivity access = new MainActivity();

    void setTextOnField(int number){
        access.entryField.append(number);
        access.calcText.setText(access.entryField.toString());
    }

    void setTextOnField(char operation){
        access.entryField.append(operation);
        access.calcText.setText(access.entryField.toString());
    }

    void deleteLast(){
        if (access.entryField.length() != 0) {
            access.entryField.deleteCharAt(access.entryField.length()-1);
        }
        access.calcText.setText(access.entryField.toString());
    }

    void deleteAll(){
        access.entryField.delete(0,access.entryField.length());
        access.calcText.setText(access.entryField.toString());
    }

}
