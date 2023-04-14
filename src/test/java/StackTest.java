import org.example.Stack;
import org.example.StackEmptyException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private Stack stack;

    @BeforeEach
    void resetStack() {
        stack = new Stack();
    }

    @Test
    void stackInit() {
        assertNotNull(stack);
    }

    @Test
    void isEmptyReturnsTrueIfEmpty() {

        assertTrue(stack.isEmpty());
    }

    @Test
    void isEmptyReturnsFalseIfStackIsNotEmpty() {

        stack.push("John");
        assertFalse(stack.isEmpty());
    }

    @Test
    void peekThrowsStackEmptyExceptionIfStackIsEmpty() {
        Throwable exception = assertThrows(StackEmptyException.class, () ->
                stack.peek());

        assertEquals("Stack is Empty!", exception.getMessage());
    }

    @Test
    void peekReturnsItemInStack() throws StackEmptyException {
        stack.push(5);
        assertEquals(5, stack.peek());
    }

    @Test
    void popReturnsItemInStack() {
        stack.push(3.14);
        assertEquals(3.14, stack.pop());
    }

    @Test
    void popReturnsNullIfEmpty() {
        assertNull(stack.pop());
    }

    @Test
    void peekThrowsStackEmptyExceptionAfterPop() {
        stack.push("Leeroy");
        stack.pop();

        Throwable exception = assertThrows(StackEmptyException.class, () ->
                stack.peek());

        assertEquals("Stack is Empty!", exception.getMessage());

    }

    @Test
    void push3ItemsPopEqualsLastItemPeekEquals2ndItem() throws StackEmptyException {
        stack.push(42);
        stack.push("Jenkins");
        stack.push(5.5);

        var resultPop = stack.pop();
        var resultPeek = stack.peek();
        assertEquals(5.5, resultPop);
        assertEquals("Jenkins", resultPeek);

    }

}
