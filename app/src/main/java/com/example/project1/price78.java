package com.example.project1;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class price78 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.price78);

        ArrayList<String> testDataSet = new ArrayList<>();
        testDataSet.add("8월의 중식, 간짜장, 6900원");
        testDataSet.add("8월의 중식, 8월의 짬뽕, 6900원");
        testDataSet.add("8월의 중식, 8월의 볶음밥, 7500원");
        testDataSet.add("나의 유부, 치볶동, 7000원");
        testDataSet.add("남경중화요리, 짜장면, 6000원");
        testDataSet.add("남경중화요리, 짬뽕, 7000원");
        testDataSet.add("남경중화요리, 간짜장, 7000원");
        testDataSet.add("남경중화요리, 우동, 7000원");
        testDataSet.add("남경중화요리, 울면, 7000원");
        testDataSet.add("남경중화요리, 볶음밥, 7500원");
        testDataSet.add("메밀꽃, 순두부찌개, 5500원");
        testDataSet.add("메밀꽃, 김치찌개, 6000원");
        testDataSet.add("메밀꽃, 된장찌개, 6000원");
        testDataSet.add("메밀꽃, 제육덮밥, 6500원");
        testDataSet.add("메밀꽃, 수제돈가스, 7000원");
        testDataSet.add("박지혜 순대국&소머리국밥, 순대국, 7000원");
        testDataSet.add("스시마리오, 알밥, 7000원");
        testDataSet.add("신동랩, 치킨가라아게동, 7000원");
        testDataSet.add("울엄마손칼국시, 닭칼국수, 7500원");
        testDataSet.add("울엄마손칼국시, 얼큰닭칼국수, 7500원");
        testDataSet.add("크라이치즈버거, 더블치즈버거, 5300원");
        testDataSet.add("학교가는길, 치즈라볶이스페셜, 7000원");
        testDataSet.add("학교가는길, 치즈쫄볶이스페셜, 7000원");

        //========================================================

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        //---------------------------------------------------------
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context) this);
        recyclerView.setLayoutManager(linearLayoutManager);  // LayoutManager 설정

        CustomAdapter customAdapter = new CustomAdapter(testDataSet);
        recyclerView.setAdapter(customAdapter); // 어댑터 설정
    }
}
