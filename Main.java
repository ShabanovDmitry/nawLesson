package lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        PhoneBook();

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("айкидо");
        arrayList.add("серёжка");
        arrayList.add("данные");
        arrayList.add("мезофаза");
        arrayList.add("опция");
        arrayList.add("зиждительство");
        arrayList.add("опция");
        arrayList.add("анекдот");
        arrayList.add("линкор");
        arrayList.add("напраслина");
        arrayList.add("данные");
        arrayList.add("анекдот");
        arrayList.add("опция");
        arrayList.add("данные");
        arrayList.add("анекдот");
        arrayList.add("линкор");
        arrayList.add("зиждительство");
        arrayList.add("зиждительство");
        arrayList.add("мезофаза");
        arrayList.add("опция");

        HashMap<String, Integer> mostUsableWord = new HashMap<>();

        for (String word: arrayList) {
            if (mostUsableWord.get(word) == null) {
                mostUsableWord.put(word, 1);
            } else {
                mostUsableWord.put(word, mostUsableWord.get(word) + 1);
            }
        }

        System.out.println(mostUsableWord);
    }



    private static void PhoneBook() {

        Phonebook phonebook = new Phonebook();
        phonebook.add(111111, "Борисов");
        phonebook.add(222222, "Волков");
        phonebook.add(333333, "Жилин");
        phonebook.add(444444, "Кузнецов");
        phonebook.add(555555, "Попов");
        phonebook.add(666666, "Кузнецов");

        phonebook.get("Волков");
        phonebook.get("Борисов");
        phonebook.get("Кузнецов");
        phonebook.get("Берилов");
    }
}
