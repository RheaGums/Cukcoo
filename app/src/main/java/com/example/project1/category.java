package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class category extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);

        //한식
        Button imageButton5 = (Button) findViewById(R.id.btn5);
        imageButton5.setOnClickListener(new View.OnClickListener() {

            //@Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), korean.class);
                startActivity(intent);
            }

        });
        //중식
        Button imageButton6 = (Button) findViewById(R.id.btn6);
        imageButton6.setOnClickListener(new View.OnClickListener() {

            //@Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), chiness.class);
                startActivity(intent);
            }

        });
        //일식
        Button imageButton7 = (Button) findViewById(R.id.btn7);
        imageButton7.setOnClickListener(new View.OnClickListener() {

            //@Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), japeness.class);
                startActivity(intent);
            }

        });
        //양식
        Button imageButton8 = (Button) findViewById(R.id.btn8);
        imageButton8.setOnClickListener(new View.OnClickListener() {

            //@Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), west.class);
                startActivity(intent);
            }
        });

    }
}
