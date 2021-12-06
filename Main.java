package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        String[][] newArr = new String[x][y];
        try {
            createArr(newArr, sc, x, y);
            System.out.println(+calcArr(newArr, x, y));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    private static void createArr(String[][] array, Scanner sc, int x, int y) {
        if (x != 4 || y != 4) throw new MyArraySizeException(x, y);
        System.out.println("Создайте массив");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = sc.next();
            }
        }
        calcArr(array, x, y);
    }

    private static int calcArr(String[][] array, int x, int y) {
        int sum = 0;
        int[][] arrayInt = new int[x][y];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    arrayInt[i][j] = Integer.parseInt(array[i][j]);
                    sum += arrayInt[i][j];
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
