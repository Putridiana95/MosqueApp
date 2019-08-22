package com.diana.mosqueapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView btn_doa;
    private  ImageView btn_sholat;
    private ImageView btn_produk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_doa=(ImageView) findViewById(R.id.Doa);
        btn_doa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(MainActivity.this, DoaHarian.class);
                startActivity(intent);
            }
        });

        btn_sholat=(ImageView) findViewById(R.id.sholat);
        btn_sholat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(MainActivity.this, JadwalSholat.class);
                startActivity(intent);
            }
        });

        btn_produk = (ImageView) findViewById(R.id.produk);
        btn_produk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(MainActivity.this, HalalApp.class);
                startActivity(intent);
            }
        });
    }
}
