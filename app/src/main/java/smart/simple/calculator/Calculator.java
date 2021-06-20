package smart.simple.calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculator {

    private Map<Character, Float> resultCalculator = new HashMap<>();
    private float result;
    private List list;

    public Calculator() {
    }

    private void initOperations (StringBuilder operations) {
        this.list = new ArrayList(Collections.singleton(operations));
        if(list.contains('+')) this.resultCalculator.put('+', (float) 0);
        //тут еще надо подумать, если первое введное число отрицательное
        if(list.contains('-')) this.resultCalculator.put('-', (float) 0);
        if(list.contains('×')) this.resultCalculator.put('×', (float) 0);
        if(list.contains('/')) this.resultCalculator.put('/', (float) 0);
        if(list.contains('√')) this.resultCalculator.put('√', (float) 0);
        if(list.contains('%')) this.resultCalculator.put('%', (float) 0);
    }

    private void typeOfOperation (StringBuilder operations){

    }



}
