package com.example.e_waste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
public class recycle extends AppCompatActivity {


        private TextView textView;

        private DatabaseReference databaseReference;


        private TextView dataDisplay;
        private DatabaseReference databaseRef;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_recycle);

            dataDisplay = findViewById(R.id.text_rec);
            databaseRef = FirebaseDatabase.getInstance().getReference();

            String data = getIntent().getStringExtra("input_data");
            dataDisplay.setText(data);

            databaseRef.child("input_data").setValue(data);
        }
    }
