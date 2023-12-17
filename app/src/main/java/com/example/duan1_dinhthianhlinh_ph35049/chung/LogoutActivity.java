package com.example.duan1_dinhthianhlinh_ph35049.chung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.duan1_dinhthianhlinh_ph35049.R;

public class LogoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        ImageView imageViewhome = findViewById(R.id.home);
        Button buttondk = findViewById(R.id.dangki);

        buttondk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // thực hiện sự kiện
            }
        });
        imageViewhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogoutActivity.this, LoginActivity.class));
            }
        });
    }
}