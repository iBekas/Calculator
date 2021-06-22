package smart.simple.calculator;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

class SetTextOnField{ //  в данном случае я осознанно ограничиваю пакетом, если я не прав поправьте меня. Не вижу здесь надобности в других модификаторах.
    StringBuilder entryField = new StringBuilder();

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

//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//
//    }
}
