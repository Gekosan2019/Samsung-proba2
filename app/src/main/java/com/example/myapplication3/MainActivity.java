package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity{
    private ConstraintLayout cr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cr = findViewById(R.id.root);
        cr.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                cr.setBackgroundColor(Color.GREEN);
                return true;
            }
        });
    }
    /*
    public boolean onTouch(View v, MotionEvent event){
        cr.setBackgroundColor(Color.GREEN);
        return true;
    }
    */
}