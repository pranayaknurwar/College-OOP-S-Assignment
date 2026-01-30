class Person {
    
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

public class Main {

    public static void main(String[] args) {

        // Creating objects using constructor
        Person student1 = new Person("John", 21);
        Person student2 = new Person("Alex", 22);

        student1.displayInfo();
        System.out.println("-----");
        student2.displayInfo();
    }
}
