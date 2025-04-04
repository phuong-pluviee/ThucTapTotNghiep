package stu.tttn.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stu.tttn.backend.model.HopDong;
import stu.tttn.backend.services.HopDongService;



import java.sql.SQLException;

@RestController
@RequestMapping("/hopdong")
public class HopDongController {
    private final HopDongService hopDongService;
    @Autowired
    public HopDongController(HopDongService hopDongService) {
        this.hopDongService = hopDongService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<HopDong> getHopdong(@PathVariable String id) {
        try {
            HopDong hopdong = hopDongService.getMahopdong(id);
            if (hopdong != null) {
                return ResponseEntity.status(HttpStatus.OK).body(hopdong);
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        } catch (SQLException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

}
