package com.example.loginapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    EditText user_email, user_password;
    MaterialButton register;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_login);

        /* Initialze the variables that we are using in the layout */
        user_email = findViewById(R.id.user_email);
        user_password = findViewById(R.id.user_password);
        register = findViewById(R.id.Register);

        Log.d("TAG", user_email.getText().toString());
//        Log.d("TAG", user_email.getText().toString());






//        Creating the instance of the firebase class
//        mAuth = FirebaseAuth.getInstance();




//        mAuth.createUserWithEmailAndPassword()
    }
}
