interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }
}

class Device {
    void start() {
        System.out.println("Device started");
    }
}

class SmartPrinter extends Device implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

public class Main {
    public static void main(String[] args) {
        AllInOnePrinter p = new AllInOnePrinter();
        p.print();
        p.scan();

        SmartPrinter s = new SmartPrinter();
        s.start();
        s.print();
        s.scan();
    }
}

