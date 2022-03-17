public class Main {

    public static void main(String[] args) {
        int count = 100; // начальная сумма на счете в рублях
        int addCount = 1100; // сумма пополнения счета в рублях

        int bonus = 0; // кол-во бонусных рублей
        if (addCount > 0) { // проверка, чтобы сумма пополнения была положительной
            if (addCount > 1000) { // в задание было "более чем на 1000 рублей", поэтому знак >, а не >=
                bonus = addCount / 100;
            }
            count = count + bonus + addCount;
            System.out.println("На вашем счёте: " + count + " рублей. " + "Ваш бонус: " + bonus + " рублей.");
        } else {
            System.out.println("Сумма пополнения не может быть отрицательной или равна нулю!");
        }
    }
}
