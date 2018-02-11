package com.example.nassh.calculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
    Button one,two,three,four,five,six,seven,eight,nine,zero,plus,minus,mult,div,point,equal,clear;
    TextView t1,t2,result;
    final char ADDITION = '+' ;
    final char SUBSTRUCTION = '-' ;
    final char MULTIPLICATION = '*' ;
    final char DIVISION = '/' ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        mult = findViewById(R.id.mult);
        div = findViewById(R.id.div);
        point = findViewById(R.id.point);
        equal = findViewById(R.id.equal);
        clear = findViewById(R.id.clear);
        t1 = findViewById(R.id.et1);
        t2 = findViewById(R.id.et2);
        result = findViewById(R.id.result);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);

        one.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString() + ".");
            }
        });


    }

    @Override
    public void onClick(View view) {

    }
}
