import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchSolutionTest {
    private BinarySearchSolution solution = new BinarySearchSolution();

    @Test
    public void testNormalSearch() {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        assertEquals(4, solution.search(nums, target));
    }

    @Test
    public void testTargetNotFound() {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 2;
        assertEquals(-1, solution.search(nums, target));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int target = 1;
        assertEquals(-1, solution.search(nums, target));
    }

    @Test
    public void testSingleElement() {
        int[] nums = { 5 };
        int target = 5;
        assertEquals(0, solution.search(nums, target));
    }

    @Test
    public void testFirstElement() {
        int[] nums = { 1, 3, 5, 7, 9 };
        int target = 1;
        assertEquals(0, solution.search(nums, target));
    }

    @Test
    public void testLastElement() {
        int[] nums = { 1, 3, 5, 7, 9 };
        int target = 9;
        assertEquals(4, solution.search(nums, target));
    }

    @Test
    public void testAllNegative() {
        int[] nums = { -5, -3, -1, 0, 2, 4 };
        int target = -3;
        assertEquals(1, solution.search(nums, target));
    }

    @Test
    public void testLargeArray() {
        int[] nums = new int[10000];
        for (int i = 0; i < 10000; i++) {
            nums[i] = i;
        }
        int target = 9999;
        assertEquals(9999, solution.search(nums, target));
    }
}