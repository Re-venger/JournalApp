package com.example.loginapp;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.FirebaseAuth;

public class LoginAct extends AppCompatActivity {

    EditText user_email, user_password;
    MaterialButton register;
    private FirebaseAuth mAuth;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /* Initialze the variables that we are using in the layout */
        user_email = findViewById(R.id.user_email);
        user_password = findViewById(R.id.user_password);
        register = findViewById(R.id.Register);


        progressDialog = new ProgressDialog(this);

        /*Firebase Auth Instance is created here */
        mAuth = FirebaseAuth.getInstance();


        register.setOnClickListener(view -> {

            progressDialog.show();
            String email = user_email.getText().toString();
            String password = user_password.getText().toString();
            if (email.equals(" ") || password.equals(" "))
            {
                AlertDialog alertDialog = new AlertDialog.Builder(LoginAct.this).create();
                Toast.makeText(LoginAct.this, "Above Fields Cannot be Blank", Toast.LENGTH_SHORT).show();
            }
            else {
                mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        Toast.makeText(LoginAct.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginAct.this, MainActivity.class);
                        startActivity(intent);
                        progressDialog.cancel();
                        finish();
                    } else {
                        Toast.makeText(LoginAct.this, "Registration Failed", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });

    }

}