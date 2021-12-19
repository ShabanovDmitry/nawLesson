package lesson5;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/lesson5/csv1.csv");


        if (!file.exists()) {
            throw new IOException("Файл не существует");
        }

        AppData appData = new AppData(new String[]{"Value 1"}, new int[][]{{100}, {300}});
        AppData appData1 = new AppData(new String[]{"Value 2"}, new int[][]{{200}, {400}});
        AppData appData2 = new AppData(new String[]{"Value 3"}, new int[][]{{123}, {500}});
        ArrayList<AppData> arrayList = new ArrayList<>();
        arrayList.add(appData);
        arrayList.add(appData1);
        arrayList.add(appData2);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            for (AppData ap : arrayList) {
                objectOutputStream.writeObject(ap);
            }
        }


        ArrayList<AppData> readCsv = new ArrayList<>();

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            for (int i = 0; i < arrayList.size(); i++) {
                readCsv.add((AppData) objectInputStream.readObject());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(readCsv);
    }
}

