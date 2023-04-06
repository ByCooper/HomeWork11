import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("\n" + "Задача №1" + "\n");
        int yearNow = 2023;
        equelYear(yearNow);
    }

    public static void equelYear(int y) {
        int n = y;
        int everyFour = 4;
        int everyHundred = 100;
        int every4Hundred = 400;

        if ((n % everyFour == 0 && n % everyHundred != 0) || n % every4Hundred == 0) {
            System.out.println(n + " год является високосным");
        } else {
            System.out.println(n + " год не является високосным");
        }
    }

    public static void task2() {
        System.out.println("\n" + "Задача №2" + "\n");
        int clientOS = 1;
        int clientDeviceYear = 2022;

        getApplication(clientOS, clientDeviceYear);
    }

    public static void getApplication(int a, int b) {
        int currentYear = LocalDate.now().getYear();
        boolean rulesApi = b < currentYear;

        if (a == 0) {
            if (rulesApi) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (a == 1) {
            if (rulesApi) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("\n" + "Задача №3" + "\n");
        int deliveryDistance = 2;
        if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + getDelivery(deliveryDistance));
        } else {
            System.out.println("Доставка не осуществляется");
        }

    }

    public static int getDelivery(int a) {
        boolean oneDelivery = a < 20;
        boolean twoDelivery = a >= 20 && a < 60;
        boolean threeDelivery = a >= 60 && a < 100;

        if (oneDelivery)
            return 1;
        else if (twoDelivery)
            return 2;
        else if (threeDelivery)
            return 3;
        return a;
    }
}