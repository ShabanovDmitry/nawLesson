package lesson3;

public class Main {
    public static void main(String[] args) {

        Generic<Double> twoNumbers = new Generic<>(new Double[]{4.2 , 6.7});
        twoNumbers.changePosition();

        Box<Apple> appleBox = new Box<>();
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();
        Apple a4 = new Apple();

        appleBox.addFruit(a1);
        appleBox.addFruit(a2);
        appleBox.addFruit(a3);
        appleBox.addFruit(a4);

        System.out.println("Вес коробки с яблоками " + appleBox.getTotalWeight());

        Box<Orange> orangeBox = new Box<>();
        Orange o1 = new Orange();
        Orange o2 = new Orange();
        Orange o3 = new Orange();
        Orange o4 = new Orange();

        orangeBox.addFruit(o1);
        orangeBox.addFruit(o2);
        orangeBox.addFruit(o3);
        orangeBox.addFruit(o4);

        System.out.println("Вес коробки с апельсинами " + orangeBox.getTotalWeight());

        System.out.println(orangeBox.compare(appleBox));

        Box<Apple> newAppleBox = new Box<>();
        appleBox.replaceFruits(newAppleBox);

        Apple a5 = new Apple();
        newAppleBox.addFruit(a5);
        System.out.println("Вес новой коробки с фруктами " + newAppleBox.getTotalWeight());
    }
}
