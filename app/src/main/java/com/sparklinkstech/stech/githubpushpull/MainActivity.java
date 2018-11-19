package com.sparklinkstech.stech.githubpushpull;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("onCreate >> ","");
        //Initial Commit
        //Second Commit
        //Second Commit
        //Fourth Commit
        //Fifth Commit

        int a=10, b = 10;
        int c = a+b;
        Log.e("onDemo >> ","");

        Log.e("Sum = ",""+c);


    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.e("onResume >> ","");
    }
}
