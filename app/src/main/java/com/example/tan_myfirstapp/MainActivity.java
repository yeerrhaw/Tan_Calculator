package com.example.tan_myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Var1,Var2;
    Button btnAdd,btnMinus,btnMultiply,btnDivide,btnRemainder;
    TextView answerTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Calculator(View v) {
        answerTxt = (TextView) findViewById(R.id.answerTxt);
        Var1 = (EditText) findViewById(R.id.Var1);
        Var2 = (EditText) findViewById(R.id.Var2);
        double number1=Double.parseDouble(Var1.getText().toString());
        double number2=Double.parseDouble(Var2.getText().toString());
        double answer=0;
        switch (v.getId()) {
            case R.id.btnAdd:
                answer = number1 + number2;
                break;
            case R.id.btnMinus:
                answer = number1 - number2;
                break;
            case R.id.btnMultiply:
                answer = number1 * number2;
                break;
            case R.id.btnDivide:
                answer = number1 / number2;
                break;
            case R.id.btnRemainder:
                answer = number1 % number2;
                break;
        }
               answerTxt.setText(Double.toString(answer));




    }
    }

