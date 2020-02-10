package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void button1Clicked(View view) {
        //Log.i( "Info", "Button Pressed");
        EditText aTextField = (EditText) findViewById(R.id.textField1);
        String s = aTextField.getText().toString();
        Float dollarAmount = Float.parseFloat(s);
        //Toast.makeText(MainActivity.this,aTextField.getText().toString(),Toast.LENGTH_LONG).show();
        goToActivity2(dollarAmount);
    }

    public void goToActivity2(float dollarAmount) {
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("message",dollarAmount);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
