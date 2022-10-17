package box;

import java.util.Random;

public class MagicBox<T> {

    Random random = new Random();


    private T[] items;

    public MagicBox(int SIZE) {
        this.items = (T[]) new Object[SIZE];
    }

    public boolean add(T item) { // Заполнение коробки
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("Добавили: " + item + ". Осталось добавить элементов " + (items.length - i));
                return true;
            }
        }
        System.out.println("Коробка заполнена нажмите end");
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException(String.format("Коробка не заполна, необходимо добавить в коробку %d элементов", items.length - i));
            }
       }
        int randomInt = random.nextInt(items.length);
        return items[randomInt];

    }

}



