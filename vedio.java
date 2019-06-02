package com.example.hp.awslabs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class vedio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vedio);
    }

    public void lab1click(View view) {
        Intent i =new Intent(vedio.this,MainActivity.class);
        startActivity(i);
    }

    public void lab2click(View view) {
        Intent j =new Intent(vedio.this,Lab2.class);
        startActivity(j);
    }

    public void lab3click(View view) {
        Intent i =new Intent(vedio.this,Lab3.class);
        startActivity(i);
    }

    public void lab4click(View view) {
        Intent i =new Intent(vedio.this,Lab4.class);
        startActivity(i);
    }

    public void lab5click(View view) {
        Intent i =new Intent(vedio.this,Lab5.class);
        startActivity(i);
    }

    public void lab6click(View view) {
        Intent i =new Intent(vedio.this,Lab6.class);
        startActivity(i);
    }
}
