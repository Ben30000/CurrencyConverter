package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String poundsSymbol = "\u00a3";
        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        Float dollarAmount = intent.getFloatExtra("message",0.0f);
        float poundsAmount = Math.round(0.77f*dollarAmount*100.0f)/100.0f;
        textView2.setText(poundsSymbol + " " + Float.toString(poundsAmount));
    }
}
