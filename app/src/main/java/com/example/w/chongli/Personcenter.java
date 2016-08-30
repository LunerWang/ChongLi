package com.example.w.chongli;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by w on 2016/6/9.
 */
public class Personcenter  extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person_center);
        Button toHome= (Button) findViewById(R.id.home);
        toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toHomepage=new Intent(Personcenter.this,Homepage.class);
                startActivity(toHomepage);
            }
        });
        Button toCommunity= (Button) findViewById(R.id.community);
        toCommunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toCommunitypage=new Intent(Personcenter.this,Community.class);
                startActivity(toCommunitypage);
            }
        });
    }



}
