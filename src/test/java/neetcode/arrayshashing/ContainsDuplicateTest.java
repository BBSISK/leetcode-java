package neetcode.arrayshashing;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class ContainsDuplicateTest {

    private final ContainsDuplicate solver = new ContainsDuplicate();

    @Test
    void example1() {
        assertTrue(solver.containsDuplicate(new int[] {1, 2, 3, 1}));
    }

    @Test
    void example2() {
        assertFalse(solver.containsDuplicate(new int[] {1, 2, 3, 4}));
    }

    @Test
    void example3() {
        assertTrue(solver.containsDuplicate(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    @Test
    void emptyArray() {
        assertFalse(solver.containsDuplicate(new int[] {}));
    }

    @Test
    void singleElement() {
        assertFalse(solver.containsDuplicate(new int[] {7}));
    }

    @Test
    void negativeNumbers() {
        assertTrue(solver.containsDuplicate(new int[] {-5, 0, 3, -5}));
        assertFalse(solver.containsDuplicate(new int[] {-1, 1, -2, 2}));
    }

    /** 100,000 distinct numbers: a nested-loop O(n^2) solution is too slow to finish in 1 second. */
    @Test
    @Timeout(1)
    void largeArrayNoDuplicates() {
        int[] nums = new int[100_000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 3;
        }
        assertFalse(solver.containsDuplicate(nums));
    }
}
