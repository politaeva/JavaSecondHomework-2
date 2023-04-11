
public class Main {
    public static void main(String[] args) {
        int x = 100; // всего на счете
        int y = 1452; // пополнение

        int z; //бонус
        if (y > 1000) {
            z = y / 100;
        } else {
            z = 0;
        }
        int a;
        a = x + y + z; // итоговый баланс
        System.out.println("Колличество бонусных рублей " + z);
        System.out.println("Итоговый счет " + a);


    }
}