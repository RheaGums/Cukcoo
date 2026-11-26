package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class korean extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korean);

        Button imageButton13 = (Button) findViewById(R.id.btn13);
        imageButton13.setOnClickListener(new View.OnClickListener() {

            //@Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), korean1.class);
                startActivity(intent);
            }

        });

        Button imageButton14 = (Button) findViewById(R.id.btn14);
        imageButton14.setOnClickListener(new View.OnClickListener() {

            //@Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), korean1.class);
                startActivity(intent);
            }

        });
    }

}