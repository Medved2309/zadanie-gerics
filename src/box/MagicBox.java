package box;


public class MagicBox<T> {

    protected int SIZE = 4;

    T[] items = (T[]) new Object[SIZE];

    public boolean add(T b) { // Заполнение коробки
        for (int i = 0; i < SIZE; i++) {
            if (items[i] == null) {
                items[i] = b;
                return true;
            }
        }
        return false;
    }

}



