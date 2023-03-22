1.
public class Main {
        public static void main(String[] args)
 for (int i = 500; i <= 650; i += 10) {
                System.out.println(i);
        }
}
}
        2.
public static void main(String[] args) {
        int a = 2;
        int result = 0;

        do {
        result = 2 * a - 1;
        if (result < 5000) {
        System.out.println(result);
        }
        a++;
        } while (result < 5000);
        }
        }
        3.
public class Main {
        public static void main(String[] args) {
                int n = 10;

                System.out.print("Додатні дільники числа " + n + ": ");
                for (int i = 1; i <= n; i++) {
                        if (n % i == 0 && i > 0) {
                                System.out.print(i + " ");
                        }
                }
        }
}
4.
public static void main(String[] args) {
        int number = 10;

        for (int i = 1; i <= number; i++) {
        if (number % i == 0) {
        System.out.println(i);
        }
        }
        }
        }
        5.
public class Main {
        public static void main(String[] args) {
                int count = 0; // Лічильник співпадінь

                for (int hour = 0; hour < 24; hour++) {
                        for (int minute = 0; minute < 60; minute++) {
                                // Перевірка, чи є години і хвилини симетричними комбінаціями цифр
                                if (hour / 10 == minute % 10 && hour % 10 == minute / 10) {
                                        count++;
                                }
                        }
                }

                System.out.println("Кількість співпадінь симет");
        }
}

