package com.example.unittestcasestwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next = (Button) findViewById(R.id.next);

/*double a=22,b=11;
        addTwoNumbers(a,b);
        subtractTwoNumbers(a,b);
        multiplyTwoNumbers(a,b);
        divideTwoNumbers(a,b);
        calculatePercentage(a);*/
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Second.class);
                startActivity(i);
            }
        });

    }

    public double addTwoNumbers(double a, double b) {
        return a + b;
    }

    public double subtractTwoNumbers(double a, double b) {
        return a - b;
    }

    public double multiplyTwoNumbers(double a, double b) {
        return a * b;
    }

    public double divideTwoNumbers(double a, double b) {
        return a / b;
    }

    public double calculatePercentage(double a) {
        return a / 100;
    }
}