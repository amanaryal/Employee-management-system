package pcps.employee.mangement.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pcps.employee.mangement.system.Repository.EmployeeRepository;
import pcps.employee.mangement.system.model.Employee;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    // Get all employees
    public List<Employee> listAll() {
        return repo.findAll();
    }

    // Save or update an employee
    public void save(Employee emp) {
        repo.save(emp);
    }

    // Get a single employee by ID
    public Employee get(Long id) {
        return repo.findById(id).orElse(null);
    }

    // Delete an employee by ID
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
