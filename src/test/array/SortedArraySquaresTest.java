package array;
import org.junit.jupiter.api.Test;

import solutions.array.SortedArraySquares;

import static org.junit.jupiter.api.Assertions.*;

public class SortedArraySquaresTest {
    private SortedArraySquares solution = new SortedArraySquares();

    @Test
    public void testMixedNumbers() {
        int[] nums = { -4, -1, 0, 3, 10 };
        int[] expected = { 0, 1, 9, 16, 100 };
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }

    @Test
    public void testMixedLargeNumbers() {
        int[] nums = { -7, -3, 2, 3, 11 };
        int[] expected = { 4, 9, 9, 49, 121 };
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int[] expected = {};
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }

    @Test
    public void testSingleElement() {
        int[] nums = { 5 };
        int[] expected = { 25 };
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }

    @Test
    public void testAllNegative() {
        int[] nums = { -5, -3, -1 };
        int[] expected = { 1, 9, 25 };
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }

    @Test
    public void testAllPositive() {
        int[] nums = { 1, 2, 3, 4 };
        int[] expected = { 1, 4, 9, 16 };
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }
}