package com.example.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button calcBtn=(Button)findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.mwfirstappaddition");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                }
            }
        });
        Button mbcalcBtn=(Button)findViewById(R.id.mbcalcBtn);
        mbcalcBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.mwsicalculator");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                }
            }
        });
        Button quadcalcBtn=(Button)findViewById(R.id.quadcalcBtn);
        quadcalcBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.mwquadcalc");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                }
            }
        });
        Button listBtn=(Button)findViewById(R.id.listBtn);
        listBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.mainactivity");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                }
            }
        });
        Button googleBtn=(Button)findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String google="https://www.google.com";
                Uri webAddress=Uri.parse(google);
                Intent goToGoogle=new Intent(Intent.ACTION_VIEW, webAddress);
                if(goToGoogle.resolveActivity(getPackageManager())!=null) {
                    startActivity(goToGoogle);
                }
            }
        });
    }
}
// Intent startIntent=new Intent(getApplicationContext(), SecondActivity.class);
// startIntent.putExtra("com.example.quicklauncher.SOMETHING","I AM AWESOME ANDROID DEVELOPER MATTHEW WOODALL!");
// startActivity(startIntent);