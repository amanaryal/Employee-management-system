package pcps.employee.mangement.system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pcps.employee.mangement.system.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // No need to write any methods. JpaRepository gives you basic CRUD out of the box.
}

