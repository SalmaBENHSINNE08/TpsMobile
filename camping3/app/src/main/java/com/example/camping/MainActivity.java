package com.example.camping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


public void nextScreen(view view ) {
    intent intent=new intent(PackageContext:this,activity2.class);
    startActivity(intent);
}
