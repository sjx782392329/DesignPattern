package com.DesignPattern.SimpleFactory;

/**
 * Operation 操作类 其他运算的父类，用于解耦
 */
public class Operation {
    private double numA;
    private double numB;

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }

    protected double getResult(){
        double result = 0;
        return result;
    }
}
