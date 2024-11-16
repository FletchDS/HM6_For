public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.print("Числа от 1 до 10: ");

        for (byte i = 1; i <= 10; i++) {
            System.out.printf("%d ", i);
        }

        //Задача 2
        System.out.print("\n\nЧисла от 10 до 1: ");

        for (byte i = 10; i >= 1; i--) {
            System.out.printf("%d ", i);
        }

        //Задача 3
        System.out.print("\n\nЧетные числа от 0 до 17: ");

        for (byte i = 0; i <= 17; i += 2) {
            System.out.printf("%d ", i);
        }

        //Задача 4
        System.out.print("\n\nЧисла от 10 до -10: ");

        for (byte i = 10; i >= -10; i--) {
            System.out.printf("%d ", i);
        }

        //Задача 5
        System.out.print("\n\nВисокосные года от 1904 до 2096: ");

        for (short i = 1904; i <= 2096; i += 4) {
            System.out.printf("\n%d ", i);
        }

        //Задача 6
        System.out.print("\n\nЧисла от 7 до 98: ");

        for (byte i = 7; i <= 98; i += 7) {
            System.out.printf("%d ", i);
        }

        //Задача 7
        System.out.print("\n\nСтепени 2 от 0 до 9: 1 ");

        for (short i = 2; i <= 512; i *= 2) {
            System.out.printf("%d ", i);
        }

        //Задача 8
        int storage1 = 0;

        System.out.print("\n\nКопим деньги. Ежемесячный вклад = 29000\n");

        for (byte i = 1; i <= 12; i++) {
            storage1 += 29_000;

            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, storage1);
        }

        //Задача 9
        double storage2 = 0;

        System.out.print("\n\nКопим деньги. Ежемесячный вклад = 29000. 12% годовых\n");

        for (byte i = 1; i <= 12; i++) {
            storage2 += 29_000;
            storage2 += storage2 * 0.01;

            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", i, storage2);
        }

        //Задача 10
        System.out.print("\n\nТаблица умножения\n");

        for (byte i = 1; i <= 10; i++) {
            for (byte j = 1; j <= 10; j++) {
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }
    }
}