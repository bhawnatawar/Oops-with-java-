class BankAccount {
    private String holder;
    private int accountNo;
    private double balance;

    BankAccount(String holder, int accountNo, double balance) {
        this.holder = holder;
        this.accountNo = accountNo;
        this.balance = Math.max(0, balance);
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid deposit");
    }

    void withdraw(double amount) {
        if (amount <= 0)
            System.out.println("Invalid amount");
        else if (amount > balance)
            System.out.println("Insufficient balance");
        else
            balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount("bhawna", 101, 5000);

        b.deposit(1000);
        b.withdraw(2000);
        b.withdraw(10000);
        b.deposit(-500);

        System.out.println("Balance: " + b.getBalance());
    }
}

