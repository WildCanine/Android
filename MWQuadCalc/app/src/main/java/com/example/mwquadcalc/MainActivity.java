package com.example.mwquadcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button calcBtn=(Button) findViewById(R.id.calcBtn);
        final TextView aTextView=(TextView) findViewById(R.id.aTextView);
        final TextView bTextView=(TextView) findViewById(R.id.bTextView);
        final TextView cTextView=(TextView) findViewById(R.id.cTextView);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                double x1=getX1();
                double y1=getY1();
                double x2=getX2();
                double y2=getY2();
                double x3=getX3();
                double y3=getY3();
                double denom = (x1 - x2) * (x1 - x3) * (x2 - x3);
                double a = (x3 * (y2 - y1) + x2 * (y1 - y3) + x1 * (y3 - y2)) / denom;
                double b = (x3*x3 * (y1 - y2) + x2*x2 * (y3 - y1) + x1*x1 * (y2 - y3)) / denom;
                double c = (x2 * x3 * (x2 - x3) * y1 + x3 * x1 * (x3 - x1) * y2 + x1 * x2 * (x1 - x2) * y3) / denom;
                aTextView.setText("a="+a);
                bTextView.setText("b="+b);
                cTextView.setText("c="+c);
            }
        });
    }
    private double getX1() {
        EditText x1=(EditText) findViewById(R.id.x1EditText);
        return Double.parseDouble(x1.getText().toString());
    }
    private double getY1() {
        EditText y1=(EditText) findViewById(R.id.y1EditText);
        return Double.parseDouble(y1.getText().toString());
    }
    private double getX2() {
        EditText x2=(EditText) findViewById(R.id.x2EditText);
        return Double.parseDouble(x2.getText().toString());
    }
    private double getY2() {
        EditText y2=(EditText) findViewById(R.id.y2EditText);
        return Double.parseDouble(y2.getText().toString());
    }
    private double getX3() {
        EditText x3=(EditText) findViewById(R.id.x3EditText);
        return Double.parseDouble(x3.getText().toString());
    }
    private double getY3() {
        EditText y3=(EditText) findViewById(R.id.y3EditText);
        return Double.parseDouble(y3.getText().toString());
    }
}