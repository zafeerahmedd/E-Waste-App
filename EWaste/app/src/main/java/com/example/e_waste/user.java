package com.example.e_waste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
public class user extends AppCompatActivity {
    public class FirstActivity extends AppCompatActivity {
        private EditText inputData;
        private Button sendButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_user);

            inputData = findViewById(R.id.edit_us);
            sendButton = findViewById(R.id.btn_us);

            sendButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String data = inputData.getText().toString();
                    Intent intent = new Intent(user.this, userlogin.class);
                    intent.putExtra("input_data", data);
                    startActivity(intent);
                }
            });
        }
    }}
