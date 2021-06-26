package smart.simple.calculator;


import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;


class SetTextOnField implements Parcelable{ //  в данном случае я осознанно ограничиваю пакетом, если я не прав поправьте меня. Не вижу здесь надобности в других модификаторах.
    StringBuilder entryField;

    public SetTextOnField() {
        this.entryField = new StringBuilder();
    }

    protected SetTextOnField(Parcel in) {
        entryField = this.entryField.append(in.readString());
    }

    public static final Creator<SetTextOnField> CREATOR = new Creator<SetTextOnField>() {
        @Override
        public SetTextOnField createFromParcel(Parcel in) {
            return new SetTextOnField(in);
        }

        @Override
        public SetTextOnField[] newArray(int size) {
            return new SetTextOnField[size];
        }
    };

    void setTextOnField(int number){
        this.entryField.append(number);
    }

    void setTextOnField(char operation){
        this.entryField.append(operation);
    }

    void deleteLast(){
        if (this.entryField.length() != 0) {
            this.entryField.deleteCharAt(this.entryField.length()-1);
        }
    }

    void deleteAll(){
        this.entryField.delete(0,this.entryField.length());
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
