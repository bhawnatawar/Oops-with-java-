class Student {
    int roll, m1, m2, m3;
    String name;

    Student(int r, String n, int a, int b, int c) {
        roll = r;
        name = n;
        m1 = a;
        m2 = b;
        m3 = c;
    }

    void display() {
        int total = m1 + m2 + m3;
        double per = total / 3.0;

        System.out.println(roll + " " + name);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + per);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "bhawna", 80, 85, 90);
        Student s2 = new Student(2, "ananya", 75, 80, 85);
        Student s3 = new Student(3, "diksha", 70, 75, 80);

        s1.display();
        s2.display();
        s3.display();
    }
}

