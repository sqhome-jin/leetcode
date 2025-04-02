import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testExample1() {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        assertEquals(4, solution.search(nums, target));
    }

    @Test
    public void testExample2() {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 3;
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
    public void testTargetAtStart() {
        int[] nums = { 1, 3, 5, 7, 9 };
        int target = 1;
        assertEquals(0, solution.search(nums, target));
    }

    @Test
    public void testTargetAtEnd() {
        int[] nums = { 1, 3, 5, 7, 9 };
        int target = 9;
        assertEquals(4, solution.search(nums, target));
    }

    @Test
    public void testNegativeNumbers() {
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