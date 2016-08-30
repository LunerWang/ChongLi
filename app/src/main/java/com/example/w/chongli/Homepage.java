package com.example.w.chongli;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;

public class Homepage extends Activity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);


        Button person = (Button) findViewById(R.id.person);
        person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPersonsenter = new Intent(Homepage.this, Personcenter.class);
                startActivity(toPersonsenter);
            }
        });
        Button community= (Button) findViewById(R.id.community);
        community.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toCommunity=new Intent(Homepage.this,Community.class);
                startActivity(toCommunity);
            }
        });

        Button wenhua;
        wenhua= (Button) findViewById(R.id.wenhua);
        wenhua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotowenhua=new Intent(Homepage.this,Wenhua.class);
                startActivity(gotowenhua);
            }
        });

        Button zhusu;
        zhusu= (Button) findViewById(R.id.zhusu);
        zhusu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotozhusu=new Intent(Homepage.this,Zhusu.class);
                startActivity(gotozhusu);
            }
        });

        Button meishi;
        meishi= (Button) findViewById(R.id.meishi);
        meishi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomeishi=new Intent(Homepage.this,Meishi.class);
                startActivity(gotomeishi);
            }
        });

        Button gonglue;
        gonglue= (Button) findViewById(R.id.gonglue);
        gonglue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotogonglue =new Intent(Homepage.this,Gonglue.class);
                startActivity(gotogonglue);
            }
        });

        Button jingdian;
        jingdian= (Button) findViewById(R.id.jingdian);
        jingdian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotojingdian =new Intent(Homepage.this,Jingdian.class);
                startActivity(gotojingdian);
            }
        });

        Button gouwu;
        gouwu= (Button) findViewById(R.id.gouwu);
        gouwu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotogouwu =new Intent(Homepage.this,Gouwu.class);
                startActivity(gotogouwu);
            }
        });

        Button xinwen;
        xinwen= (Button) findViewById(R.id.xinwen);
        xinwen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoxinwen =new Intent(Homepage.this,Xinwen.class);
                startActivity(gotoxinwen);
            }
        });

        Button huodong;
       huodong= (Button) findViewById(R.id.huodong);
        huodong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotohuodong =new Intent(Homepage.this,Huodong.class);
                startActivity(gotohuodong);
            }
        });

        Button topbut;
       topbut= (Button) findViewById(R.id.topbut);
        topbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotowen =new Intent(Homepage.this,Wenhua.class);
                startActivity(gotowen);
            }
        });

        Button sousuo;
        sousuo= (Button) findViewById(R.id.sousuo);
        sousuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Homepage.this , "无法联网，请稍后重试" ,Toast.LENGTH_SHORT).show();
            }
        });

        Button tuijian;
        tuijian= (Button) findViewById(R.id.tuijian);
        tuijian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Homepage.this , "无法联网，请稍后重试" ,Toast.LENGTH_SHORT).show();
            }
        });

    }

}
