

 class Employee {
    private int empId;
    private String name;
    private double salary;

    public void setEmpId(int empId) {
        if (empId <= 0) {
            System.out.println("Invalid Employee ID");
        } else {
            this.empId = empId;
        }
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be negative");
        } else {
            this.salary = salary;
        }
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Encap {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setEmpId(101);
        emp.setName("Rajwardhan");
        emp.setSalary(45000);

        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
