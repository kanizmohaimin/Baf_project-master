package com.example.m.baf_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class profile extends AppCompatActivity {
    private Button up;
    EditText name,bd,rank,bloodgroup,dateofcomission,contactnumber,emailaddress,presentaddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        name=findViewById(R.id.name);
        bd=findViewById(R.id.bd);
       // rank=findViewById(R.id.);
        bloodgroup=findViewById(R.id.bloodgroup);
        dateofcomission=findViewById(R.id.dateofcomission);
        contactnumber=findViewById(R.id.contactnumber);
        emailaddress=findViewById(R.id.email);
        presentaddress=findViewById(R.id.address);
        up=(Button)findViewById(R.id.update);





        //up.setClickable(false);

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity22();

            }
        });
    }
    public void openactivity22() {

        Intent intent50 = new Intent(profile.this, updateinfo.class);
        startActivity(intent50);


    }
}
