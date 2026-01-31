

 class Employee {

    // private data members (DATA HIDING)
    private int empId;
    private String name;
    private double salary;

    // setter methods (controlled access)
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

    // getter methods (read-only access)
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


