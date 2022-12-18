public class Nine {

    int balance;

    public Nine(int balance) {
        this.balance = balance;
    }

    void withdraw(int sum) {
        try {
            if (sum < 0) {
                System.out.println("Сумма снятия не может быть отрицательной");
                throw new Exception();
            }
            balance -= sum;
        } catch (Exception e) {
            System.out.println("Исключение:" + e);
        }
    }


    public static void main(String[] args) {
        Nine account = new Nine(100);
        account.withdraw(-20);
    }
}
