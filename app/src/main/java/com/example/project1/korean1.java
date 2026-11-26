package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class korean1 extends AppCompatActivity {
    ImageView imageView_server1;
    ImageView imageView_server2;
    ImageView imageView_server3;
    Bitmap bitmap1;
    Bitmap bitmap2;
    Bitmap bitmap3;
    String imageUrl1="https://gsr2022.netlify.app/pic1.jpg";
    String imageUrl2="https://gsr2022.netlify.app/pic2.jpg";
    String imageUrl3="https://gsr2022.netlify.app/pic3.jpg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korean1);
        imageView_server1=findViewById(R.id.imageView_server1);
        imageView_server2=findViewById(R.id.imageView_server2);
        imageView_server3=findViewById(R.id.imageView_server3);

        Thread Thread = new Thread() {
            @Override
            public void run(){
                try{
                    URL url1 = new URL(imageUrl1);
                    HttpURLConnection conn1 = (HttpURLConnection)url1.openConnection();
                    //     HttpURLConnection의 인스턴스가 될 수 있으므로 캐스팅해서 사용한다
                    //     conn.setDoInput(true); //Server 통신에서 입력 가능한 상태로 만듦
                    conn1.connect();
                    InputStream is1 = conn1.getInputStream();
                    //inputStream 값 가져오기
                    bitmap1 = BitmapFactory.decodeStream(is1);
                    // Bitmap으로 반환
                }
                catch (IOException e){
                    e.printStackTrace();
                }

                try{
                    URL url2 = new URL(imageUrl2);
                    HttpURLConnection conn2 = (HttpURLConnection)url2.openConnection();
                    //     HttpURLConnection의 인스턴스가 될 수 있으므로 캐스팅해서 사용한다
                    //     conn.setDoInput(true); //Server 통신에서 입력 가능한 상태로 만듦
                    conn2.connect();
                    InputStream is2 = conn2.getInputStream();
                    //inputStream 값 가져오기
                    bitmap2 = BitmapFactory.decodeStream(is2);
                    // Bitmap으로 반환
                }
                catch (IOException e){
                    e.printStackTrace();
                }

                try{
                    URL url3 = new URL(imageUrl3);
                    HttpURLConnection conn3 = (HttpURLConnection)url3.openConnection();
                    //     HttpURLConnection의 인스턴스가 될 수 있으므로 캐스팅해서 사용한다
                    //     conn.setDoInput(true); //Server 통신에서 입력 가능한 상태로 만듦
                    conn3.connect();
                    InputStream is3 = conn3.getInputStream();
                    //inputStream 값 가져오기
                    bitmap3 = BitmapFactory.decodeStream(is3);
                    // Bitmap으로 반환
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        };
        Thread.start();

        try{
            //join() 호출하여 별도의 작업 Thread가 종료될 때까지 메인 Thread가 기다림
            Thread.join();
            imageView_server1.setImageBitmap(bitmap1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        try{
            //join() 호출하여 별도의 작업 Thread가 종료될 때까지 메인 Thread가 기다림
            Thread.join();
            imageView_server2.setImageBitmap(bitmap2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        try{
            //join() 호출하여 별도의 작업 Thread가 종료될 때까지 메인 Thread가 기다림
            Thread.join();
            imageView_server3.setImageBitmap(bitmap3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
