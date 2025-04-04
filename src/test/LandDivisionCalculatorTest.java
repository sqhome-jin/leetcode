import org.junit.jupiter.api.Test;
import solutions.LandDivisionCalculator;
import static org.junit.jupiter.api.Assertions.*;

public class LandDivisionCalculatorTest {
    private LandDivisionCalculator solution = new LandDivisionCalculator();

    @Test
    public void testExample() {
        // 测试题目给出的示例
        int[][] land = {
            {1, 2, 3},
            {2, 1, 3},
            {1, 2, 3}
        };
        assertEquals(0, solution.calculateMinDifference(3, 3, land));
    }

    @Test
    public void testMinimumSize() {
        // 测试最小尺寸的情况（1×2或2×1的区域）
        int[][] land = {{1, 2}};
        assertEquals(1, solution.calculateMinDifference(1, 2, land));
    }

    @Test
    public void testUnbalancedSize() {
        // 测试非正方形区域的情况
        int[][] land = {
            {1, 2, 3},
            {4, 5, 6}
        };
        assertEquals(3, solution.calculateMinDifference(2, 3, land));
    }

    @Test
    public void testLargeValues() {
        // 测试较大数值的情况
        int[][] land = {
            {100, 200},
            {300, 400}
        };
        assertEquals(200, solution.calculateMinDifference(2, 2, land));
    }
}