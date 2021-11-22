package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ADD(View v){
       EditText et1  = (EditText) findViewById(R.id.editTextNumber);
        EditText et2  = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3  = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1+n2;

        et3.setText("Total value :"+result);

    }

    public void SUB(View v){
        EditText et1  = (EditText) findViewById(R.id.editTextNumber);
        EditText et2  = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3  = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1-n2;

        et3.setText("Total Subtract value :"+result);

    }

    public void MULTIPLY(View v){
        EditText et1  = (EditText) findViewById(R.id.editTextNumber);
        EditText et2  = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3  = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1*n2;

        et3.setText("Total Multiply value :"+result);

    }

    public void DIVIDE(View v){
        EditText et1  = (EditText) findViewById(R.id.editTextNumber);
        EditText et2  = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3  = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1/n2;

        et3.setText("Total Divide value :"+result);

    }
}