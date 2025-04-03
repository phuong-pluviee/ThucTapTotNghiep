package stu.tttn.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import stu.tttn.backend.model.NhanVien;

public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
}
