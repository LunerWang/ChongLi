package com.example.w.chongli;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by w on 2016/6/9.
 */
public class Community extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comnumity);
        Button toHome= (Button) findViewById(R.id.home);
        Button toCommunity= (Button) findViewById(R.id.community);
        toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toHomepage=new Intent(Community.this,Homepage.class);
                startActivity(toHomepage);
            }
        });
        toCommunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPersoncenter=new Intent(Community.this,Personcenter.class);
            }
        });

    }
}
