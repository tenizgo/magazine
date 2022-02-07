import javax.sound.sampled.Line;
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
        int wallet = 0; //кошелек
        int needToPay = 0; // Надо заплатить

        //стоимость товаров
        int kvassPrice = 15;
        int breadPrice = 10;
        int fishPrice = 130;
        int beerPrice = 100;
        int sausagePrice = 70;
        int chipsPrice = 45;

        //Начало работы
        System.out.println("Здравствуйте, введите ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Сколько у вас средств");
        wallet = Integer.parseInt(scanner.nextLine());
        System.out.println("Здравствуйте " + name + ". Какие продукты покупаем сегодня?");
        System.out.println("Ваш кошелек: " + wallet);
        while (true) {
            System.out.println("Сколько сейчас в кошельке " + wallet);

            boolean isProduct = false;
            String line = scanner.nextLine();


            if (line.equals("+Квас")) {
                isProduct = true;
                if (kvassPrice <= wallet) {
                    System.out.println("Вы добавили квас");
                    kvass = kvass + 1;
                    checkout = checkout + 1;
                    wallet = wallet - kvassPrice; // руб.
                    needToPay = needToPay + kvassPrice;
                } else {
                    System.out.println("Недостаточно средств для покупки данного товара!");
                }
            }
            if (line.equals("-Квас")) {
                isProduct = true;
                if (kvass > 0) {
                    System.out.println("Вы удалили продукт Квас");
                    kvass = kvass - 1;
                    checkout = checkout - 1;
                    wallet = wallet + kvassPrice;
                    needToPay = needToPay - kvassPrice;
                } else {
                    System.out.println("В корзине отсуствует Квас");
                }
            }

            if (line.equals("+Хлеб")) {
                isProduct = true;
                if (breadPrice <= wallet) {
                    System.out.println("Вы добавили Хлеб");
                    bread = bread + 1;
                    checkout = checkout + 1;
                    wallet = wallet - breadPrice; // руб.
                    needToPay = needToPay + breadPrice;
                } else {
                    System.out.println("Недостаточно средств для покупки данного товара!");
                }
            }
            if (line.equals("-Хлеб")) {
                isProduct = true;
                if (bread > 0) {
                    System.out.println("Вы удалили продукт Хлеб");
                    bread = bread - 1;
                    checkout = checkout - 1;
                    wallet = wallet + breadPrice;
                    needToPay = needToPay - breadPrice;
                } else {
                    System.out.println("В корзине отсутствует Хлеб");
                }
            }
            if (line.equals("+Рыба")) {
                isProduct = true;
                if (fishPrice <= wallet) {
                    System.out.println("Вы добавили рыбу");
                    fish = fish + 1;
                    checkout = checkout + 1;
                    wallet = wallet - fishPrice; // руб.
                    needToPay = needToPay + fishPrice;
                } else {
                    System.out.println("Недостаточно средств для покупки данного товара!");
                }
            }
            if (line.equals("-Рыба")) {
                isProduct = true;
                if (fish > 0) {
                    System.out.println("Вы удалили продукт Рыба");
                    fish = fish - 1;
                    checkout = checkout - 1;
                    wallet = wallet + fishPrice;
                    needToPay = needToPay - fishPrice;
                } else {
                    System.out.println("В корзине отсутствует Рыба");
                }
            }
            if (line.equals("+Пиво")) {
                isProduct = true;
                if (beerPrice <= wallet) {
                    System.out.println("Вы добавили Пиво");
                    beer = beer + 1;
                    checkout = checkout + 1;
                    wallet = wallet - beerPrice; // руб.
                    needToPay = needToPay + beerPrice;
                } else {
                    System.out.println("Недостаточно средств для покупки данного товара!");
                }
            }
            if (line.equals("-Пиво")) {
                isProduct = true;
                if (beer > 0) {
                    System.out.println("Вы удалили продукт Пиво");
                    beer = beer - 1;
                    checkout = checkout - 1;
                    wallet = wallet + beerPrice;
                    needToPay = needToPay - beerPrice;
                } else {
                    System.out.println("В корзине отсутсвует Пиво");
                }
            }

            if (line.equals("+Колбаса")) {
                isProduct = true;
                if (sausagePrice <= wallet) {
                    System.out.println("Вы добавили колбасу");
                    sausage = sausage + 1;
                    checkout = checkout + 1;
                    wallet = wallet - sausagePrice; // руб.
                    needToPay = needToPay + sausagePrice;
                } else {
                    System.out.println("Недостаточно средств для покупки данного товара!");
                }
            }
            if (line.equals("-Колбаса")) {
                isProduct = true;
                if (sausage > 0) {
                    System.out.println("Вы удалили продукт Колбаса");
                    sausage = sausage - 1;
                    checkout = checkout - 1;
                    wallet = wallet + sausagePrice;
                    needToPay = needToPay - sausagePrice;
                } else {
                    System.out.println("В корзине отсутсвует Колбаса");
                }
            }

            if (line.equals("+Чипсы")) {
                isProduct = true;
                if (chipsPrice <= wallet) {
                    System.out.println("Вы добавили чипсы");
                    chips = chips + 1;
                    checkout = checkout + 1;
                    wallet = wallet - chipsPrice;
                    needToPay = needToPay + chipsPrice;
                } else {
                    System.out.println("Недостаточно средств для покупки данного товара!");
                }
            }
            if (line.equals("-Чипсы")) {
                isProduct = true;
                if (chips > 0) {
                    System.out.println("Вы удалили продукт Чипсы");
                    chips = chips - 1;
                    checkout = checkout - 1;
                    wallet = wallet + chipsPrice;
                    needToPay = needToPay - chipsPrice;
                } else {
                    System.out.println("В корзине отсутствует Чипсы");
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
        text = text + " К оплате " + needToPay + " руб.";
        if (checkout > 0) {
            System.out.println(name + text);
        } else {
            System.out.println("Спасибо что посетили наш магазин");
        }
        // System.out.println(name + " Итого у вас в корзине: Квас " + kvass + ", Хлеб " + bread + ", Рыба " + fish + ", Пиво " + beer + ", Колбоса " + sausage + ", Чипсы " + chips + " ");
    }
}

