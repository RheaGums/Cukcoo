package com.example.project1;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class price11 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.price11);

        //===== 테스트를 위한 더미 데이터 생성 ===================
        ArrayList<String> testDataSet = new ArrayList<>();
        testDataSet.add("1983 pizza&pub, 백종원피자, 13900원");
        testDataSet.add("1983 pizza&pub, 페퍼로니피자, 13900원");
        testDataSet.add("1983 pizza&pub, 포테이토베이컨피자, 14900원");
        testDataSet.add("1983 pizza&pub, 디아블로피자, 14900원");
        testDataSet.add("1983 pizza&pub, 불고기피자, 14900원");
        testDataSet.add("1983 pizza&pub, 시금치피자, 15900원");
        testDataSet.add("8월의중식, 찹쌀 미니탕수육, 12900원");
        testDataSet.add("남경중화요리, 탕수육, 20000원");
        testDataSet.add("스시마리오, 마리오 모듬스시, 14000원");
        testDataSet.add("스시마리오, 마리오 특 모둠스시, 17000원");
        testDataSet.add("신동랩, 등심+안심가츠, 12500원");
        testDataSet.add("신동랩, 150 스테이크동, 12500원");
        testDataSet.add("신동랩, 안심가츠, 12500원");
        testDataSet.add("신동랩, 사케동, 13900원");
        testDataSet.add("신동랩, 규카츠, 15000원");
        testDataSet.add("신동랩, 화로스테이크동, 19000원");
        //========================================================

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        //---------------------------------------------------------
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context) this);
        recyclerView.setLayoutManager(linearLayoutManager);  // LayoutManager 설정

        CustomAdapter customAdapter = new CustomAdapter(testDataSet);
        recyclerView.setAdapter(customAdapter); // 어댑터 설정
    }
}
