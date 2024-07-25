/**
 * This class models LinkedNodes used to build a doubly linked list
 *
 * @param <T> Type of the element stored within this list
 */
public class LinkedNode<T> {
    /**
     * data carried by this node
     */
    private T data;

    /**
     * reference to the previous node
     */
    private LinkedNode<T> prev;
    /**
     * reference to the next node
     */
    private LinkedNode<T> next;

    /**
     * Creates a new LinkedNode with a given data and no previous or next nodes in the chain of linked nodes
     *
     * @param data data to be carried by this node
     */
    public LinkedNode(T data){
        this.data = data;
    }
    public LinkedNode(T data, LinkedNode<T> prev, LinkedNode<T> next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    /**
     * Returns the data carried by this node
     * @return the data
     */
    public T getData(){
        return this.data;
    }

    /**
     * Set the data of this node
     * @param data the data to set
     */
    public void setData(T data){
        this.data = data;
    }

    /**
     * Sets the previous node of current node
     * @param prev the previous node
     */
    public void setPrev(LinkedNode<T> prev){
        this.prev = prev;
    }

    /**
     * Returns the previous node of this node
     * @return the previous node
     */
    public LinkedNode<T> getPrev() {
        return this.prev;
    }

    /**
     * Set the next node of the current node
     * @param next the next node
     */
    public void setNext(LinkedNode<T> next){
        this.next = next;
    }

    /**
     * Get the next node
     * @return the next node
     */
    public LinkedNode<T> getNext() {
        return this.next;
    }
}
