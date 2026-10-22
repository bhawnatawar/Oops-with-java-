class Product {
    String name;
    int price, quantity;

    Product() {
        name = "Unknown";
        price = 0;
        quantity = 0;
    }

    Product(String n) {
        name = n;
        price = 0;
        quantity = 0;
    }

    Product(String n, int p) {
        name = n;
        price = p;
        quantity = 1;
    }

    Product(String n, int p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    int totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println(name + " " + price + " "
                           + quantity + " Total: " + totalCost());
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Pen");
        Product p3 = new Product("Book", 50);
        Product p4 = new Product("Bag", 500, 2);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}
