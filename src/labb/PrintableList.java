package labb;

import java.util.*;

public class PrintableList<T> {

    List<T> list;

    PrintableList(T[] items) {
        list = Arrays.asList(items);
    }

    List<T> getList() {
        return list;
    }

    void printItems() {
        for (T item : list) {
            System.out.println(item);
        }

        NumberBox<Integer> nb1 = new NumberBox<>();
        nb1.setItem(10);
        System.out.println(nb1.add(5));

        NumberBox<Double> nb2 = new NumberBox<>();
        nb2.setItem(2.5);
        System.out.println(nb2.add(1.5));

    }
    
    static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
        
    }
    static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    
}

