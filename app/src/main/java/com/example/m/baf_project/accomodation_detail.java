package com.example.m.baf_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class accomodation_detail extends AppCompatActivity {

    private TextView mTextMessage;
    View eco;
    View gen;
    View gen2;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    gen.setVisibility(View.GONE);
                    gen2.setVisibility(View.GONE);
                    eco.setVisibility(View.VISIBLE);
                    //mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    gen.setVisibility(View.VISIBLE);
                    eco.setVisibility(View.GONE);
                    gen2.setVisibility(View.GONE);
                   // mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    gen2.setVisibility(View.VISIBLE);
                    eco.setVisibility(View.GONE);
                    gen.setVisibility(View.GONE);
                    // mTextMessage.setText(R.string.title_dashboard);
                    return true;

            }
            return false;
        }
    };

    Button ta2,typea,typeb,typec,ta3,typeaa,typebb,typecc;
    TextView t1,t2,t3,t11,t22,t33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accomodation_detail);
        eco = findViewById(R.id.eco);
        gen = findViewById(R.id.gen);
        gen.setVisibility(View.GONE);
        gen2=findViewById(R.id.gen2);
        gen2.setVisibility(View.GONE);

        ta2 = findViewById(R.id.ta5);
        typea = findViewById(R.id.ta);
        typeb = findViewById(R.id.ta2);
        typec = findViewById(R.id.ta3);
        t1=findViewById(R.id.tadt);
        t2=findViewById(R.id.tadt2);
        t3=findViewById(R.id.tadt3);
        ta3 = findViewById(R.id.tae5);
        typeaa = findViewById(R.id.tae);
        typebb = findViewById(R.id.tae2);
        typecc = findViewById(R.id.tae3);
        t11=findViewById(R.id.tadtt);
        t22=findViewById(R.id.tadtt2);
        t33=findViewById(R.id.tadtt3);





        ta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(accomodation_detail.this, accomadation_form.class);
                startActivity(intent8);
            }
        });
        ta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent88 = new Intent(accomodation_detail.this, accomadation_form.class);
                startActivity(intent88);
            }
        });

        typea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             t1.setText("These A type quarters are provided for Air Commodore and above rank officers");
            }
        });
        typeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText("These B type quarters are provided for Wing Comanders and above officers");
            }
        });
        typec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t3.setText("These A type quarters are provided from Flg offrs to Sqn ldr ranked officers");
            }
        });
        typeaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t11.setText("These A type quarters are provided for WO and above ranks");
            }
        });
        typebb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t22.setText("These B type quarters are provided for Cpl and above");
            }
        });
        typecc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t33.setText("These A type quarters are provided from LAC to above");
            }
        });



        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    }


