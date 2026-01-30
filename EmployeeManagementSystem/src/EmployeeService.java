

import java.util.List;

public class EmployeeService {

    private EmployeeDAO dao = new EmployeeDAOImpl();

    public void add(EmployeeDTO emp) {
        dao.addEmployee(emp);
    }

    public void showAll() {
        List<EmployeeDTO> list = dao.getAllEmployees();
        for (EmployeeDTO e : list) {
            System.out.println(e.getEmpId() + " | " +
                               e.getName() + " | " +
                               e.getDepartment() + " | ₹" +
                               e.getSalary());
        }
    }

    public void search(int id) {
        EmployeeDTO emp = dao.getEmployeeById(id);
        if (emp == null) {
            System.out.println("❌ Employee not found");
        } else {
            System.out.println(emp.getEmpId() + " " +
                               emp.getName() + " " +
                               emp.getDepartment() + " ₹" +
                               emp.getSalary());
        }
    }

    public void update(int id, double salary) {
        dao.updateSalary(id, salary);
    }

    public void delete(int id) {
        dao.deleteEmployee(id);
    }
}
