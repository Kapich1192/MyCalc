package com.example.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean action = false;
    double a = 0, b = 0, c = 0;
    private TextView result;
    private Button num_1,num_2,num_3,num_4,num_5,num_6,num_7,num_8,num_9,num_0,plus,minus,evenly,AC,zap;
    private double numCurrent, numLast = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calc calc = new Calc();

        initializeViews();
        result.setText(calc.getResult());
        listenAction(calc);
    }

    /*++++++++++++++++++++++++++++++++++++++++++++++++++++*/
    public void initializeViews() {
        result = findViewById(R.id.result);
        AC = findViewById(R.id.AC);
        num_0 = findViewById(R.id.num_0);
        num_1 = findViewById(R.id.num_1);
        num_2 = findViewById(R.id.num_2);
        num_3 = findViewById(R.id.num_3);
        num_4 = findViewById(R.id.num_4);
        num_5 = findViewById(R.id.num_5);
        num_6 = findViewById(R.id.num_6);
        num_7 = findViewById(R.id.num_7);
        num_8 = findViewById(R.id.num_8);
        num_9 = findViewById(R.id.num_9);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        evenly = findViewById(R.id.evenly);
        zap = findViewById(R.id.zap);
    }
    public void listenAction(Calc calc) {
       clickNumber(calc);
       clickStdAction(calc);
       clickMathAction(calc);
       //clickTrigAction();
    }
    public void clickMathAction(Calc calc) {
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.sum();
                result.setText(calc.getResult());
                calc.setSc(false);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.minus();
                result.setText(calc.getResult());
                calc.setSc(false);
            }
        });
    }
    public void clickStdAction(Calc calc) {
        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.ac();
                result.setText(calc.getResult());
            }
        });
    }

    public void clickNumber(Calc calc) {

        num_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //когда это первое число и действие не объявлено
                if(!calc.getSc()) {
                    calc.setResult("0");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                //когда действие объявлено но нет результата
                } else {
                    calc.setResult(calc.getResult() + "0");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });

        num_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (!calc.getSc()) {
                    calc.setResult("1");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                } else {
                    calc.setResult(calc.getResult() + "1");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });

        num_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!calc.getSc()) {
                    calc.setResult("2");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                } else {
                    calc.setResult(calc.getResult() + "2");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });

        num_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!calc.getSc()) {
                    calc.setResult("3");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                } else {
                    calc.setResult(calc.getResult() + "3");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });

        num_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!calc.getSc()) {
                    calc.setResult("4");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                } else {
                    calc.setResult(calc.getResult() + "4");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });

        num_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!calc.getSc()) {
                    calc.setResult("5");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                } else {
                    calc.setResult(calc.getResult() + "5");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });

        num_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!calc.getSc()) {
                    calc.setResult("6");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                } else {
                    calc.setResult(calc.getResult() + "6");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });

        num_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!calc.getSc()) {
                    calc.setResult("7");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                } else {
                    calc.setResult(calc.getResult() + "7");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });

        num_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!calc.getSc()) {
                    calc.setResult("8");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                } else {
                    calc.setResult(calc.getResult() + "8");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });

        num_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!calc.getSc()) {
                    calc.setResult("9");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                } else {
                    calc.setResult(calc.getResult() + "9");
                    result.setText(calc.getResult());
                    calc.setSc(true);
                }
            }
        });
    }
}