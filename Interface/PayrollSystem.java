package Interface;
class Employee {
    protected double baseSalary;

    public Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(double baseSalary, double bonus) {
        super(baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + this.bonus;
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        Manager manager = new Manager(50000, 10000);
        System.out.println("Total Salary: " + manager.calculateSalary());
    }
}