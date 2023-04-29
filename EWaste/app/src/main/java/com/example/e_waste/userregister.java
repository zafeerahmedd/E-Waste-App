package com.example.e_waste;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.e_waste.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class userregister extends AppCompatActivity {


    FirebaseAuth mAuth;
    private EditText mfNameEditText;
    private EditText mlNameEditText;
    private EditText mnumEditText;
    private EditText mEmailEditText;
    private EditText mAddressEditText;
    private EditText mPasswordEditText;
    private Button mRegisterButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userregister);
        mEmailEditText = findViewById(R.id.email_edit_text);
        mPasswordEditText = findViewById(R.id.password_edit_text);
        mAddressEditText=findViewById(R.id.address_edit_text);
        mfNameEditText=findViewById(R.id.fname_edit_text);
        mlNameEditText=findViewById(R.id.lname_edit_text);
        mRegisterButton = findViewById(R.id.register_button);

        mAuth = FirebaseAuth.getInstance();

        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = mEmailEditText.getText().toString().trim();
                String password = mPasswordEditText.getText().toString().trim();
                String fname = mfNameEditText.getText().toString();
                String lname = mlNameEditText.getText().toString();
                String address = mAddressEditText.getText().toString();
//                String password = mPasswordEditText.getText().toString();
                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // User registered successfully
                                    Toast.makeText(userregister.this, "Registration successful", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(userregister.this, userlogin.class));
                                    finish();
                                } else {
                                    // Handle registration error
                                    Toast.makeText(userregister.this, "Registration failed", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });
    }
}
