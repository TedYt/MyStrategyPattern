package com.example.tim.strategypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tim.strategypattern.StrategyTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        StrategyTest.test();
    }
}
