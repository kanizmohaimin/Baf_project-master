package com.example.m.baf_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class profile extends AppCompatActivity {
    private Button save,editname,editrank,editconnumber,editemail,editpreaddress;
    EditText name,bd,rank,bloodgroup,dateofcomission,contactnumber,emailaddress,presentaddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        name=findViewById(R.id.name);
        bd=findViewById(R.id.bd);
        rank=findViewById(R.id.rank);
        bloodgroup=findViewById(R.id.bloodgroup);
        dateofcomission=findViewById(R.id.dateofcomission);
        contactnumber=findViewById(R.id.contactnumber);
        emailaddress=findViewById(R.id.email);
        presentaddress=findViewById(R.id.address);
        save=(Button)findViewById(R.id.save);
        editname=(Button) findViewById(R.id.editname);
        editrank=(Button)findViewById(R.id.editrank);
        editconnumber=(Button)findViewById(R.id.editconumber);
        editemail=(Button)findViewById(R.id.editemail);
        editpreaddress=(Button)findViewById(R.id.editaddress);
        save.setClickable(false);
        editname.setClickable(false);
        editrank.setClickable(false);
        editconnumber.setClickable(false);
        editemail.setClickable(false);
        editpreaddress.setClickable(false);
        editname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save.setClickable(true);
                editname.setClickable(true);
            }
        });
           editrank.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        save.setClickable(true);
                        editrank.setClickable(true);
                    }
        });
        editconnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save.setClickable(true);
                editconnumber.setClickable(true);
            }
        });

        editemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save.setClickable(true);
                editemail.setClickable(true);
            }
        });
        editpreaddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save.setClickable(true);
                editpreaddress.setClickable(true);
            }
        });


        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"saved",Toast.LENGTH_SHORT);
            }
        });


    }
}
