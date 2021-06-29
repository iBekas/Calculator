package smart.simple.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculator {

    private final char PLUS = '+';
    private final char MINUS = '-';
    private final char COMPOSITION = '×';
    private final char DIVISION = '/';
    private final char ROOT = '√';
    private final char PERCENT = '%';
    private final char EQUALS = '=';
    private char action;
    private StringBuilder number =new StringBuilder("");
    private double val1;
    private double val2;


    public Calculator() {
        this.action = getAction();
        val1 = 0;
        val2 = 0;
    }

    public double operation(char action, double val1, double val2){
        switch (action){
            case PLUS:
                return val1+= val2;
            case MINUS:
                return val1 - val2;
            case COMPOSITION:
                if (val2 == 0) val1 = 1;
                return val1 * val2;
            case DIVISION:
                if (val2 == 0) val1 = 1;
                return val1 / val2;
            case ROOT:
                if (val2 == 0) //TODO криво работает
                return val1 / val1;
            case PERCENT:
                return (val1 / 100) * val2;
            default:
                return val1;
        }
    }


    public char getEQUALS() {
        return EQUALS;
    }

    public void setVal1(double val1) {
        this.val1 = val1;
    }

    public void setVal2(double val2) {
        this.val2 = val2;
    }

    public String getNumber() {
        return number.toString();
    }

    public void setNumber(String number) {
        this.number.append(number);
    }

    public void clearNumber() {
        this.number.delete(0,this.number.length());
    }

    public double getVal1() {
        return val1;
    }

    public double getVal2() {
        return val2;
    }

    public void setAction(char action) {
        this.action = action;
    }

    public char getPLUS() {
        return PLUS;
    }

    public char getMINUS() {
        return MINUS;
    }

    public char getCOMPOSITION() {
        return COMPOSITION;
    }

    public char getDIVISION() {
        return DIVISION;
    }

    public char getROOT() {
        return ROOT;
    }

    public char getPERCENT() {
        return PERCENT;
    }

    public char getAction() {
        return action;
    }

}
