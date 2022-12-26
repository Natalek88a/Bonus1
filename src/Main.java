public class Main {
    public static void main(String[] args) {

        int Balance = 200; // начальный счёт
        int amount = 1200; // суммы пополнения
        int addbonus = 1; // кол-во бонусов за каждые 100 руб
        int bonus;

        if (amount > 1000) {
            bonus = amount / 100 * addbonus;
        } else {
            bonus = 0;
        }

        System.out.println("Баланс:" + (amount + Balance + bonus));
    }
}

