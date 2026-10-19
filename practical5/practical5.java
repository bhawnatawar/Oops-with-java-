class ComplexNumber {
    int real, imag;

    ComplexNumber(int r, int i) {
        real = r;
        imag = i;
    }

    ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(
            real + c.real, imag + c.imag);
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(4, 5);

        ComplexNumber c3 = c1.add(c2);
        c3.display();
    }
}

