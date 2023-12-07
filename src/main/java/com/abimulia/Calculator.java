package com.abimulia;

public class Calculator {
    public int add(int x, int y){
        return x+y;
    }

    public int subtract(int x, int y){
        return x-y;
    }

    public int multipy(int x, int y){
        return x*y;
    }

    public int divide(int x, int y){
        if (y==0) {
            throw new IllegalArgumentException("Ints cannot be divided by zero");
        }
        return x/y;
    }

    public boolean isEven(int x){
        return x % 2 == 0;
    }

    public int[] incrementArray(int[] values){
        int[] newValues = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i] +1;
        }
        return newValues;

    }
}
