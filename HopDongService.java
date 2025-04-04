package stu.tttn.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stu.tttn.backend.dao.HopDongDao;
import stu.tttn.backend.model.HopDong;


import java.sql.SQLException;
@Service
public class HopDongService {
    private final HopDongDao hopDongDao;
    @Autowired
    public HopDongService(HopDongDao hopDongDao){this.hopDongDao=hopDongDao;}
    // Get mahopdong by ID
    public HopDong getMahopdong(String Mahopdong) throws SQLException {
        return hopDongDao.getHopdong(Mahopdong);
    }
}
