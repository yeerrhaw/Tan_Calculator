package com.example.Tan_CalculatorWorking;

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
        answerTxt = (TextView) findViewById(R.id.answerTxt);
        Var1 = (EditText) findViewById(R.id.Var1);
        Var2 = (EditText) findViewById(R.id.Var2);


    }


    public void Calculator(View v) {
        answerTxt = (TextView) findViewById(R.id.answerTxt);
        Var1 = (EditText) findViewById(R.id.Var1);
        Var2 = (EditText) findViewById(R.id.Var2);
        double Num1 = Float.parseFloat(Var1.getText().toString());
        double Num2 = Float.parseFloat(Var2.getText().toString());
        double result = 0;
        switch (v.getId()) {
            case R.id.btnAdd:
                Add(result,Num1,Num2);
                break;
            case R.id.btnMinus:
                Subtract(result,Num1,Num2);
                break;
            case R.id.btnMultiply:
                Multiply(result,Num1,Num2);
                break;
            case R.id.btnDivide:
                Divide(result,Num1,Num2);
                break;
            case R.id.btnRemainder:
                Remainder(result,Num1,Num2);
                break;
        }
    }
    public void Add(double a, double b, double c){
        a = b + c;
        answerTxt.setText(Double.toString(a));
    }
    public void Subtract(double a, double b, double c){
        a = b - c;
        answerTxt.setText(Double.toString(a));
    }
    public void Multiply(double a, double b, double c){
        a = b * c;
        answerTxt.setText(Double.toString(a));
    }
    public void Divide(double a, double b, double c){
        a = b / c;
        answerTxt.setText(Double.toString(a));
    }
    public void Remainder(double a, double b, double c){
        a = b % c;
        answerTxt.setText(Double.toString(a));
    }
}


