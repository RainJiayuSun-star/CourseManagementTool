/**
 * This interface represents the list abstract data type
 * @param <T> type of elements stored in the list
 */
public interface ListADT<T> {
    /**
     * Checks whether this list is empty
     * @return true if this list is empty or false otherwise
     */
    public boolean isEmpty();

    /**
     * Gets the total number of elements stored in this list
     * @return the size of this list
     */
    public int size();

    /**
     * Removes all the elements from this list.
     * The list will be empty after this call returns
     */
    public void clear();

    /**
     * Adds newElement to this list
     * @param newElement element to be added to this list
     * @throws NullPointerException if newElement is null
     */
    public void add(T newElement);

    /**
     * Adds new Element to the head of this list
     *
     * @param newElement Element to be added to the list
     * @throws NullPointerException if newElement is null
     */
    public void addFirst(T newElement);

    /**
     * Add newElement at the given position index within the list
     * @param index Index at which the specified element is to be inserted
     * @param newElement element to be added to the list
     * @throws NullPointerException if newElement is null
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public void add(int index, T newElement);

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in the list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public T get(int index);

    /**
     * Returns true if this list contains the specified element toFind.
     * More formally, returns true if and only if the list contains at
     * least one element e such that toFind.equals(e) == true.
     * @param toFind toFind element to find
     * @return true if this list contains at least one match with toFind
     */
    public boolean contains(T toFind);

    /**
     * Removes the element at the specified position in the list
     *
     * @param index the index of the element to be removed
     * @return the element that was removed from the list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public T remove(int index);
}
