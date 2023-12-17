package com.example.duan1_dinhthianhlinh_ph35049.admin;

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
import com.google.android.material.navigation.NavigationView;

public class ManHinhChinhAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chinh_admin);


        DrawerLayout drawerLayout = findViewById(R.id.drawer);

        NavigationView navigationView = findViewById(R.id.navadimn);

        Toolbar toolbar = findViewById(R.id.toolbaradmin);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                if (item.getItemId() == R.id.quanliphong){
                    Fragment fragment = new qlphong();
                    fragmentManager.beginTransaction().replace(R.id.fragmentadmin,fragment).commit();
                }else if (item.getItemId() == R.id.quanlikhachhang){
                    Fragment fragment = new qlKhachHang();
                    fragmentManager.beginTransaction().replace(R.id.fragmentadmin,fragment).commit();
                }else if (item.getItemId() == R.id.top10){
                    Fragment fragment = new top10();
                    fragmentManager.beginTransaction().replace(R.id.fragmentadmin,fragment).commit();
                }else {
                    Fragment fragment = new doanhthu();
                    fragmentManager.beginTransaction().replace(R.id.fragmentadmin,fragment).commit();
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                setTitle(item.getTitle());

                return false;
            }
        });
    }
}