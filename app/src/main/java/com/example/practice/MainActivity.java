package com.example.practice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //private int counter = 0;
    private TextView counterView;
    private Button increment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterView = (TextView) findViewById(R.id.counterView);
        increment = (Button) findViewById(R.id.increment);
        MainViewModel mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        /*if(savedInstanceState != null) {
            counter = savedInstanceState.getInt("score");
            counterView.setText(String.valueOf(counter));
        }*/


        int counter = mainViewModel.counter;
        counterView.setText(String.valueOf(counter));


        increment.setOnClickListener(v -> {

            mainViewModel.counter ++;
            counterView.setText(String.valueOf(mainViewModel.counter));
        });
    }

   /* @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("score", counter);
    }*/
}