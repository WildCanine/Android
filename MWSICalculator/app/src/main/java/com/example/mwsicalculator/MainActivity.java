package com.example.mwsicalculator;

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
        final TextView slopeTextView=(TextView) findViewById(R.id.slopeTextView);
        final TextView yIntTextView=(TextView) findViewById(R.id.yIntTextView);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                double slope=(getY2()-getY1())/(getX2()-getX1());
                slopeTextView.setText(slope+"");
                yIntTextView.setText((getY1()-(slope*getX1()))+"");
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
}
