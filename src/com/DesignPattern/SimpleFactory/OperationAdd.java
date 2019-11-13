package com.DesignPattern.SimpleFactory;

public class OperationAdd extends Operation{
    @Override
    protected double getResult() {
        double result = 0;
        result = getNumA() + getNumB();
        return result;
    }
}
