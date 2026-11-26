package com.example.project1;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class price56 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.price56);

        //===== 테스트를 위한 더미 데이터 생성 ===================
        ArrayList<String> testDataSet = new ArrayList<>();
        testDataSet.add("8월의 중식, 짜장면, 3900원");
        testDataSet.add("나의 유부, 참치마요, 2500원");
        testDataSet.add("나의 유부, 소고기김치, 2500원");
        testDataSet.add("나의 유부, 쌈장삼겹, 2500원");
        testDataSet.add("나의 유부, 소불고기, 2500원");
        testDataSet.add("나의 유부, 데리장어, 3500원");
        testDataSet.add("나의 유부, 한우육회, 3600원");
        testDataSet.add("나의 유부, 생연어, 3800원");
        testDataSet.add("메밀꽃, 물만두, 4000원");
        testDataSet.add("메밀꽃, 라면(밥), 4500원");
        testDataSet.add("메밀꽃, 쫄면, 4500원");
        testDataSet.add("지지고, 불고기마요, 4500원");
        testDataSet.add("지지고, 라이스, 4500원");
        testDataSet.add("지지고, 누들, 4500원");
        testDataSet.add("지지고, 참치마요, 4500원");
        testDataSet.add("지지고, 불마누들, 4500원");
        testDataSet.add("크라이치즈버거, 햄버거, 3300원");
        testDataSet.add("크라이치즈버거, 치즈버거, 3900원");
        testDataSet.add("탕화쿵푸, 마라탕(100g 당), 1600원");
        testDataSet.add("탕화쿵푸, 마라샹궈(100g 당), 3000원");
        testDataSet.add("학교가는길, 양념공기밥, 1500원");
        testDataSet.add("학교가는길, 야채김밥, 2500원");
        testDataSet.add("학교가는길, 치즈김밥, 3500원");
        testDataSet.add("학교가는길, 참치김밥, 4000원");
        testDataSet.add("학교가는길, 순대, 3500원");
        //========================================================

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        //--- LayoutManager는 아래 3가지중 하나를 선택하여 사용 ---
        // 1) LinearLayoutManager()
        // 2) GridLayoutManager()
        // 3) StaggeredGridLayoutManager()
        //---------------------------------------------------------
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context) this);
        recyclerView.setLayoutManager(linearLayoutManager);  // LayoutManager 설정

        CustomAdapter customAdapter = new CustomAdapter(testDataSet);
        recyclerView.setAdapter(customAdapter); // 어댑터 설정
    }
}
