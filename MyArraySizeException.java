package lesson2;

public class MyArraySizeException extends RuntimeException {
    int x, y;

    public MyArraySizeException(int x, int y) {
        super("Не верные данные. Максимальный объём массива 4. У вас есть ячейки: строка " + x + " столбец " + y);
        this.x = x;
        this.y = y;
    }
}
