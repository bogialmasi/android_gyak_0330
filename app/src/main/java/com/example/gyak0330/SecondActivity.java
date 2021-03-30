package com.example.gyak0330;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView1 = findViewById(R.id.textView1);

        Bundle extras = getIntent().getExtras();

        if (extras != null){
            textView1.setText(extras.getString("atad"));
        }
    }
}