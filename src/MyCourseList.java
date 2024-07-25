import java.awt.*;

/**
 * This class models a list of Tasks. It implements the ListADT as a doubly linked list that stores only elements of
 * type Course
 */
public class MyCourseList implements ListADT<Course>{
    // Reference to the first node in this list
    private LinkedNode<Course> head; // Initialize to null
    // Reference to the last node in this list
    private LinkedNode<Course> tail; // Initialize to null
    private int size = 0; // Total number of Course objects stored in the list

    /**
     * Check if the list is empty
     * @return true if the list is empty or false otherwise
     */
    @Override
    public boolean isEmpty() {
        return (size == 0 || head == null || tail == null);
    }

    /**
     * Returns the size of the list
     * @return the number of items in the list
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Removes all the elements from the list. The list will be empty
     */
    @Override
    public void clear() {
        // Clear the list by setting head and tail to null, size to 0
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Adds newElement to the end (tail) of the list
     *
     * @param newElement - element to be added to this list
     * @throws NullPointerException - if newElement is null
     */
    @Override
    public void add(Course newElement) {
        if (newElement == null){
            throw new NullPointerException();
        }
        LinkedNode<Course> newNode = new LinkedNode<Course>(newElement);
        // case 1: add to empty list
        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        }
        // case 2: add to non-empty list
        else{
            this.tail.setNext(newNode);
            newNode.setPrev(tail);
            this.tail = newNode;
        }
        this.size++;
    }

    /**
     * Adds newElement at the given position index within this list
     *
     * @param index - Index at which the specified element is to be inserted
     * @param newElement - element to be added to the list
     * @throws NullPointerException - if newElement is null
     * @throws IndexOutOfBoundsException - if the index is out of range
     */
    @Override
    public void add(int index, Course newElement) {
        LinkedNode<Course> current = head;
        LinkedNode<Course> newEle = new LinkedNode<Course>(newElement);
        if (newElement == null) {
            throw new NullPointerException("newElement cannot be null!");
        }
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size && size == 0) {
            head = newEle;
            tail = newEle;
        } else if (index == 0) {
            head.setPrev(newEle);
            newEle.setNext(head);
            head = newEle;
        } else if (index == size) {
            tail.setNext(newEle);
            newEle.setPrev(tail);
            tail = newEle;
        } else {
            for (int i = 0; i < index; i++){
                current = current.getNext();
            }
            current.getPrev().setNext(newEle);
            newEle.setPrev(current.getPrev());
            current.setPrev(newEle);
            newEle.setNext(current);
        }
        size++;
    }

    /**
     * Adds new Element to the head of the list
     * @param newElement - Element to be added to the list
     * @throws NullPointerException - if newELement is null
     */
    @Override
    public void addFirst(Course newElement) {
        this.add(0, newElement);
    }

    @Override
    public Course get(int index) {
        return null;
    }

    @Override
    public boolean contains(Course toFind) {
        return false;
    }

    @Override
    public Course remove(int index) {
        return null;
    }
}
