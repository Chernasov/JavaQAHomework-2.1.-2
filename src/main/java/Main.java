public class Main {
    public static void main(String[] args) {
        /*
         Объявление переменных для входных данных и параметров программы:
         начального счёта, суммы пополнения и количества рублей для бонуса
        */
        int account = 100;
        int refill = 1005;
        int amountForBonus = 100;
        /*
         Условным оператором проверяется превысила ли сумма пополнения порог и для этих двух разных
         сценариев рассчитывается сумма бонуса и выводится на экран.
        */
        int bonus = (refill > 1000) ? refill / amountForBonus : 0;
        account = account + refill + bonus;
        System.out.println("Всего счет: " + account);
        System.out.println("в том числе бонус: " + bonus);
    }
}
