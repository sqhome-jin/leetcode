import org.junit.jupiter.api.Test;

import solutions.array.SpiralMatrixGenerator;

import static org.junit.jupiter.api.Assertions.*;

public class SpiralMatrixGeneratorTest {
    private SpiralMatrixGenerator solution = new SpiralMatrixGenerator();

    @Test
    public void testExample() {
        // 测试题目给出的示例：3x3矩阵
        int[][] expected = {
            {1, 2, 3},
            {8, 9, 4},
            {7, 6, 5}
        };
        assertArrayEquals(expected, solution.generateMatrix(3));
    }

    @Test
    public void testMinimumSize() {
        // 测试最小尺寸：1x1矩阵
        int[][] expected = {{1}};
        assertArrayEquals(expected, solution.generateMatrix(1));
    }

    @Test
    public void testMediumSize() {
        // 测试中等尺寸：4x4矩阵
        int[][] expected = {
            {1,  2,  3,  4},
            {12, 13, 14, 5},
            {11, 16, 15, 6},
            {10, 9,  8,  7}
        };
        assertArrayEquals(expected, solution.generateMatrix(4));
    }

    @Test
    public void testLargeSize() {
        // 测试较大尺寸：5x5矩阵
        int[][] result = solution.generateMatrix(5);
        assertEquals(5, result.length);
        assertEquals(5, result[0].length);
        assertEquals(1, result[0][0]);
        assertEquals(25, result[2][2]);
    }
}