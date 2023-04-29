package com.example.e_waste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class collector_login extends AppCompatActivity {
    private Button btn;
    EditText email,pwd;
    private  String ALLOWED_EMAIL = "mubeen1601";
    private  String ALLOWED_PASSWORD = "123456";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collector_login);
        email=findViewById(R.id.clt_edit);
        pwd=findViewById(R.id.password_edit);
        btn=(Button) findViewById(R.id.login_button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email1 = email.getText().toString();
                String password = pwd.getText().toString();
                if (email1.equals(ALLOWED_EMAIL) && password.equals(ALLOWED_PASSWORD)) {
                    Intent intent = new Intent(collector_login.this, adminlog.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(collector_login.this, "Invalid email or password", Toast.LENGTH_SHORT).show();
                }

            }

        });

    }

}
