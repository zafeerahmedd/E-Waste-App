package com.example.e_waste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.e_waste.R;

public class adminlog extends AppCompatActivity {
    private Button bun,bun2,bun3,bun4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlog);
        bun=(Button) findViewById(R.id.button2);
        bun2=(Button) findViewById(R.id.button1);
        bun3=(Button) findViewById(R.id.button3);
        bun4=(Button) findViewById(R.id.button4);


        bun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAd();
            }

        });
        bun2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAdd();
            }

        });
        bun3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddd();
            }

        });
        bun4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddddd();
            }

        });
    }
    public void openAd(){
        Intent intent= new Intent(this,driver_list.class);
        startActivity(intent);
    }
    public void openAdd(){
        Intent intent= new Intent(this,user_list.class);
        startActivity(intent);
    }
    public void openAddddd(){
        Intent intent= new Intent(this,update_bin.class);
        startActivity(intent);
        finish();
    }
    public void openAddd(){
        Intent intent= new Intent(this,update_bin.class);
        startActivity(intent);
    }

}