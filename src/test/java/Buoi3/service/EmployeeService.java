package Buoi3.service;
import Buoi3.model.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> danhSachNhanVien = new ArrayList<>();
//    public EmployeeService() {
//        danhSachNhanVien.add(new Employee(1, "Nguyen", "Van A", "nguyena@example.com"));
//        danhSachNhanVien.add(new Employee(2, "Tran", "Thi B", "tranb@example.com"));
//        danhSachNhanVien.add(new Employee(3, "Le", "Van C", "levanc@example.com"));
//        danhSachNhanVien.add(new Employee(4, "Pham", "Thi D", "phamd@example.com"));
//        danhSachNhanVien.add(new Employee(5, "Hoang", "Van E", "hoange@example.com"));
//    }
    // Thêm nhân viên
    public boolean themNhanVien(Employee emp) {
        for (Employee e : danhSachNhanVien) {
            if (e.getId() == emp.getId()) return false; // Không cho phép trùng ID
        }
        danhSachNhanVien.add(emp);
        return true;
    }

    // Sửa thông tin nhân viên
    public boolean suaNhanVien(int id, String firstNameMoi, String lastNameMoi, String emailMoi) {
        for (Employee emp : danhSachNhanVien) {
            if (emp.getId() == id) {
                emp.setFirstName(firstNameMoi);
                emp.setLastName(lastNameMoi);
                emp.setEmail(emailMoi);
                return true;
            }
        }
        return false;
    }

    // Xóa nhân viên
    public boolean xoaNhanVien(int id) {
        return danhSachNhanVien.removeIf(emp -> emp.getId() == id);
    }

    // Tìm nhân viên theo ID
    public Employee timNhanVien(int id) {
        for (Employee emp : danhSachNhanVien) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null; // Không tìm thấy
    }

    // Lấy danh sách nhân viên
    public List<Employee> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }
}

