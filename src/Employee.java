public class Employee {
    String name;
    Department department;

    public Employee(String name, Department department){
        this.name = name;
        department.addEmployee(this);
    }

    public Employee(String name){
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getColleagues(){
        return this.department.toString();
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
