import org.junit.jupiter.api.Test;

import solutions.array.ArrayRangeSumCalculator;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayRangeSumCalculatorTest {
    private ArrayRangeSumCalculator solution = new ArrayRangeSumCalculator();

    @Test
    public void testExample() {
        // 测试题目给出的示例
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(3, solution.calculateRangeSum(nums, 0, 1));  // [1,2] = 3
        assertEquals(9, solution.calculateRangeSum(nums, 1, 3));  // [2,3,4] = 9
    }

    @Test
    public void testSingleElement() {
        // 测试单个元素的情况
        int[] nums = {5};
        assertEquals(5, solution.calculateRangeSum(nums, 0, 0));
    }

    @Test
    public void testFullRange() {
        // 测试整个数组范围的情况
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(15, solution.calculateRangeSum(nums, 0, 4));
    }

    @Test
    public void testSameStartEnd() {
        // 测试起始位置和结束位置相同的情况
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(3, solution.calculateRangeSum(nums, 2, 2));
    }
}