package com.example.duan1_dinhthianhlinh_ph35049.khachhang;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.duan1_dinhthianhlinh_ph35049.R;
import com.example.duan1_dinhthianhlinh_ph35049.admin.frag.doanhthu;
import com.example.duan1_dinhthianhlinh_ph35049.admin.frag.qlKhachHang;
import com.example.duan1_dinhthianhlinh_ph35049.admin.frag.qlphong;
import com.example.duan1_dinhthianhlinh_ph35049.admin.frag.top10;
import com.example.duan1_dinhthianhlinh_ph35049.khachhang.fragkh.datphong;
import com.example.duan1_dinhthianhlinh_ph35049.khachhang.fragkh.dichvuphong;
import com.example.duan1_dinhthianhlinh_ph35049.khachhang.fragkh.thongtincn;
import com.google.android.material.navigation.NavigationView;

public class ManHinhChinhKH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chinh_kh);

        DrawerLayout drawerLayout = findViewById(R.id.drawerkh);

        NavigationView navigationView = findViewById(R.id.navakh);

        Toolbar toolbar = findViewById(R.id.toolbarkh);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.openkh,R.string.closekh);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                if (item.getItemId() == R.id.datphong){
                    Fragment fragment = new datphong();
                    fragmentManager.beginTransaction().replace(R.id.fragmentkh,fragment).commit();
                }else if (item.getItemId() == R.id.cacdichvu){
                    Fragment fragment = new dichvuphong();
                    fragmentManager.beginTransaction().replace(R.id.fragmentkh,fragment).commit();
                }else{
                    Fragment fragment = new thongtincn();
                    fragmentManager.beginTransaction().replace(R.id.fragmentkh,fragment).commit();
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                setTitle(item.getTitle());

                return false;
            }
        });
    }
}