package stu.tttn.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stu.tttn.backend.dao.SalaryDAO;
import stu.tttn.backend.model.Salary;

import java.sql.SQLException;

@Service
public class SalaryService {

    private final SalaryDAO salaryDAO;

    @Autowired
    public SalaryService(SalaryDAO salaryDAO) {
        this.salaryDAO = salaryDAO;
    }

    // Create Salary
    public void addSalary(Salary salary) throws SQLException {
        salaryDAO.createSalary(salary);
    }

    // Get Salary by ID
    public Salary getSalary(String maLuong) throws SQLException {
        return salaryDAO.getSalary(maLuong);
    }

    // Update Salary
    public void updateSalary(Salary salary) throws SQLException {
        salaryDAO.updateSalary(salary);
    }

    // Delete Salary
    public void deleteSalary(String maLuong) throws SQLException {
        salaryDAO.deleteSalary(maLuong);
    }
}
