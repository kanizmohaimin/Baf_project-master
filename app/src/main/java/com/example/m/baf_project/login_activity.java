package com.example.m.baf_project;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class login_activity extends AppCompatActivity {
    private Button eloginbtn;
    private EditText eusername;
    private EditText epassword;
    private FirebaseAuth mAuth;
    private ProgressDialog progressDialog;
    private String email,password;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        eloginbtn=(Button) findViewById(R.id.logintbn);
        eusername=(EditText) findViewById(R.id.username);
        epassword=(EditText) findViewById(R.id.password);
        mAuth=FirebaseAuth.getInstance();
        progressDialog= new ProgressDialog(this);
        eloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                log();
            }
        });

    }

    public void log(){
      /*  email=eusername.getText().toString().trim();
        password=epassword.getText().toString().trim();
        progressDialog.setMessage("Please Wait!!!");
        progressDialog.show();
        final Task<AuthResult> authResultTask = mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            FirebaseUser user = mAuth.getCurrentUser();*/
                            Intent intent2=new Intent(login_activity.this,option_activity.class);
                            startActivity(intent2);

                      /*  } else {
                            Toast.makeText(login_activity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }


                    }
                });
*/
    }
}
