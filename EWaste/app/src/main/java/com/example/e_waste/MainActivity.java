package com.example.e_waste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button button,button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.adminlog);
        button1=(Button) findViewById(R.id.userregister);
        button2=(Button) findViewById(R.id.userlogin);
        button3=findViewById(R.id.driverlog);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAdmin1();
            }

        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openuser();
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openuser1();
            }

        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openuser2();
            }

        });
    }
    public void openAdmin1(){
        Intent intent= new Intent(this,collector_login.class);
        startActivity(intent);
    }
    public void openuser(){
        Intent intent= new Intent(this,userregister.class);
        startActivity(intent);
    }
    public void openuser1(){
        Intent intent= new Intent(this,userlogin.class);
        startActivity(intent);
    }
    public void openuser2(){
        Intent intent= new Intent(this,driverlog.class);
        startActivity(intent);
    }
}