package com.example.e_waste;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.e_waste.R;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.ValueEventListener;


import java.util.ArrayList;
import java.util.List;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.ValueEventListener;

public class user_list extends AppCompatActivity {

        private DatabaseReference mDatabaseRef;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_user_list);

            // Initialize the Firebase database reference
            mDatabaseRef = FirebaseDatabase.getInstance().getReference("users");

            // Add a listener to the database reference to retrieve the number of users
            mDatabaseRef.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    // Get the number of users by counting the number of child nodes
                    int numUsers = (int) dataSnapshot.getChildrenCount();

                    // Display the number of users in a TextView
                    TextView numUsersTextView = findViewById(R.id.textView);
                    numUsersTextView.setText("Number of users: " + numUsers);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                    // Handle the error
                }
            });
        }
    }

