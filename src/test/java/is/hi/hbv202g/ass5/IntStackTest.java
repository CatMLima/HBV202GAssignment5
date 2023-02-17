package is.hi.hbv202g.ass5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntStackTest {
    private IntStack stack;
    private int capacity;
    @Before
    public void constructStackObject(){
        stack = new IntStack();
        capacity = stack.getCapacity();
    }

    @Test
    public void testNewStackIsNotFull() {
        assertFalse(stack.isFull());
    }
    @Test
    public void testFullStackIsFull(){
        int j = 0;
        while (j<capacity){
            stack.push(1);
            j++;
        }
        assertTrue(stack.isFull());
    }

    public void testCornerCase(){
        int cornerEnd = capacity - 1;
        int j = 0;
        while (j < cornerEnd){
            stack.push(2);
            j++;
        }
        assertFalse(stack.isFull());
    }
    @Test
    public void testPopReturnsPushedValue(){
        stack.push(1);
        stack.pop();
        assertEquals(1, stack.pop());
    }
    @Test (expected= ArrayIndexOutOfBoundsException.class)
    public void throwsExceptionCornerCasePop(){
        stack.pop();
    }
    @Test (expected= ArrayIndexOutOfBoundsException.class)
    public void cornerCasePush(){
        int j = 0;
        while (j<capacity){
            stack.push(2);
            j++;
        }
        stack.push(2);
    }
    @Test
    public void isEmptyTestWhenEmpty(){
        assertTrue(stack.isEmpty());
    }
    @Test
    public void isEmptyTestWhenFull(){
        int j = 0;
        while (j< capacity){
            stack.push(1);
        }
        assertFalse(stack.isEmpty());
    }

}
