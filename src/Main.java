import box.MagicBox;

public class Main {
    public static void main(String[] args) {
        numberMagicBox();
        stringMagicBox();
    }

    private static void numberMagicBox() {
        System.out.println("Магическая коробка с цифрами:");
        MagicBox<Integer> magicBox = new MagicBox<>(5);
        System.out.println(magicBox.add(50));
        System.out.println(magicBox.add(7));
        System.out.println(magicBox.add(10));
        System.out.println(magicBox.add(100));
        System.out.println(magicBox.add(70));
        System.out.println(magicBox.add(70));
        Integer pick = magicBox.pick();
        System.out.println("Случайная цифра из коробки: " + pick);

    }

    private static void stringMagicBox() {
        System.out.println("Магическая коробка со словами");
        MagicBox<String> magicBox = new MagicBox<>(4);
        System.out.println(magicBox.add("Pety"));
        System.out.println(magicBox.add("Птички"));
        System.out.println(magicBox.add("Медведи"));
        System.out.println(magicBox.add("Бусы"));
        System.out.println(magicBox.add("Медведи"));
        String pick = magicBox.pick();
        System.out.println("Случайное слово из коробки: " + pick);

    }

}
