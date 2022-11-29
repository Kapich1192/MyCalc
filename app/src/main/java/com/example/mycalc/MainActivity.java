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

        result = findViewById(R.id.result);
        initializeButton();
        numberListener();
        actionListener();


    }

    /*++++++++++++++++++++++++++++++++++++++++++++++++++++*/
    public void initializeButton() {
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

    public void numberListener() {

        num_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "0");
            }
        });

        num_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().equals("0")) {
                    result.setText("1");
                } else
                result.setText(result.getText() + "1");
            }
        });

        num_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(result.getText().equals("0")) {
                    result.setText("2");
                } else
                result.setText(result.getText() + "2");
            }
        });

        num_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(result.getText().equals("0")) {
                    result.setText("3");
                } else
                result.setText(result.getText() + "3");
            }
        });

        num_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(result.getText().equals("0")) {
                    result.setText("4");
                } else
                result.setText(result.getText() + "4");
            }
        });

        num_5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(result.getText().equals("0")) {
                    result.setText("5");
                } else
                result.setText(result.getText() + "5");
            }
        });

        num_6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(result.getText().equals("0")) {
                    result.setText("6");
                } else
                result.setText(result.getText() + "6");
            }
        });

        num_7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(result.getText().equals("0")) {
                    result.setText("7");
                } else
                result.setText(result.getText() + "7");
            }
        });

        num_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().equals("0")) {
                    result.setText("8");
                } else
                result.setText(result.getText() + "8");
            }
        });

        num_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().equals("0")) {
                    result.setText("9");
                } else
                result.setText(result.getText() + "9");
            }
        });
        zap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + ".");
            }
        });
    }

    public void actionListener() {
        AC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (result.getText().equals("0")) {
                    a = 0;
                    b = 0;
                    action = false;
                    result.setText("0");
                } else{
                    a = 0;
                    b = 0;
                    action = false;
                    result.setText( "0");
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(action = true) {
                    b = Double.parseDouble("" + result.getText());
                    a = Calculator.sum(a,b);
                    result.setText(a + "");
                } else if(action = false){
                    action = true;
                    a = Double.parseDouble("" + result.getText());
                    result.setText("0");
                }
            }
        });
    }

    public void is(String res){
        a = Double.parseDouble(res);
        action = true;
        result.setText("" + a);
    }
}