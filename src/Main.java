import box.MagicBox;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MagicBox<Integer> magicBox = new MagicBox<>();
        Random random = new Random();
        int randomInt = random.nextInt(); // джава подберёт случайное число от 0 до ЧИСЛО невключительно
        //System.out.println(magicBox.add(22));
        //System.out.println(magicBox.add(10));
        //System.out.println(magicBox.add(40));
        //System.out.println(magicBox.add(300));
        //System.out.println(magicBox.add(25));

        while (true) {
            System.out.println("Введите число или end");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                if (magicBox.pick() == 0) {
                    System.out.println("Коробка заполнена полностью");
                  //  System.out.println("Случайное число из коробки " + );
                    break;
                } else {
                    System.out.println("RuntimeException коробка не заполнена осталось ввести ячеек " + magicBox.pick());
                }

            } else {
                String[] parts = input.split(" ");
                Integer item = Integer.parseInt(parts[0]);
                if (magicBox.add(item)){
                    System.out.println("RuntimeException коробка не заполнена полностью осталось ввести ячеек " + magicBox.pick());
                } else {
                    System.out.println("Коробка заполнена");
                  //  System.out.println("Случайное число из коробки " + );
                }

            }
        }


    }


}
