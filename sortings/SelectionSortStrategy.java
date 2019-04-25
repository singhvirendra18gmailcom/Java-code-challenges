package sortings;

public class SelectionSortStrategy extends AbstractSortingStrategy {

    @Override
    public int[] sort(int[] elements) {
        super.sort(this.getClass().getName().toString());
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
            for (int j = i + 1; j < size; ++j) {
                if (elements[i] > elements[j]) {
                    temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                    isAlreadySorted = false;
                }
            }
        }

        if (isAlreadySorted)
            throw new IllegalArgumentException("array passed is already sorted");
    }

}
