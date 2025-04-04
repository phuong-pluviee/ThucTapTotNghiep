package stu.tttn.backend.model;

import java.util.Date;

public class HopDong {
    private String Mahopdong;
    private String Loaihopdong;
    private Date Ngayky;
    private int Thoigianhieuluc;
    private String Manhanvien;

    public String getMahopdong() {
        return Mahopdong;
    }

    public void setMahopdong(String mahopdong) {
        Mahopdong = mahopdong;
    }

    public String getLoaihopdong() {
        return Loaihopdong;
    }

    public void setLoaihopdong(String loaihopdong) {
        Loaihopdong = loaihopdong;
    }

    public Date getNgayky() {
        return Ngayky;
    }

    public void setNgayky(Date ngayky) {
        Ngayky = ngayky;
    }

    public int getThoigianhieuluc() {
        return Thoigianhieuluc;
    }

    public void setThoigianhieuluc(int thoigianhieuluc) {
        Thoigianhieuluc = thoigianhieuluc;
    }

    public String getManhanvien() {
        return Manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        Manhanvien = manhanvien;
    }
}
