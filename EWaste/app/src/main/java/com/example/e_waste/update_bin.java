package com.example.e_waste;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class update_bin extends AppCompatActivity {
    Button btninst,btnv;
    EditText name1,email,details;
    DatabaseReference databaseUsers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_bin);
        btninst=findViewById(R.id.btninsrt);
        btnv=findViewById(R.id.btnview);
        name1=findViewById(R.id.edtname);
        email=findViewById(R.id.email1);
        details=findViewById((R.id.detail));
        databaseUsers= FirebaseDatabase.getInstance().getReference();

        btninst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InsertData();

            }
        });
        btnv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(update_bin.this, UserL.class);
                startActivity(intent);
                finish();
            }
        });


    }

    private void InsertData() {
        String Usernam=name1.getText().toString();
        String Useremail=email.getText().toString();
        String Userdetail=details.getText().toString();
        String id=databaseUsers.push().getKey();
        user1 user=new user1(Usernam,Useremail,Userdetail);
        databaseUsers.child("users").child(id).setValue(user)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(update_bin.this,"Inserted Successfully",Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }
}