package stu.tttn.backend.services;

import stu.tttn.backend.model.NhanVien;

import java.util.List;

public interface NhanVienService {
    List<NhanVien> getAllNhanVien();
    NhanVien getNhanVienById(String manhanvien);
    NhanVien createNhanVien(NhanVien nhanVien);
    NhanVien updateNhanVien(String manhanvien, NhanVien nhanVien);
    void deleteNhanVien(String manhanvien);
}
