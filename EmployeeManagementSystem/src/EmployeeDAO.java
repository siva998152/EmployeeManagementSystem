

import java.util.List;

public interface EmployeeDAO {

    void addEmployee(EmployeeDTO emp);
    List<EmployeeDTO> getAllEmployees();
    EmployeeDTO getEmployeeById(int id);
    void updateSalary(int id, double salary);
    void deleteEmployee(int id);
}
