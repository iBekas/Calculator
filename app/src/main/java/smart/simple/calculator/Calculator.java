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
    private char action;
    private String number = "";
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
                return val1 * val2;
            case DIVISION:
                return val1 / val2;
            case ROOT:
                return val1 / val1;
            case PERCENT:
                return (val1 / 100) * val2;
            default:
                return val1;
        }
    }

    public void setVal1(double val1) {
        this.val1 = val1;
    }

    public void setVal2(double val2) {
        this.val2 = val2;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
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
