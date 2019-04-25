package sortings;

public class Sorter {

    private SortingStrategy sortingStrategy;

    public Sorter(SortingStrategy sortingStrategy) {
        super();
        this.sortingStrategy = sortingStrategy;
    }

    public int[] sort(int[] elements) {
        return sortingStrategy.sort(elements);
    }

}
