package Overriding;

class Employee {
    double calculateBonus() {
        return 5000;
    }
}

class Manager extends Employee {
    @Override
    double calculateBonus() {
        return 15000;
    }
}

public class EmployeeBonusApp {
    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println("Manager Bonus: " + manager.calculateBonus());
    }
}
