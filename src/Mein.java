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
        int wallet = 100; //кошелек


        //стоимость товаров
        int kvassPrice = 15;
        int breadPrice = 10;
        int fishPrice = 130;
        int beerPrice = 100;
        int sausagePrice = 70;
        int chipsPrice = 45;

        //Минимальная стоимость
        int minPrice = 100000;

        if (kvassPrice < minPrice) {
            minPrice = kvassPrice;
        }
        if (breadPrice < minPrice) {
            minPrice = breadPrice;
        }
        if (fishPrice < minPrice) {
            minPrice = fishPrice;
        }
        if (beerPrice < minPrice) {
            minPrice = beerPrice;
        }
        if (sausagePrice < minPrice) {
            minPrice = sausagePrice;
        }
        if (chipsPrice < minPrice) {
            minPrice = chipsPrice;
        }

        System.out.println("Минимальная сумма товара: " + minPrice);


        //Начало работы
        System.out.println("Здравствуйте, введите ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Здравствуйте " + name + ". Какие продукты покупаем сегодня?");
        System.out.println("Ваш кошелек: " + wallet);
        while (true) {
            System.out.println("Сколько сейчас в кошельке " + wallet);


            if (wallet < minPrice) {
                System.out.println("Недостаточно средств");
                break;
            }

            boolean isProduct = false;
            String line = scanner.nextLine();


            if (line.equals("Квас")) {
                isProduct = true;
                if (kvassPrice < wallet) {
                    System.out.println("Вы добавили квас");
                    kvass = kvass + 1;
                    checkout = checkout + 1;
                    wallet = wallet - kvassPrice; // руб.
                } else {
                    System.out.println("Недостаточно средств для покупки данного товара!");
                }
            }

            if (line.equals("Хлеб")) {
                isProduct = true;
                if (breadPrice < wallet) {
                    System.out.println("Вы добавили Хлеб");
                    bread = bread + 1;
                    checkout = checkout + 1;
                    wallet = wallet - breadPrice; // руб.
                } else {
                    System.out.println("Недостаточно средств для покупки данного товара!");
                }
            }
            if (line.equals("Рыба")) {
                isProduct = true;
                if (fishPrice < wallet) {
                    System.out.println("Вы добавили рыбу");
                    fish = fish + 1;
                    checkout = checkout + 1;
                    wallet = wallet - fishPrice; // руб.
                } else {
                    System.out.println("Недостаточно средств для покупки данного товара!");
                }
            }
            if (line.equals("Пиво")) {
                isProduct = true;
                if (beerPrice < wallet) {
                    System.out.println("Вы добавили Пиво");
                    beer = beer + 1;
                    checkout = checkout + 1;
                    wallet = wallet - beerPrice; // руб.
                } else {
                    System.out.println("Недостаточно средств для покупки данного товара!");
                }
            }

            if (line.equals("Колбаса")) {
                isProduct = true;
                if (sausagePrice < wallet) {
                    System.out.println("Вы добавили колбасу");
                    sausage = sausage + 1;
                    checkout = checkout + 1;
                    wallet = wallet - sausagePrice; // руб.
                } else {
                    System.out.println("Недостаточно средств для покупки данного товара!");
                }
            }

            if (line.equals("Чипсы")) {
                isProduct = true;
                if (chipsPrice < wallet) {
                    System.out.println("Вы добавили чипсы");
                    chips = chips + 1;
                    checkout = checkout + 1;
                    wallet = wallet - chipsPrice;
                } else {
                    System.out.println("Недостаточно средств для покупки данного товара!");
                }
            }

            if (line.equals("Закончили")) {
                break;
            }

            if (!isProduct) {
                System.out.println(line + " Продукт не найден!");
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

