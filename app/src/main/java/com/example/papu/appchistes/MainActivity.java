package com.example.papu.appchistes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btRandom = (Button) findViewById(R.id.btRandom);
    }

    public void chisteRandom(View v){
        Intent i = new Intent(this, ChisteActivity.class);
        startActivity(i);
    }
}
