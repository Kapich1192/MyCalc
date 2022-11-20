package com.example.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    private Button num_1,num_2,num_3,num_4,num_5,num_6,num_7,num_8,num_9,num_0,plus,minus,evenly,AC;
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
                result.setText(result.getText() + "1");
            }
        });

        num_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                result.setText(result.getText() + "2");
            }
        });

        num_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                result.setText(result.getText() + "3");
            }
        });

        num_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                result.setText(result.getText() + "4");
            }
        });

        num_5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "5");
            }
        });

        num_6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                result.setText(result.getText() + "6");
            }
        });

        num_7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "7");
            }
        });

        num_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "8");
            }
        });

        num_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "9");
            }
        });
    }

    public void actionListener() {
        AC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                result.setText( "0");
            }
        });
    }
}