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
        this.sc = sc;
    }

    //methods
    //================================== actions ==================================================

    public void evenly() {
        currentNum = Double.parseDouble(result);
       // history += result;
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

    public void factorial() {
        currentNum = Double.parseDouble(result);
        storePars("!");
        result = "0";
        sc = false;
    }

    public void pow() {
        currentNum = Double.parseDouble(result);
        storePars("pow");
        result = "0";
        sc = false;
    }

    public void sqrt() {
        currentNum = Double.parseDouble(result);
        storePars("sqrt");
        result = "0";
        sc = false;
    }

    public void fmod() {
        currentNum = Double.parseDouble(result);
        storePars("fmod");
        result = "0";
        sc = false;
    }

    public void floor() {
        currentNum = Double.parseDouble(result);
        storePars("floor");
        result = "0";
        sc = false;
    }

    public void ceil() {
        currentNum = Double.parseDouble(result);
        storePars("ceil");
        result = "0";
        sc = false;
    }

    public void log() {
        currentNum = Double.parseDouble(result);
        storePars("log");
        result = "0";
        sc = false;
    }

    public void exp() {
        currentNum = Double.parseDouble(result);
        storePars("exp");
        result = "0";
        sc = false;
    }

    public void percent() {
        currentNum = Double.parseDouble(result);
        storePars("percent");
        result = "0";
        sc = false;
    }

    public void sin() {
        currentNum = Double.parseDouble(result);
        storePars("sin");
        result = "0";
        sc = false;
    }

    public void cos() {
        currentNum = Double.parseDouble(result);
        storePars("cos");
        result = "0";
        sc = false;
    }

    public void tan() {
        currentNum = Double.parseDouble(result);
        storePars("tan");
        result = "0";
        sc = false;
    }
//================================== private methods ==============================================

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
        for (int i = 1; i < list.length; i++) {
            if (list[i].equals("*")) {
                result *=  Double.parseDouble(list[i + 1]);
            } else if (list[i].equals("/")){
                result /= Double.parseDouble(list[i + 1]);
            } else if (list[i].equals("+")){
                result += Double.parseDouble(list[i + 1]);
            } else if (list[i].equals("-")){
                result -= Double.parseDouble(list[i + 1]);
            } else if (list[i].equals("!")) {
                result = fact(result);
            } else if (list[i].equals("pow")) {
                result = Math.pow(result,Double.parseDouble(list[i+1]));
            } else if (list[i].equals("sqrt")) {
                result = Math.sqrt(result);
            } else if (list[i].equals("fmod")) {
                result = result % Double.parseDouble(list[i+1]);
            } else if (list[i].equals("percent")) {
                result = result / 100 * Double.parseDouble(list[i + 1]);
            } else if (list[i].equals("sin")) {
                result = Math.sin(result);
            } else if (list[i].equals("cos")) {
                result = Math.cos(result);
            } else if (list[i].equals("tan")) {
                result = Math.tan(result);
            } else if (list[i].equals("log")) {
                result = Math.log(result);
            } else if(list[i].equals("floor")) {
                result = Math.floor(result);
            } else if (list[i].equals("ceil")) {
                result = Math.ceil(result);
            } else if (list[i].equals("exp") ) {
                result = Math.exp(result);
            }
        }
        return result;
    }

    private double fact(double num) {
        if(num <= 0 ) return 1;
        if(num == 1) return 1;
        return fact(num - 1) * num;
    }

}
