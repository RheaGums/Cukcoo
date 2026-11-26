package com.example.project1;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class school extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.school);

        ArrayList<String> testDataSet = new ArrayList<>();
        testDataSet.add("학생식당, 글로벌누들, 5000원, 학생미래인재관 2층 위치");
        testDataSet.add("학생식당, 야미덮밥, 6000원, 학생미래인재관 2층 위치");
        testDataSet.add("학생식당, 카츠카츠, 7000원, 학생미래인재관 2층 위치");
        testDataSet.add("교직원식당, 교직원식당, 5500원, 학생미래인재관 1층 위치");
        testDataSet.add("맘스터치, 음식점, 국제관 1층 위치");
        testDataSet.add("공차, 카페, 국제관 1층 위치");
        testDataSet.add("하랑, 카페, 니콜스관 4층 위치");
        testDataSet.add("Gomeplace X 폴바셋, 카페, 국제관 1층");
        testDataSet.add("Gomeplace X 폴바셋, 카페, 학생미래인재관 2층");
        testDataSet.add("CU, 편의점, 학생미래인재관 1층 위치");
        testDataSet.add("emart24, 편의점, 국제관 1층 위치");

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        //---------------------------------------------------------
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context) this);
        recyclerView.setLayoutManager(linearLayoutManager);  // LayoutManager 설정

        CustomAdapter customAdapter = new CustomAdapter(testDataSet);
        recyclerView.setAdapter(customAdapter); // 어댑터 설정
    }
}

