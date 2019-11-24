package wc.wc_submoduleexample;

public class BinarySearch {

    /**
     *
     * @param array sorted integer array
     * @param startIndex starting index
     * @param endIndex end index
     * @param element element which need to find
     * @return index of the requested element
     */
    public static int doRecursively(int array[], int startIndex, int endIndex, int element) {
        if (startIndex <= endIndex) {
            int midOfTheArray = startIndex + (endIndex - startIndex) / 2;
            //Check if the element itself on the middle node
            if (array[midOfTheArray] == element)
                return midOfTheArray;
            //Check if it is in the right side of the array
            if (element < array[midOfTheArray])
                return doRecursively(array, startIndex, midOfTheArray - 1, element);
            //else it is in the left side of the array
            return doRecursively(array, midOfTheArray - 1, endIndex, element);
        }
        return -1;
    }

    /**
     *
     * @param array sorted integer array
     * @param element element which need to find
     * @return the index of the element
     */
    public int doIteratively(int array[], int element) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        while (startIndex <= endIndex) {
            int midOfTheArray = startIndex + (endIndex - startIndex) / 2;
            if (array[midOfTheArray] == element)
                return midOfTheArray;
            if (element < array[midOfTheArray])
                endIndex = midOfTheArray - 1;
            else
                startIndex = midOfTheArray + 1;
        }
        return -1;
    }

}
