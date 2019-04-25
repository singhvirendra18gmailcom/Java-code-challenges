package sortings;

public class BubbleSortStrategy extends AbstractSortingStrategy {

    @Override
    public int[] sort(int[] elements) {
        super.sort(this.getClass().getCanonicalName());
        sortArray(elements);
        return elements;

    }

    private void sortArray(int[] elements) {
        int size = elements.length;
        boolean isAlreadySorted = true;
        if (size == 0)
            throw new IllegalArgumentException("There is no element available to sort");
        int temp;
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size - i - 1; ++j) {
                if (elements[j] > elements[j + 1]) {
                    temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                    isAlreadySorted = false;
                }
            }
        }

        if (isAlreadySorted)
            throw new IllegalArgumentException("array passed is already sorted");
    }

}
