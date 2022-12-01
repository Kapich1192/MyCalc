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
    //constructors

    public Calc() {
    }

    //getters
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

    public void ac() {
        result = "0";
        action = false;
        sc = false;
        currentNum = 0;
        lastNum = 0;
    }

    public void sum() {

      currentNum = Double.parseDouble(result);
      result = "" + (currentNum + lastNum);
      currentNum = Double.parseDouble(result);
      lastNum = currentNum;
    }

    public void minus() {
        currentNum = Double.parseDouble(result);
        result = "" + ( lastNum - currentNum);
        currentNum = Double.parseDouble(result);
        lastNum = currentNum;
    }

}
