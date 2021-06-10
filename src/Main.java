public class Main {
    public static void main(String[] args) {
        int account = 100;
        int refill = 1390;
        int bonus;
        if (refill > 1_000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int balance = account + refill + bonus;
        System.out.println("Начислено бонусных рублей: " + bonus);
        System.out.println("Баланс клиента: " + balance);
    }
}