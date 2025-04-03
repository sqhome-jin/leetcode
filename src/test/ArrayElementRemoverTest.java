import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayElementRemoverTest {
    private ArrayElementRemover solution = new ArrayElementRemover();

    @Test
    public void testNormalRemove() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        assertEquals(2, solution.removeElement(nums, val));
    }

    @Test
    public void testAllSameElements() {
        int[] nums = {2, 2, 2, 2};
        int val = 2;
        assertEquals(0, solution.removeElement(nums, val));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int val = 1;
        assertEquals(0, solution.removeElement(nums, val));
    }

    @Test
    public void testSingleElement() {
        int[] nums = {1};
        int val = 1;
        assertEquals(0, solution.removeElement(nums, val));
    }

    @Test
    public void testNoMatch() {
        int[] nums = {1, 2, 3, 4};
        int val = 5;
        assertEquals(4, solution.removeElement(nums, val));
    }

    @Test
    public void testAllDifferent() {
        int[] nums = {1, 2, 3, 4};
        int val = 4;
        assertEquals(3, solution.removeElement(nums, val));
    }
}