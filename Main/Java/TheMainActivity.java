package com.example.elevations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TheMainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startSecondActivity(View view)
    {
        Intent secondActivity = new Intent(this, Player_Activity.class);
        startActivity(secondActivity);
    }
}