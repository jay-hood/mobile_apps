package com.example.hoodj.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Homework1 extends AppCompatActivity {
    private EditText input;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework1);
    }

    public void printHello(View v){

        input = (EditText)findViewById(R.id.addName);
        output = (TextView)findViewById(R.id.showText);
        output.setText("Hello " + input.getText());
        output.setVisibility(View.VISIBLE);

    }

    public void printGoodbye(View v){

        input = (EditText)findViewById(R.id.addName);
        output = (TextView)findViewById(R.id.showText);
        output.setText("Goodbye " + input.getText());
        output.setVisibility(View.VISIBLE);


    }
}
