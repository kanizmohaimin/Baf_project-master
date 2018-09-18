package com.example.m.baf_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class updateinfo extends AppCompatActivity {
    private Button save;
    EditText email,number,email1,new_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updateinfo);
        save=(Button)findViewById(R.id.save);
        email=findViewById(R.id.email1);
        number=findViewById(R.id.number1);
        email1=findViewById(R.id.email2);
        new_number=findViewById(R.id.number2);
        save.setClickable(false);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals("") || email1.getText().toString().equals("")
                        ||number.getText().toString().equals("")||new_number.getText().toString().equals("")
                        || number.getText().toString().length()<11||new_number.getText().toString().length()<11) {
                    Toast.makeText(updateinfo.this,"Saved",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(updateinfo.this,"enter data in correctly",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
