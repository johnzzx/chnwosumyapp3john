package com.example.chnwo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainjohnActivity extends AppCompatActivity implements View.OnClickListener{

    //declare all widgets
    private Button buttongo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainjohn);

        //link widget to UI
        buttongo = (Button) findViewById(R.id.buttongo);
        //start listener
        buttongo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //this will happen when the button is clicked

        // Toast.makeText(this, "good job!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity (intent);

    }
}
