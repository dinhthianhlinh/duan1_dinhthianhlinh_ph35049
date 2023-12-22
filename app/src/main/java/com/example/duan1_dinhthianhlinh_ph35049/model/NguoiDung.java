package com.example.duan1_dinhthianhlinh_ph35049.model;

public class NguoiDung {

    private  int idnd;
    private String  tennguoidung, matkhau ,ngaysinh , gioitinh , email ,sdt ;

    private int role ;

    public NguoiDung() {
    }

    public NguoiDung(int idnd, String tennguoidung, String matkhau, String ngaysinh, String gioitinh, String email, String sdt, int role) {
        this.idnd = idnd;
        this.tennguoidung = tennguoidung;
        this.matkhau = matkhau;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.email = email;
        this.sdt = sdt;
        this.role = role;
    }

    public NguoiDung(String tennguoidung, String matkhau, String ngaysinh, String gioitinh, String email, String sdt) {
        this.tennguoidung = tennguoidung;
        this.matkhau = matkhau;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.email = email;
        this.sdt = sdt;
    }

    public int getIdnd() {
        return idnd;
    }

    public void setIdnd(int idnd) {
        this.idnd = idnd;
    }

    public String getTennguoidung() {
        return tennguoidung;
    }

    public void setTennguoidung(String tennguoidung) {
        this.tennguoidung = tennguoidung;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
