class Employee {
    String name;
    double salary;
    static int count = 0;

    Employee() {
        this("Unknown", 0);
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
    }

    static void showCount() {
        System.out.println("Total Employees: " + count);
    }

    void display() {
        System.out.println(name + " " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("bhawna", 30000);
        Employee e3 = new Employee("ananya", 40000);

        e1.display();
        e2.display();
        e3.display();

        Employee.showCount();
    }
}

