import box.MagicBox;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MagicBox<Integer> magicBox = new MagicBox<>(5);
        Random random = new Random();


        while (true) {
            System.out.println("Введите число или end");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Случайное число из коробки: " + magicBox.pick());
                break;
            } else {
                String[] parts = input.split(" ");
                Integer item = Integer.parseInt(parts[0]);
                System.out.println(magicBox.add(item));
            }

        }
    }


}



