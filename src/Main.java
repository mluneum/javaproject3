public class Main {
    public static void main(String[] args) {

        int currentBalance = 100; // Текущий баланс клиента
        int rechargeAmount = 1000; // Сумма пополнения

        int bonus = 0;
        if (rechargeAmount > 1000) {
            bonus = (rechargeAmount / 100); // Бонус за каждые полные 100 рублей
        }

        int totalBalance = currentBalance + rechargeAmount + bonus; // Итоговый баланс

        System.out.println("Сумма пополнения: " + rechargeAmount + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus + " рублей");
        System.out.println("Итоговый баланс на счету клиента: " + totalBalance + " рублей");
    }
}
