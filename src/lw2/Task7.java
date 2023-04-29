package lw2;

public class Task7 {
    public static void main(String[] args) {
        IBankAccount bankAccount = new MockBackAccount();

        int beforeBalance = bankAccount.getBalance();
        System.out.printf("Текущий баланс %d\n", beforeBalance);
        
        bankAccount.putMoney(10_000);
        bankAccount.takeMoney(7_500);

        int afterBalance = bankAccount.getBalance();
        System.out.printf("Текущий баланс %d\n", afterBalance);
    }
}


interface IBankAccount {
    int getBalance();

    void takeMoney(int money);

    void putMoney(int money);
}

class MockBackAccount implements IBankAccount {
    private int balance = 0;

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void takeMoney(int money) {
        System.out.printf("Взять %d\n", money);
        balance -= money;
    }

    @Override
    public void putMoney(int money) {
        System.out.printf("Внести %d\n", money);
        balance += money;
    }
}

