package stu.tttn.backend.dao;

import org.springframework.stereotype.Repository;
import stu.tttn.backend.model.HopDong;


import java.sql.*;
@Repository
public class HopDongDao {
    private Connection getConnection() throws SQLException {
        // Connection logic to the database (using JDBC or connection pool)
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/hrm", "root", "");
    }
    public HopDong getHopdong(String Mahopdong) throws SQLException {
        String sql = "SELECT * FROM hopdong WHERE Mahopdong = ?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1,  Mahopdong);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                HopDong hopdong = new HopDong();
                hopdong.setMahopdong(rs.getString("Mahopdong"));
                hopdong.setLoaihopdong(rs.getString("Loaihopdong"));
                hopdong.setNgayky(rs.getDate("Ngayky"));
                hopdong.setThoigianhieuluc(rs.getInt("Thoigianhieuluc"));
                hopdong.setManhanvien(rs.getString("Manhanvien"));
                return hopdong;
            }
        }
        return null;
    }

}
