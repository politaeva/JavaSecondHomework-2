
public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1100;

        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int totalBalance;
        totalBalance = balance + refill + bonus;
        System.out.println("Колличество бонусных рублей " + bonus);
        System.out.println("Итоговый счет " + totalBalance);


    }
}