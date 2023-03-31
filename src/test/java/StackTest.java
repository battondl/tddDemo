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
}
