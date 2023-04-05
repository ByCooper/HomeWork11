import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();

    }
    public static void task1 () {
        System.out.println("\n" + "Задача №1" + "\n");
        //Является год високосным или нет
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
        int clientOS = 0;
        int clientDeviceYear = 2023;

        getApplication(clientOS, clientDeviceYear);


    }
    public static void getApplication(int a, int b) {
        int currentYear = LocalDate.now().getYear();
        boolean rulesIosOld = true;
        rulesIosOld = a == 0 && b < currentYear;
        boolean rulesAndOld = true;
        rulesAndOld = a == 1 && b < currentYear;
        boolean rulesIosNew = true;
        rulesIosNew = a == 0 && b >= currentYear;
        boolean rulesAndNew = true;
        rulesAndNew = a == 1 && b >= currentYear;

        if (rulesIosOld) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if(rulesIosNew) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (rulesAndOld) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if(rulesAndNew) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
}