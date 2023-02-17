package is.hi.hbv202g.ass5;

/**
 * A very simple stack for storing the basic type int.
 * The stack has a fixed capacity.
 */
public class IntStack {
    /**
     * The maximum capacity of the stack.
     * This value is fixed.
     */
    private final int theCapacity = 10;

    /**
     * The data structure used to store the stack.
     * Private, i.e. do not make any assumptions on how the stack is stored.
     */
    private int[] theStack;

    /**
     * Location in theStack array, where next push
     * will insert. 0 means: stack is empty
     */
    private int nextPushLocation; // .

    /**
     * Construct an empty stack.
     */
    public IntStack() {
        theStack = new int[theCapacity];
        nextPushLocation = 0;
    }

    /**
     * Return the capacity of the stack.
     * @return the capacity of the stack
     */
    public int getCapacity() {
        return theCapacity;
    }

    /**
     * Returns whether the stack is full.
     * A further push would throw an exception.
     * @return true if the stack is full, false if the stack is not full
     */
    public boolean isFull() {
        if (nextPushLocation == theCapacity) {
            return true;
        } else {
            return false;
        }
    }

    // TODO: Add isEmpty() method
    public boolean isEmpty(){
        return nextPushLocation == 0;
    }

    /**
     * Push on int on the stack.
     * @param element The int to be pushed on the stack
     * @throws ArrayIndexOutOfBoundsException If the stack was already full
     */
    public void push(int element) throws ArrayIndexOutOfBoundsException {
        theStack[nextPushLocation++] = element;
    }

    /**
     * Pops an int from the stack
     * @return The poppsed int
     * @throws ArrayIndexOutOfBoundsException If the stack was already empty
     */
    public int pop() throws ArrayIndexOutOfBoundsException {
        return theStack[--nextPushLocation];
    }

}
