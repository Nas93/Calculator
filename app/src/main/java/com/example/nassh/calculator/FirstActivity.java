package com.example.nassh.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine,zero,plus,minus,mult,div,point,equal,clear;
    TextView t1,t2,result;

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

        one.setOnClickListener(new );
    }
}
