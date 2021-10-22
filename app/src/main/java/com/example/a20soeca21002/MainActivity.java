package com.example.a20soeca21002;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getSupportActionBar().getTitle(getResources().getString(R.string.title));
        getSupportActionBar().setTitle(getResources().getString(R.string.title));

    }
}