class Demo {
    Demo() {
        System.out.println("Object created");
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1 = null;

        System.gc();

        System.out.println("Garbage collection requested");
    }
}

