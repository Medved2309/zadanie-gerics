package box;


public class MagicBox<T> {

    protected int SIZE = 5;

    T[] items = (T[]) new Object[SIZE];

    public boolean add(T item) { // Заполнение коробки
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("Добавили " + item);
                return true;
            }
        }
        return false;
    }

    public int pick() { // проверка на заполнение коробки
        int difference = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                difference = items.length - i +1;
                break;


            }
        }
        return difference;
    }

}



