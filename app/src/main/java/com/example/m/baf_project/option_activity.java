package com.example.m.baf_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class option_activity extends AppCompatActivity {
    Button pb,pb1,pb2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_page);
        pb=(Button) findViewById(R.id.myprofile);
        pb1=(Button)findViewById(R.id.accom);
        pb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity();

            }
        });
        pb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity1();

            }
        });
    }
    public void openactivity() {

        Intent intent5 = new Intent(option_activity.this, profile.class);
        startActivity(intent5);


    }
    public void openactivity1() {

        Intent intent6 = new Intent(option_activity.this, accomodation_detail.class);
        startActivity(intent6);


    }



}
