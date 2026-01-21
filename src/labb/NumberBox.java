package labb;

public class NumberBox<T extends Number> {

    T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    double add(Number n) {
        return item.doubleValue() + n.doubleValue();
    }
}
