import java.util.ArrayList;
import java.util.List;

public class Department {
    String name;
    Employee head;
    List<Employee> employees;

    public Department(String name){
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void setHead(Employee head) {
        this.head = head;
        employees.add(head);
        head.setDepartment(this);
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
        employee.setDepartment(this);
    }

    public List<Employee> getEmployees(){
        return this.employees;
    }

    @Override
    public String toString(){
        StringBuilder departmentfull = new StringBuilder();
        departmentfull.append("Отдел: ").append(this.name).append("\n");
        departmentfull.append("Сотрудники:\n");
        for(Employee e : this.employees){
            departmentfull.append(e.getName()).append("\n");
        }
        departmentfull.append("Руководитель: ").append(this.head.getName()).append("\n");
        return departmentfull.toString();
    }
}
