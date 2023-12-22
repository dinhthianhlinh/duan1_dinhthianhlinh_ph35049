package com.example.duan1_dinhthianhlinh_ph35049.chung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.duan1_dinhthianhlinh_ph35049.R;
import com.example.duan1_dinhthianhlinh_ph35049.admin.ManHinhChinhAdminActivity;
import com.example.duan1_dinhthianhlinh_ph35049.dao.NguoiDungDao;
import com.example.duan1_dinhthianhlinh_ph35049.khachhang.ManHinhChinhKH;

public class LoginActivity extends AppCompatActivity {
    private NguoiDungDao nguoiDungDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button buttondn = findViewById(R.id.dangnhap);

        Button buttondk = findViewById(R.id.dangki);

        EditText editTextten = findViewById(R.id.edttendn);
        EditText editTextpass = findViewById(R.id.edtpassdn);

        nguoiDungDao = new NguoiDungDao(this);


        buttondk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, LogoutActivity.class));
            }
        });

        buttondn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = editTextten.getText().toString();
                String pass = editTextpass.getText().toString();


                boolean check = nguoiDungDao.KiemTraDangNhap(user,pass);

                if (check){
                    startActivity(new Intent(LoginActivity.this,ManHinhChinhAdminActivity.class));
                }else {
                    Toast.makeText(LoginActivity.this, "mật khẩu hoac tên đăng nhập ko đúng ", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}