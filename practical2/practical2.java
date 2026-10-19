class Vehicle {
    void show() {
        System.out.println("Vehicle");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("Car");
    }
}

class Person {
    void personInfo() {
        System.out.println("Person");
    }
}

class Employee extends Person {
    void employeeInfo() {
        System.out.println("Employee");
    }
}

class Manager extends Employee {
    void managerInfo() {
        System.out.println("Manager");
    }
}

class Shape {
    void showShape() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {
    void circleInfo() {
        System.out.println("Circle");
    }
}

class Rectangle extends Shape {
    void rectangleInfo() {
        System.out.println("Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.show();
        c.display();

        Manager m = new Manager();
        m.personInfo();
        m.employeeInfo();
        m.managerInfo();

        Circle a = new Circle();
        Rectangle b = new Rectangle();
        a.showShape();
        a.circleInfo();
        b.showShape();
        b.rectangleInfo();
    }
}

