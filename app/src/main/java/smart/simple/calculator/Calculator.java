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
