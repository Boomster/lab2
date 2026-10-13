import java.util.Scanner;

public class Main {
    public static int checkInputMaxPosInt(Scanner sc, String name, int max){
        int a = 0;
        boolean gotNumber = false;
        System.out.print(name + " = ");

        while (!gotNumber) {
            String str = sc.next();
            try {
                a = Integer.parseInt(str);
                if (a >= 0 && a < max) {
                    gotNumber = true;
                } else {
                    System.out.println("Number should be positive and less than " + max + "!");
                    System.out.print(name + " = ");
                }
            } catch (Exception e) {
                System.out.println("This is not an integer!");
                System.out.print(name + " = ");
            }
        }
        return a;
    }

    public static int checkInputPosInt(Scanner sc, String name){
        int a = 0;
        boolean gotNumber = false;
        System.out.print(name + " = ");

        while (!gotNumber) {
            String str = sc.next();
            try {
                a = Integer.parseInt(str);
                if (a >= 0) {
                    gotNumber = true;
                } else {
                    System.out.println("Number should be positive!");
                    System.out.print(name + " = ");
                }
            } catch (Exception e) {
                System.out.println("This is not an integer!");
                System.out.print(name + " = ");
            }
        }
        return a;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //1.3
        /*
        Name name1 = new Name("Клеопатра");
        Name name2 = new Name("Пушкин", "Александр","Сергеевич");
        Name name3 = new Name("Маяковский", "Владимир");
        System.out.println(name1.toString());
        System.out.println(name2.toString());
        System.out.println(name3.toString());
        */

        //1.4
        /*
        Time t1 = new Time(checkInputPosInt(sc, "время"));
        System.out.println(t1.toString());
        Time t2 = new Time(checkInputPosInt(sc, "время"));
        System.out.println(t2.toString());
        Time t3 = new Time(checkInputPosInt(sc, "время"));
        System.out.println(t3.toString());
        */

        //2.4
        /*
        Employee employee1, employee2,employee3;
        employee1 = new Employee("Петров");
        employee2 = new Employee("Козлов");
        employee3 = new Employee("Сидоров");
        Department itdepartment = new Department("IT", employee2);
        itdepartment.addEmployee(employee1);
        itdepartment.addEmployee(employee3);
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());

        //3.4
        System.out.println(employee1.department.toString());
        */

        //4.4
        /*
        Time t4 = new Time(checkInputPosInt(sc, "время"));
        //t4.hours = 2;
        System.out.println(t4.toString());
        Time t5 = new Time(checkInputPosInt(sc, "часы"), checkInputMaxPosInt(sc, "минуты", 60), checkInputMaxPosInt(sc, "секунды", 60));
        System.out.println(t5.toString());
        */

        //5.4
        Time t6 = new Time(34056);
        System.out.println(t6.getHours());
        Time t7 = new Time(4532);
        System.out.println(t7.getMinutes());
        Time t8 = new Time(123);
        System.out.println(t8.getSeconds());
    }
}
