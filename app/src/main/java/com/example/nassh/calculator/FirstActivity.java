package com.example.nassh.calculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button plus;
    Button minus;
    Button mult;
    Button div;
    Button equal;
    Button clear;
    TextView t1;
    Double a,b;

    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;

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
        equal = findViewById(R.id.equal);
        clear = findViewById(R.id.clear);
        t1 = findViewById(R.id.et1);



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
            public void onClick(View view) { t1.setText(t1.getText().toString() + "0"); }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if (t1 == null){
                        t1.setText("");
                    }else {
                        a = Double.parseDouble(t1.getText() + "");
                        mAddition = true;
                        t1.setText(null);
                    }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1 == null){
                    t1.setText("");
                }else {
                    a = Double.parseDouble(t1.getText() + "");
                    mSubtract = true;
                    t1.setText(null);
                }
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1 == null){
                    t1.setText("");
                }else {
                    a = Double.parseDouble(t1.getText() + "");
                    mMultiplication = true;
                    t1.setText(null);
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1 == null){
                    t1.setText("");
                }else {
                    a = Double.parseDouble(t1.getText() + "");
                    mDivision = true;
                    t1.setText(null);
                }
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = Double.parseDouble(t1.getText() + "");

                if (mAddition == true){

                    t1.setText(a + b + "");
                    mAddition=false;
                }
                else if (mSubtract == true){

                    t1.setText(a - b + "");
                    mSubtract=false;
                }
                else if (mMultiplication == true){

                    t1.setText(a * b + "");
                    mMultiplication=false;
                }
                else if (mDivision == true){

                    t1.setText(a / b + "");
                    mDivision=false;
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("");
            }
        });


    }

    @Override
    public void onClick(View view) {

    }
}
