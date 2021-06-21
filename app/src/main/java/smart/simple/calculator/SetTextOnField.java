package smart.simple.calculator;

public class SetTextOnField {
    StringBuilder entryField = new StringBuilder();

    private static MainActivity access = new MainActivity();

    void setTextOnField(int number){
        entryField.append(number);
    }

    void setTextOnField(char operation){
        entryField.append(operation);
    }

    void deleteLast(){
        if (entryField.length() != 0) {
            entryField.deleteCharAt(entryField.length()-1);
        }
    }

    void deleteAll(){
        entryField.delete(0,entryField.length());
    }

}
