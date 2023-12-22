package com.example.duan1_dinhthianhlinh_ph35049.dao;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.duan1_dinhthianhlinh_ph35049.database.DbHelper;

public class NguoiDungDao {
    private DbHelper dbHelper;
    private SharedPreferences sharedPreferences;


    public NguoiDungDao(Context context){
        dbHelper = new DbHelper(context);
    }
    // kiểm tra thông tin đăng nhập

    public boolean KiemTraDangNhap(String tennguoidung, String matkhau){

            SQLiteDatabase sqLiteDatabase =dbHelper.getReadableDatabase();

            Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM NGUOIDUNG WHERE tennguoidung  = ? AND matkhau = ?", new String[]{tennguoidung, matkhau}
            );
//            if (cursor.getCount() > 0){
//                cursor.moveToFirst();
//                SharedPreferences.Editor editor = sharedPreferences.edit();
//                 editor.putInt("role", cursor.getInt(7));
//                editor.apply();
//
//            }
            return  cursor.getCount() > 0 ;
        }
}
