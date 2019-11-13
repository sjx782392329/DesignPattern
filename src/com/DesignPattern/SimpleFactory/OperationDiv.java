package com.DesignPattern.SimpleFactory;

public class OperationDiv extends Operation {
    @Override
    protected double getResult() {
        double result = 0;
        if (getNumB() == 0){
            try {
                throw new Exception("除数不能为 0！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        result = getNumA() / getNumB();
        return result;
    }
}
