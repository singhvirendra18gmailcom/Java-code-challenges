package sortings;

/*
 * Interface to sort an array with n number of elements
 */
@FunctionalInterface
public interface SortingStrategy {

    public int[] sort(int[] elements);
}
