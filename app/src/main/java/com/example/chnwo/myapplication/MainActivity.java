package com.example.chnwo.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{


    //declare all widgets
    private Button buttongo;


    //Change Here
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link widget to UI
        buttongo = (Button) findViewById(R.id.buttongo)
        //start listener
        buttongo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}

// this is johnzzx's test for chnwosu's my app 3