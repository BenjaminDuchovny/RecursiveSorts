package ComplexSorts;

import java.util.List;

public interface QuickSort {

    /***
     *
     * @param array The array to be sorted of a generic comparable type
     * @return The sorted array
     */
    public <T extends Comparable<T> & Cloneable> T[] quickSort(T[] array);

    /***
     *
     * @param array The array to be sorted of a generic comparable type
     * @param startIndex The first index of the region to sort, inclusive
     * @param endIndex The final index of the region to sort, exclusive
     * @return The array with the region sorted
     */
    public <T extends Comparable<T> & Cloneable> T[] quickSort(T[] array, int startIndex, int endIndex);



    /***
     *
     * @param list The list to be sorted of a generic comparable type
     * @return The sorted list
     */
    public <T extends Comparable<T> & Cloneable> List<T> quickSort(List<T> list);

    /***
     *
     * @param list The list to be sorted of a generic comparable type
     * @param startIndex The first index of the region to sort, inclusive
     * @param endIndex The final index of the region to sort, exclusive
     * @return The list with the region sorted
     */
    public <T extends Comparable<T> & Cloneable> List<T> quickSort(List<T> list, int startIndex, int endIndex);
}
