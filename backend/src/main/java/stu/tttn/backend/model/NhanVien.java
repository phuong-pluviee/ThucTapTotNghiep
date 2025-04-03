package stu.tttn.backend.model;

import jakarta.persistence.*;
import lombok.*;

    @Entity
    @Table(name = "nhanvien")
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class NhanVien {
        @Id
        @Column(name = "Manhanvien")
        private String manhanvien;

        @Column(name = "Tennhanvien")
        private String tennhanvien;

        @Column(name = "Ngaysinh")
        private String ngaysinh;

        @Column(name = "CCCD")
        private String cccd;

        @Column(name = "Diachi")
        private String diachi;

        @Column(name = "SDT")
        private String sdt;

        @Column(name = "Email")
        private String email;

        @Column(name = "Trangthailamviec")
        private String trangthailamviec;
    }

