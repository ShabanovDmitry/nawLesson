package lesson3;

import java.util.ArrayList;

public class Box<F extends Fruit> {

    private ArrayList<F> fruits;
    private float totalWeight;

    public Box() {
        fruits = new ArrayList<>();
    }

    public Box(ArrayList<F> fruits) {
        this.fruits = fruits;
    }

    public Box(F fruit) {
        fruits = new ArrayList<F>();
        fruits.add(fruit);
    }

    public ArrayList<F> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<F> fruits) {
        this.fruits = fruits;
    }

    public float getTotalWeight() {
        if (fruits.size() != 0) {
            int f = 0;
            totalWeight = fruits.size() * fruits.get(f).getWeight();
        } else {
            System.out.println("В коробке нет фрутков.");
        }
        return totalWeight;
    }

    public  boolean compare(Box<?> otherBox) {
        return getTotalWeight() == otherBox.getTotalWeight();
    }

    public void replaceFruits(Box<F> otherBox) {
        otherBox.fruits.addAll(fruits);
        fruits.clear();
    }

    public  void addFruit(F fruitAdd) {
        fruits.add(fruitAdd);
    }
}
