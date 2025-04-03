package stu.tttn.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stu.tttn.backend.dao.NhanVienRepository;
import stu.tttn.backend.model.NhanVien;

import java.util.List;
import java.util.Optional;

@Service
public class NhanVienServiceImpl implements NhanVienService {

    @Autowired
    private NhanVienRepository nhanVienRepository;

    @Override
    public List<NhanVien> getAllNhanVien() {
        return nhanVienRepository.findAll();
    }

    @Override
    public NhanVien getNhanVienById(String manhanvien) {
        return nhanVienRepository.findById(manhanvien).orElse(null);
    }

    @Override
    public NhanVien createNhanVien(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    @Override
    public NhanVien updateNhanVien(String manhanvien, NhanVien nhanVien) {
        Optional<NhanVien> existing = nhanVienRepository.findById(manhanvien);
        if (existing.isPresent()) {
            return nhanVienRepository.save(nhanVien);
        }
        return null;
    }

    @Override
    public void deleteNhanVien(String manhanvien) {
        nhanVienRepository.deleteById(manhanvien);
    }
}

