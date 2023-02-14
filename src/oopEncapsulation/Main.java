package oopEncapsulation;

public class Main {
    public static void main(String[] args) {
        new Employee("Popov Sergey", "developer java", "psv@gmail.com", "+380671232233", 39);
        new Car().start();
        Employee employee=new Employee("Vasya Pupkin", "driver", "jfgkk@ert.com", "+2545647", 15);
        employee.setPhone("456555");
        System.out.println(employee.getFullName()+employee.getPhone());
    };
}
