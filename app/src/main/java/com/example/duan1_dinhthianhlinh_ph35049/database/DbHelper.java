package com.example.duan1_dinhthianhlinh_ph35049.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(@Nullable Context context) {
        super(context, "QLKS", null, 3);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        String nguoidung = "CREATE TABLE NGUOIDUNG(idnd primary key autoincrement," +
                " tennguoidung text ," +
                "matkhau text , " +
                "ngaysinh text , " +
                "gioitinh text , " +
                "email text ," +
                " sdt text ," +
                "role integer)";
        db.execSQL(nguoidung);
        db.execSQL("INSERT INTO NGUOIDUNG VALUES (1,'dinhlinh','1256','29/12/2004','nu','linh@gmail.com','0357103658',1)," +
                        "(2,'ngocanh','13456','20/02/2004','nu','anh@gmail.com','0357103659',2)," +
                        "(3,'thanhdat','1209','02/11/2004','nam','dat@gmail.edu.vn','0357103669',2)");



//        String datphong = "CREATE TABLE DATPHONG ( iddp primary key autoincrement ,idnv integer , idkhachhang integer , sophong text ) ";
//        db.execSQL(datphong);
//
//        String chitetkhachhang = "CREATE TABLE CTKHACHHANG ( iddp primary key autoincrement, idp integer , idkhachhang integer) ";
//        db.execSQL(chitetkhachhang);
//
//
//        String dichvu = "CREATE TABLE DICHVU (iddv primary key autoincrement, iddp integer , idkhachhang integer , idsp integer ,gia text , soluong text ,ngaymua text) ";
//        db.execSQL(dichvu);
//
//        String phong = "CREATE TABLE PHONG ( idphong  primary key autoincrement, phongchong text , kieuphong text ,soluongptd text , gia text)";
//        db.execSQL(phong);
//
//        String  chitietdatphong = "CREATE TABLE CHITIETPHONG (iddp  primary key autoincrement, idphong integer , gia text , donvi text )";
//        db.execSQL(chitietdatphong);
//
//        String Role = "CREATE TABLE ROLE (idrole  primary key autoincrement, rolename text) ";
//        db.execSQL(Role);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS NGUOIDUNG");
        onCreate(db);

    }
}
