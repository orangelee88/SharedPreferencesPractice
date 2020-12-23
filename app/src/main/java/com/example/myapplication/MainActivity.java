package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView m;                //宣告全域變數,// 輸入者結果
    int a = 0, c = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        TextView addText = findViewById( R.id.txt2 );
        TextView Text = findViewById( R.id.textView4 );

        int add = getSharedPreferences( "test", MODE_PRIVATE ).getInt( "number", 0 );

        String b = Integer.toString( add );
        Text.setText( b );

        ImageButton button1 = findViewById( R.id.btn1 );
        button1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText( MainActivity.this, "測試OK", Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent( MainActivity.this, MainActivity2.class );/** 跳下一頁存錢頁面*/
                startActivity( intent );
            }
        } );

        Button button2 = findViewById( R.id.btn2 );
        button2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addText.setText( "HAHA" );
                a = add + c;//add =最後數值
                c++;
                String s = Integer.toString( a );
                Text.setText( s );
                SharedPreferences pref = getSharedPreferences( "test", MODE_PRIVATE );
                pref.edit()
                        .putInt( "number", a )
                        .commit();

                Toast.makeText( MainActivity.this, "HELLO", Toast.LENGTH_SHORT ).show();
            }
        } );
        Button button3 = findViewById( R.id.btn3 );
        button3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a = 0;
                String b = Integer.toString( a );
                Text.setText( b );
                SharedPreferences pref = getSharedPreferences( "test", MODE_PRIVATE );
                pref.edit().clear().commit();
            }
        } );
    }
}