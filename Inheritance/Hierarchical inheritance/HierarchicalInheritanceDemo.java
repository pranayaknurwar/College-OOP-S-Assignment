// Parent class
class Employee {
    String companyName = "TechNova Pvt Ltd";

    void work() {
        System.out.println("Employee works for the company");
    }
}
// Child class 1
class Developer extends Employee {

    void develop() {
        System.out.println("Developer writes and maintains code");
    }
}
// Child class 2
class Tester extends Employee {

    void test() {
        System.out.println("Tester tests the application");
    }
}
// Child class 3
class Manager extends Employee {

    void manage() {
        System.out.println("Manager manages the team");
    }
}
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {

        Developer dev = new Developer();
        Tester test = new Tester();
        Manager mgr = new Manager();

        dev.work();        // inherited method
        dev.develop();

        System.out.println();

        test.work();       // inherited method
        test.test();

        System.out.println();

        mgr.work();        // inherited method
        mgr.manage();
    }
}
