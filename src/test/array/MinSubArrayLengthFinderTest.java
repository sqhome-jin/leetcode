package array;
import org.junit.jupiter.api.Test;

import solutions.array.MinSubArrayLengthFinder;

import static org.junit.jupiter.api.Assertions.*;

public class MinSubArrayLengthFinderTest {
    private MinSubArrayLengthFinder solution = new MinSubArrayLengthFinder();

    @Test
    public void testExample() {
        // 测试题目给出的示例
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        assertEquals(2, solution.findMinSubArrayLen(target, nums));
    }

    @Test
    public void testNoSolution() {
        // 测试不存在满足条件的子数组的情况
        int[] nums = {1,1,1,1};
        int target = 10;
        assertEquals(0, solution.findMinSubArrayLen(target, nums));
    }

    @Test
    public void testSingleElement() {
        // 测试单个元素满足条件的情况
        int[] nums = {5};
        int target = 5;
        assertEquals(1, solution.findMinSubArrayLen(target, nums));
    }

    @Test
    public void testEmptyArray() {
        // 测试空数组的情况
        int[] nums = {};
        int target = 5;
        assertEquals(0, solution.findMinSubArrayLen(target, nums));
    }

    @Test
    public void testLargeTarget() {
        // 测试目标值较大的情况
        int[] nums = {1,2,3,4,5};
        int target = 15;
        assertEquals(5, solution.findMinSubArrayLen(target, nums));
    }
}