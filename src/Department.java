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

    public Department(String name, Employee head){
        this.name = name;
        this.head = head;
        head.setDepartment(this);
        this.employees = new ArrayList<>();
    }

    public void setHead(Employee head) {
        this.head = head;
        head.setDepartment(this);
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
        employee.setDepartment(this);
    }

    @Override
    public String toString(){
        StringBuilder departmentfull = new StringBuilder();
        departmentfull.append("Отдел: ").append(this.name).append("\n");
        departmentfull.append("Сотрудники:\n");
        for(Employee e : this.employees){
            departmentfull.append(e.name).append("\n");
        }
        departmentfull.append("Руководитель: ").append(this.head.name).append("\n");
        return departmentfull.toString();
    }
}
