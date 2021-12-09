package lesson3;

import java.util.Arrays;

public class Generic<T> {
    T[] object;
    public Generic(T[] object) {
        this.object = object;
    }
    public T[] getObject() {
        return  object;
    }

    public void changePosition() {
        System.out.println(Arrays.toString(object));
        T z = object[0];
        object[0] = object[1];
        object[1] = z;
        System.out.println(Arrays.toString(object));
    }
}
