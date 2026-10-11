package neetcode.arrayshashing;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    private final TwoSum solver = new TwoSum();

    /** Sorts the answer so the test passes whichever order the indices come back in. */
    private int[] sorted(int[] result) {
        int[] copy = result.clone();
        Arrays.sort(copy);
        return copy;
    }

    @Test
    void example1() {
        assertArrayEquals(new int[] {0, 1}, sorted(solver.twoSum(new int[] {2, 7, 11, 15}, 9)));
    }

    @Test
    void example2() {
        assertArrayEquals(new int[] {1, 2}, sorted(solver.twoSum(new int[] {3, 2, 4}, 6)));
    }

    @Test
    void duplicateValues() {
        assertArrayEquals(new int[] {0, 1}, sorted(solver.twoSum(new int[] {3, 3}, 6)));
    }

    @Test
    void negativeNumbers() {
        assertArrayEquals(new int[] {2, 4}, sorted(solver.twoSum(new int[] {-1, -2, -3, -4, -5}, -8)));
    }

    @Test
    void answerAtEndOfArray() {
        assertArrayEquals(new int[] {3, 4}, sorted(solver.twoSum(new int[] {1, 2, 3, 10, 20}, 30)));
    }
}
