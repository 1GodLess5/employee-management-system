package cz.godless.ems.mapper;

import cz.godless.ems.domain.Employee;
import cz.godless.ems.entity.EmployeeEntity;

public class EmployeeMapper {
    public static Employee mapToEmployee(EmployeeEntity employeeEntity) {
        return new Employee(
                employeeEntity.getId(),
                employeeEntity.getFirstName(),
                employeeEntity.getLastName(),
                employeeEntity.getEmail()
        );
    }

    public static EmployeeEntity mapToEmployeeEntity(Employee employee) {
        return new EmployeeEntity(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }
}
