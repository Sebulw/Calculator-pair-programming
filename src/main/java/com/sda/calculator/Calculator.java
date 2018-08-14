package com.sda.calculator;


import com.sda.calculator.exception.MethodDoesNotHaveArgumentException;
import com.sda.calculator.exception.NegativesNotAllowed;

import java.util.Arrays;
import java.util.List;

public class Calculator {




    public int add(String ab) throws MethodDoesNotHaveArgumentException, NegativesNotAllowed {
        if (ab == null || ab.equals("")) {
            throw new MethodDoesNotHaveArgumentException("Brak argumentu");
        }

        int sum = isNegative(ab);
        return sum;
    }

    public int subtract(String ab) {
        if (ab.equals("")) {
            return 0;
        }
        List<String> list = Arrays.asList(ab.split(","));
        int a = Integer.parseInt(list.get(0));
        int b = Integer.parseInt(list.get(1));
        return a - b;
    }

    public int multiply(String ab) {
        if (ab.equals("")) {
            return 0;
        }
        List<String> list = Arrays.asList(ab.split(","));
        int a = Integer.parseInt(list.get(0));
        int b = Integer.parseInt(list.get(1));
        return a * b;
    }

    public int isNegative(String arg) throws NegativesNotAllowed {
        int sum=0;
        int number;
        List<String> list = Arrays.asList(arg.split(","));{
            for (String str : list){
                number =Integer.parseInt(str);
                if(number<0){
                    throw new NegativesNotAllowed("Argument jest ujemnuy");
                }
                sum+=number;
                /*if (number >= 1000) {
                    number=0;
                }
                    sum+=number;*/
            }
        }
        return sum;
    }
}