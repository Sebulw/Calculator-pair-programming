package com.sda.calculator;


import java.util.Arrays;
import java.util.List;

public class Calculator {

    public int add(String ab) {
        int sum = 0;
        if (ab.equals("")) {
            return 0;
        }
        List<String> list = Arrays.asList(ab.split(","));
        for (String number : list) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }

    public int subtract(String ab) {
        if(ab.equals("")){
            return 0;
        }
        List<String> list = Arrays.asList(ab.split(","));
        int a = Integer.parseInt(list.get(0));
        int b = Integer.parseInt(list.get(1));
        return a-b;
    }

    public int multiply(String ab) {
        if(ab.equals("")){
            return 0;
        }
        List<String> list = Arrays.asList(ab.split(","));
        int a = Integer.parseInt(list.get(0));
        int b = Integer.parseInt(list.get(1));
        return a*b;
    }
}