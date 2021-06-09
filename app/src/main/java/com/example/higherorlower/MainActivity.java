package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void generateRandomNumber(){
        Random r = new Random();
        randomNumber = r.nextInt(21);
    }

    public void guessFunction(View v){

        EditText et = (EditText) findViewById(R.id.editTextNumber);
        String guessValue = et.getText().toString();
        int ans = Integer.parseInt(guessValue);

        String msg;

        if(ans > randomNumber){
            msg =  "Lower!";
        }else if(ans < randomNumber){
            msg = "Higher!";
        }else{
            msg = "You got it. Congrats!";
            generateRandomNumber();
        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber();
    }
}