class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Employee {
    void calculatePay() {
        System.out.println("Employee salary");
    }
}

class Manager extends Employee {
    @Override
    void calculatePay() {
        System.out.println("Manager salary");
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(2.5, 3.5));

        Employee e = new Manager();
        e.calculatePay();
    }
}

