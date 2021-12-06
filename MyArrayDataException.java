package lesson2;

public class MyArrayDataException extends RuntimeException {
    int i, j;

    public MyArrayDataException(int i, int j) {
        super("Не верные данные. У вас есть ячейки: строка " + i + " столбец " + j);
        this.i = i;
        this.j = j;
    }
}