package com.example.translator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button num = findViewById(R.id.button);
        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numIntent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numIntent);
            }
        });
        Button para = findViewById(R.id.button2);
        para.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paraIntent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(paraIntent);
            }
        });
    }
}
