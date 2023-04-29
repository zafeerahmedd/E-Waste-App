package com.example.e_waste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.e_waste.R;

public class driverlog extends AppCompatActivity {

    private Button btn;
    EditText email,pwd;
    private  String ALLOWED_EMAIL = "Driver123";
    private  String ALLOWED_PASSWORD = "123456";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driverlog);
        email=findViewById(R.id.drv_edit);
        pwd=findViewById(R.id.passwrd_edit);
        btn=(Button) findViewById(R.id.log_button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email1 = email.getText().toString();
                String password = pwd.getText().toString();
                if (email1.equals(ALLOWED_EMAIL) && password.equals(ALLOWED_PASSWORD)) {
                    Intent intent = new Intent(driverlog.this, driver_home.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(driverlog.this, "Invalid email or password", Toast.LENGTH_SHORT).show();
                }

            }

        });

    }

}