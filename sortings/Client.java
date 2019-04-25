package sortings;

public class Client {

    public static void main(String[] args) {

        int[] elements = { 7, 13, 2, 9, 1, 0, 15, 37, 6 };

        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
        Sorter sorter = new Sorter(new BubbleSortStrategy());
        elements = sorter.sort(elements);
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }

    }
}
