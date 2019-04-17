package com.example.mwfirstappaddition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addBtn=(Button) findViewById(R.id.addBtn);
        Button subBtn=(Button) findViewById(R.id.subBtn);
        Button mulBtn=(Button) findViewById(R.id.mulBtn);
        Button divBtn=(Button) findViewById(R.id.divBtn);
        Button remBtn=(Button) findViewById(R.id.remBtn);
        Button expBtn=(Button) findViewById(R.id.expBtn);
        final TextView resultTextView=(TextView) findViewById(R.id.resultTextView);
        addBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                resultTextView.setText(getNumberOne()+getNumberTwo()+"");
            }
        });
        subBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                resultTextView.setText(getNumberOne()-getNumberTwo()+"");
            }
        });
        mulBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                resultTextView.setText(getNumberOne()*getNumberTwo()+"");
            }
        });
        divBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                resultTextView.setText(getNumberOne()/getNumberTwo()+"");
            }
        });
        remBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                resultTextView.setText(getNumberOne()%getNumberTwo()+"");
            }
        });
        expBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                resultTextView.setText(Math.pow(getNumberOne(),getNumberTwo())+"");
            }
        });
    }
    private double getNumberOne() {
        EditText num1=(EditText) findViewById(R.id.firstNumEditText);
        return Double.parseDouble(num1.getText().toString());
    }
    private double getNumberTwo() {
        EditText num2=(EditText) findViewById(R.id.secondNumEditText);
        return Double.parseDouble(num2.getText().toString());
    }
}
