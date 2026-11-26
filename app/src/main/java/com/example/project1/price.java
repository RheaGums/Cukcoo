package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class price extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.price);

        //5천~6천
        Button imageButton9 = (Button) findViewById(R.id.btn9);
        imageButton9.setOnClickListener(new View.OnClickListener() {

            //@Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), price56.class);
                startActivity(intent);
            }

        });
        //7천~8천
        Button imageButton10 = (Button) findViewById(R.id.btn10);
        imageButton10.setOnClickListener(new View.OnClickListener() {

            //@Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), price78.class);
                startActivity(intent);
            }

        });
        //9천~만
        Button imageButton11 = (Button) findViewById(R.id.btn11);
        imageButton11.setOnClickListener(new View.OnClickListener() {

            //@Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), price910.class);
                startActivity(intent);
            }

        });
        //만 이상
        Button imageButton12 = (Button) findViewById(R.id.btn12);
        imageButton12.setOnClickListener(new View.OnClickListener() {

            //@Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), price11.class);
                startActivity(intent);
            }
        });

    }
}
