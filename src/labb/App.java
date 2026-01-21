package labb;

public class App {
    public static void main(String[] args) {

        String[] s = {"A", "B", "C"};
        PrintableList<String> p1 = new PrintableList<>(s);
        p1.printItems();

        Integer[] n = {1, 2, 3};
        PrintableList<Integer> p2 = new PrintableList<>(n);
        p2.printItems();
    }
}
