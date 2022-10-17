import box.MagicBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MagicBox<Integer> magicBox = new MagicBox<>();
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
                System.out.println("Заполнение коробке окончено");
                break;

            } else {
                String[] parts = input.split(" ");
               Integer Ba = Integer.parseInt(parts[0]) - 1;
                System.out.println(magicBox.add(Ba));

            }
        }


    }


}
