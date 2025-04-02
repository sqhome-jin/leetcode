import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testExample1() {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int result = solution.removeElement(nums, val);
        assertEquals(2, result);
        assertEquals(2, nums[0]);
        assertEquals(2, nums[1]);
    }

    @Test
    public void testExample2() {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int result = solution.removeElement(nums, val);
        assertEquals(5, result);
        assertEquals(0, nums[0]);
        assertEquals(1, nums[1]);
        assertEquals(3, nums[2]);
        assertEquals(0, nums[3]);
        assertEquals(4, nums[4]);
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int val = 1;
        int result = solution.removeElement(nums, val);
        assertEquals(0, result);
    }

    @Test
    public void testSingleElement() {
        int[] nums = { 1 };
        int val = 1;
        int result = solution.removeElement(nums, val);
        assertEquals(0, result);
    }

    @Test
    public void testNoMatchingElements() {
        int[] nums = { 1, 2, 3, 4, 5 };
        int val = 6;
        int result = solution.removeElement(nums, val);
        assertEquals(5, result);
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
        assertEquals(3, nums[2]);
        assertEquals(4, nums[3]);
        assertEquals(5, nums[4]);
    }

    @Test
    public void testAllMatchingElements() {
        int[] nums = { 1, 1, 1, 1, 1 };
        int val = 1;
        int result = solution.removeElement(nums, val);
        assertEquals(0, result);
    }
}