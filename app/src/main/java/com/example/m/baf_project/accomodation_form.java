package com.example.m.baf_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class accomodation_form extends AppCompatActivity {
    private Button submit;
    private EditText name,number,bd,rank,dateofapply,base,email,dateofcomission,children_no,address;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accomodation_form);



        submit=(Button) findViewById(R.id.sub);
        name = (EditText)findViewById(R.id.name);
        number = (EditText)findViewById(R.id.contactnumber);
        bd = (EditText)findViewById(R.id.bd);
        dateofapply = (EditText)findViewById(R.id.dateofapply);
        dateofcomission = (EditText)findViewById(R.id.dateofcommision);
        children_no = (EditText)findViewById(R.id.noofchildren);
        address = (EditText)findViewById(R.id.presentaddress);
        base = (EditText)findViewById(R.id.base);
        email = (EditText)findViewById(R.id.email1);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().equals("") || number.getText().toString().equals("") || number.getText().toString().length()<11
                || bd.getText().toString().equals("") || dateofcomission.getText().toString().equals("") ||
                        dateofapply.getText().toString().equals("") || children_no.getText().toString().equals("") ||
                        address.getText().toString().equals("") || base.getText().toString().equals("") ||
                        email.getText().toString().equals("")){
                    Toast.makeText(accomodation_form.this,"Succesfully Submitted.Email will be sent within 48 hours",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(accomodation_form.this,"enter data correctly",Toast.LENGTH_SHORT).show();
                }
            }
        });






    }
}
