package com.example.mindsharpener;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void i3 (View v){
        View a = findViewById(R.id.radioButton_i3);//tekan butang i3
        Random random = new Random();
        int no1 = random.nextInt(10);
        ((TextView)findViewById(R.id.textViewN1)).setText(String.valueOf(no1));
        Random random2 = new Random();
        int no2 = random2.nextInt(10);
        ((TextView)findViewById(R.id.textViewN3)).setText(String.valueOf(no2));
        Random random3 = new Random();
        int no3 = random2.nextInt(3);
        if(no3 == 0){
            ((TextView)findViewById(R.id.textViewN2)).setText("+");
        } else if (no3 == 1) {
            ((TextView)findViewById(R.id.textViewN2)).setText("-");
        } else {
            ((TextView)findViewById(R.id.textViewN2)).setText("*");
        }

    }
    public void i5 (View v){
        View a = findViewById(R.id.radioButton_i5);//tekan butang i5
        Random random = new Random();
        int no1 = random.nextInt(100);
        ((TextView)findViewById(R.id.textViewN1)).setText(String.valueOf(no1));
        Random random2 = new Random();
        int no2 = random2.nextInt(100);
        ((TextView)findViewById(R.id.textViewN3)).setText(String.valueOf(no2));
        Random random3 = new Random();
        int no3 = random2.nextInt(3);
        if(no3 == 0){
            ((TextView)findViewById(R.id.textViewN2)).setText("+");
        } else if (no3 == 1) {
            ((TextView)findViewById(R.id.textViewN2)).setText("-");
        } else {
            ((TextView)findViewById(R.id.textViewN2)).setText("*");
        }

    }
    public void i7 (View v){
        View a = findViewById(R.id.radioButton_i7);//tekan butang i7
        Random random = new Random();
        int no1 = random.nextInt(1000);
        ((TextView)findViewById(R.id.textViewN1)).setText(String.valueOf(no1));
        Random random2 = new Random();
        int no2 = random2.nextInt(1000);
        ((TextView)findViewById(R.id.textViewN3)).setText(String.valueOf(no2));
        Random random3 = new Random();
        int no3 = random2.nextInt(3);
        if(no3 == 0){
            ((TextView)findViewById(R.id.textViewN2)).setText("+");
        } else if (no3 == 1) {
            ((TextView)findViewById(R.id.textViewN2)).setText("-");
        } else {
            ((TextView)findViewById(R.id.textViewN2)).setText("*");
        }

    }



}