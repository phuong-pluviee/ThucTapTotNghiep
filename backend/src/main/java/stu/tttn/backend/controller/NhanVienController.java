package stu.tttn.backend.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import stu.tttn.backend.model.NhanVien;
import stu.tttn.backend.services.NhanVienService;

import java.util.List;

@RestController
@RequestMapping("/api/nhanvien")
public class NhanVienController {

    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping
    public List<NhanVien> getAllNhanVien() {
        return nhanVienService.getAllNhanVien();
    }

    @GetMapping("/{id}")
    public NhanVien getNhanVienById(@PathVariable("id") String id) {
        return nhanVienService.getNhanVienById(id);
    }

    @PostMapping
    public NhanVien createNhanVien(@RequestBody NhanVien nhanVien) {
        return nhanVienService.createNhanVien(nhanVien);
    }

    @PutMapping("/{id}")
    public NhanVien updateNhanVien(@PathVariable("id") String id, @RequestBody NhanVien nhanVien) {
        return nhanVienService.updateNhanVien(id, nhanVien);
    }

    @DeleteMapping("/{id}")
    public void deleteNhanVien(@PathVariable("id") String id) {
        nhanVienService.deleteNhanVien(id);
    }
}

