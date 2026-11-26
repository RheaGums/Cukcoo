package com.example.project1;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class price910 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.price910);

        //===== 테스트를 위한 더미 데이터 생성 ===================
        ArrayList<String> testDataSet = new ArrayList<>();
        testDataSet.add("8월의 중식, 잡채덮밥, 8500원");
        testDataSet.add("박지혜 순대국&소머리국밥, 소내장얼큰순대국, 9000원");
        testDataSet.add("박지혜 순대국&소머리국밥, 양평해장국, 9000원");
        testDataSet.add("박지혜 순대국&소머리국밥, 소머리국밥, 9000원");
        testDataSet.add("박지혜 순대국&소머리국밥, 영양순대국, 10000원");
        testDataSet.add("박지혜 순대국&소머리국밥, 얼큰소머리국밥, 10000원");
        testDataSet.add("새우식탁, 토마토파스타, 8900원");
        testDataSet.add("새우식탁, 까르보나라, 8900원");
        testDataSet.add("새우식탁, 알리오올리오, 8900원");
        testDataSet.add("새우식탁, 새우필라프, 8900원");
        testDataSet.add("새우식탁, 레몬갈릭쉬림프 샐러드, 9000원");
        testDataSet.add("새우식탁, 로제파스타, 9900원");
        testDataSet.add("새우식탁, 에비카레, 8900원");
        testDataSet.add("새우식탁, 에비동, 8900원");
        testDataSet.add("스시마리오, 회덮밥, 8500원");
        testDataSet.add("스시마리오, 나가사끼 우동, 8500원");
        testDataSet.add("스시마리오, 모둠롤(8pcs), 9900원");
        testDataSet.add("스시마리오,  새우롤(8pcs), 9900원");
        testDataSet.add("스시마리오, 게살롤(8pcs), 9900원");
        testDataSet.add("스시마리오, 알탕, 10000원");
        testDataSet.add("신동랩, 항정살쇼가야끼동, 9000원");
        testDataSet.add("신동랩, 230 부타이빠이동, 10900원");
        testDataSet.add("신동랩, 쇼유가츠동, 10900원");
        //========================================================

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        //---------------------------------------------------------
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context) this);
        recyclerView.setLayoutManager(linearLayoutManager);  // LayoutManager 설정

        CustomAdapter customAdapter = new CustomAdapter(testDataSet);
        recyclerView.setAdapter(customAdapter); // 어댑터 설정
    }
}
