package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView m;                //宣告全域變數,// 輸入者結果
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );



        Button button1 =findViewById( R.id.btn1 );
        button1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( MainActivity2.this, MainActivity.class );/** 跳下一頁存錢頁面*/
                startActivity( intent );
                Toast.makeText( MainActivity2.this, "返回", Toast.LENGTH_SHORT ).show();
            }
        } );


    }
}