package com.example.m.baf_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class accomodation_panel extends AppCompatActivity {
    private Button applyforquarter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accomodation_panel);
       applyforquarter=findViewById(R.id.ta5);
        applyforquarter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity6();

            }
        });
    }

    public void openactivity6() {

        Intent intent = new Intent(this, accomadation_form.class);
        startActivity(intent);


    }
}
