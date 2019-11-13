package com.DesignPattern.SimpleFactory;

public class Main {
    public static void main(String[] args) {
        Operation oper = OperationFactory.createOperation("-");
        oper.setNumA(2.0);
        oper.setNumB(3.0);
        double res = oper.getResult();
        System.out.println(res);
    }
}
