package com.example.camping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }
}


public void previousScreen(view view){
    intent intent=new intent(packageContext:this,MainActivity.class);
    startActivity(intent);
}


public void classe(view view) {
    finish();
}
}