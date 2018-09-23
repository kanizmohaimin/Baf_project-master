package com.example.m.baf_project;

import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class accomodation_detail extends AppCompatActivity {

    View eco;
    View gen;
    View gen2;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_Officer:
                  // OfficerFragment frag=new OfficerFragment();
                    gen.setVisibility(View.GONE);
                    gen2.setVisibility(View.GONE);
                    eco.setVisibility(View.VISIBLE);


                    // mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_Others:
                    //OtherFragment frag2=new OtherFragment();
                    gen.setVisibility(View.VISIBLE);
                    eco.setVisibility(View.GONE);
                    gen2.setVisibility(View.GONE);

                    //transaction.commit();

                   // mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_Rules:
                   // RulesFragment frag3=new RulesFragment();
                    gen2.setVisibility(View.VISIBLE);
                    eco.setVisibility(View.GONE);
                    gen.setVisibility(View.GONE);
                    //transaction.commit();
                   // mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    Button typea, typeb, typec, ta3, typeaa, typebb, typecc,apply;
    TextView t1, t2, t3, t11, t22, t33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accomodation_detail);



        eco = findViewById(R.id.eco);
        gen = findViewById(R.id.gen);
        gen.setVisibility(View.GONE);
        gen2 = findViewById(R.id.gen2);
        gen2.setVisibility(View.GONE);

        apply=(Button)findViewById(R.id.ta5);

        typea =(Button) findViewById(R.id.ta);
        typeb = (Button)findViewById(R.id.ta2);
        typec =(Button) findViewById(R.id.ta3);

        t1 = findViewById(R.id.tadt);
        t2 = findViewById(R.id.tadt2);
        t3 = findViewById(R.id.tadt3);

        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity14();

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
                t3.setText("These C type quarters are provided from Flg offrs to Sqn ldr ranked officers");
            }
        });
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


    public void openactivity14() {

        Intent intent5 = new Intent(accomodation_detail.this, accomodation_form.class);
        startActivity(intent5);


    }

}
