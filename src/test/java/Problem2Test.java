import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        int inputs[][] = {
                {8, 6, 4, 2},
                {1, 3, 2, 4},
                {1, 2, 3, 4},
        };

        int expected[][] = {
                {2, 4, 6, 8},
                {1, 2, 3, 4},
                {1, 2, 3, 4},

        };
        for (int i = 0; i < inputs.length; i++){
            Problem2.bubbleSort(inputs[i]);
            assertArrayEquals(expected[i], inputs[i]);
        }
    }
}


