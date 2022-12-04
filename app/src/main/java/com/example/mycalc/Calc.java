package com.example.mycalc;

public class Calc {
    //fields
    private String baseVal = "0";
    private double currentNum = 0;
    private double lastNum = 0;
    private String result = "0";
    private boolean action = false;
    private String temp = "";
    private boolean sc = false;
    private String history = "";
    //constructors

    public Calc() {
    }

    //getters
    public String getHistory() {
        return history;
    }

    public boolean getSc(){
        return sc;
    }

    public String getTemp() {
        return temp;
    }

    public String getBaseVal() {
        return baseVal;
    }

    public double getCurrentNum() {
        return currentNum;
    }

    public double getLastNum() {
        return lastNum;
    }

    public String getResult() {
        return result;
    }

    public boolean isAction() {
        return action;
    }

    //setters
    public void setHistory(String history) {
        this.history = history;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public void setBaseVal(String baseVal) {
        this.baseVal = baseVal;
    }

    public void setCurrentNum(double currentNum) {
        this.currentNum = currentNum;
    }

    public void setLastNum(double lastNum) {
        this.lastNum = lastNum;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setAction(boolean action) {
        this.action = action;
    }

    public void setSc(boolean sc) {
        this.sc=sc;
    }
    //methods
    public void evenly() {
        currentNum = Double.parseDouble(result);
        storePars("");
        result = "" + calculate();
    }

    public void ac() {
        result = "0";
        action = false;
        sc = false;
        currentNum = 0;
        lastNum = 0;
        history = "";
    }

    public void plus() {
        currentNum = Double.parseDouble(result);
        storePars("+");
        result = "0";
        sc = false;
    }

    public void minus() {
        currentNum = Double.parseDouble(result);
        storePars("-");
        result = "0";
        sc = false;
    }

    public void division() {
        currentNum = Double.parseDouble(result);
        storePars("/");
        result = "0";
        sc = false;
    }

    public void multiplier() {
        currentNum = Double.parseDouble(result);
        storePars("*");
        result = "0";
        sc = false;
    }

    public void sign() {
        currentNum = Double.parseDouble(result);
        currentNum = currentNum * -1;
        out();
    }
//================================== private
    private void storePars(String s) {
        history += " " + currentNum + " " + s;
    }
    private void out() {
        if (currentNum - (long)currentNum == 0)
            result = "" + (long)(currentNum);
        else
            result = "" + (currentNum);
    }
    private double calculate() {

        String list[] = history.split(" ");
        double result = Double.parseDouble(list[1]);
        System.out.println("----->" + result);
        for (int i = 1; i < list.length; i++) {
            if (list[i].equals("*")) {
                result *=  Double.parseDouble(list[i + 1]);
            } else if (list[i].equals("/")){
                result /= Double.parseDouble(list[i + 1]);
            } else if (list[i].equals("+")){
                result += Double.parseDouble(list[i + 1]);
                //System.out.println(" " + list[i - 1] + " / " + list[i + 1]);
            } else if (list[i].equals("-")){
                result -= Double.parseDouble(list[i + 1]);
            }
        }
        return result;
    }

}
