import java.util.List;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name){
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Employee> getColleagues(){
        return this.department.getEmployees();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder emplyeeinfo = new StringBuilder();
        if(this == this.department.head){
            emplyeeinfo.append(this.name).append(" начальник отдела ").append(this.department.name).append("\n");
        } else {
            emplyeeinfo.append(this.name).append(" работает в отделе ").append(this.department.name).append(", начальник которого ").append(this.department.head.name).append("\n");
        }
        return emplyeeinfo.toString();
    }
}
