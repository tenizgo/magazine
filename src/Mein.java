import java.util.Scanner;

public class Mein {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kvass = 0; // квас упаковка
        int bread = 0; //хлеб
        int fish = 0; //рыба
        int beer = 0; //пиво
        int sausage = 0; //колбаса
        int chips = 0; // чипсы
        int checkout = 0; //корзина
        int wallet = 500; //кошелек

        System.out.println("Здравствуйте, введите ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Здравствуйте " + name + ". Какие продукты покупаем сегодня?");
        System.out.println("Ваш кошелек: " + wallet);
        while (true) {
            System.out.println("Сколько сейчас в кошельке " + wallet);

            if (wallet <= 0) {
                System.out.println("Недостаточно средств на вашем счету ");
                break;

            }

            boolean isProduct = false;
            String line = scanner.nextLine();


            if (line.equals("Квас")) {
                System.out.println("Вы добавили квас");
                kvass = kvass + 1;
                isProduct = true;
                checkout = checkout + 1;
                wallet = wallet - 45; // руб.

            }

            if (line.equals("Хлеб")) {
                System.out.println("Вы добавили Хлеб");
                bread = bread + 1;
                isProduct = true;
                checkout = checkout + 1;
                wallet = wallet - 30; // руб.
            }

            if (line.equals("Рыба")) {
                System.out.println("Вы добавили рыбу");
                fish = fish + 1;
                isProduct = true;
                checkout = checkout + 1;
                wallet = wallet - 130; // руб.
            }

            if (line.equals("Пиво")) {
                System.out.println("Вы добавили Пиво");
                beer = beer + 1;
                isProduct = true;
                checkout = checkout + 1;
                wallet = wallet - 100; // руб.
            }

            if (line.equals("Колбаса")) {
                System.out.println("Вы добавили колбасу");
                sausage = sausage + 1;
                isProduct = true;
                checkout = checkout + 1;
                wallet = wallet - 70; // руб.
            }

            if (line.equals("Чипсы")) {
                System.out.println("Вы добавили чипсы");
                chips = chips + 1;
                isProduct = true;
                checkout = checkout + 1;
                wallet = wallet - 45;
            }

            if (line.equals("Закончили")) {
                break;
            }

            if (!isProduct) {
                System.out.println(line + " Продукт не найден!");
            }
            if (checkout > 5) {
                System.out.println("Ваша корзина полна, будьте добры пройти на кассу " + checkout);
            }


        }
        String text = " Итого у вас в корзине: ";
        if (kvass > 0) {
            text = text + kvass + " Квас ";
        }
        if (bread > 0) {
            text = text + bread + " Хлеб ";
        }
        if (fish > 0) {
            text = text + fish + " Рыба ";
        }
        if (beer > 0) {
            text = text + beer + " Пиво ";
        }
        if (sausage > 0) {
            text = text + sausage + " Колбаса ";
        }
        if (chips > 0) {
            text = text + chips + " Чипсы ";
        }
        if (wallet > 0) {
            text = text + " К оплате " + wallet + " руб.";
        }
        System.out.println(name + text);
       // System.out.println(name + " Итого у вас в корзине: Квас " + kvass + ", Хлеб " + bread + ", Рыба " + fish + ", Пиво " + beer + ", Колбоса " + sausage + ", Чипсы " + chips + " ");
    }
}
