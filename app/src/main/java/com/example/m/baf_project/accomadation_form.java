package com.example.m.baf_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class accomadation_form extends AppCompatActivity {
    private Button submit;
    private EditText name,number,bd,rank,dateofapply,base,email,dateofcomission,children_no,address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accomadation_form);
        name=findViewById(R.id.name);
        bd=findViewById(R.id.bd);
        rank=findViewById(R.id.rank);
        dateofapply=findViewById(R.id.dateofapply);
        number=findViewById(R.id.contactnumber);
        base=findViewById(R.id.base);
        email=findViewById(R.id.email);
        address=findViewById(R.id.presentaddress);
        dateofcomission=findViewById(R.id.dateofcomission);
        children_no=findViewById(R.id.noofchildren);
        submit=(Button) findViewById(R.id.sub);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().equals("") || number.getText().toString().equals("") || number.getText().toString().length()<11
                        ||bd.getText().toString().equals("")||rank.getText().toString().equals("")||base.getText().toString().equals("")
                        ||dateofapply.getText().toString().equals("")||dateofcomission.getText().toString().equals("")||address.getText().toString().equals("")
                        ||children_no.getText().toString().equals("")||email.getText().toString().equals("")) {
                    Toast.makeText(accomadation_form.this,"Succesfully Submitted.Email will be sent within 48 hours",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(accomadation_form.this,"enter data in correct way",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
