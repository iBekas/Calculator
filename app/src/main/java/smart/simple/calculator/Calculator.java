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

    public Calculator() {
        this.action = getAction();
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
