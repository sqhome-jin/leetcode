package solutions.array;

/**
 * 44. 开发商购买土地
 * 
 * 题目描述：
 * 在一个城市区域内，被划分成了n * m个连续的区块，每个区块都拥有不同的权值，代表着其土地价值。
 * 需要将区域按横向或纵向划分成两个子区域分配给A公司和B公司，使得两个子区域的土地总价值之差最小。
 * 
 * 示例：
 * 输入：n = 3, m = 3
 * land = [
 *   [1, 2, 3],
 *   [2, 1, 3],
 *   [1, 2, 3]
 * ]
 * 输出：0
 * 解释：可以将区域按照如下方式划分，使得两个子区域的土地总价值之差为0
 * 
 * 限制条件：
 * - 只允许横向或纵向划分
 * - 每个子区域必须包含一个或多个区块
 * - 区块不可再分
 * - 1 <= n, m <= 100
 * - n 和 m 不同时为 1
 */
public class LandDivisionCalculator {
    
    /**
     * 计算两个子区域土地总价值的最小差值
     * 使用预处理和动态规划的思想实现
     * 
     * @param n 区域行数
     * @param m 区域列数
     * @param land 土地价值矩阵，大小为 n*m
     * @return 两个子区域土地总价值的最小差值
     */
    public int calculateMinDifference(int n, int m, int[][] land) {
        // 处理特殊情况：单个区块
        if (n == 1 && m == 1) {
            return 0;   
        }
        // 预处理：计算每行和每列的和
        int[] rowSum = new int[n];  // 存储每行的和
        int[] colSum = new int[m];  // 存储每列的和
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rowSum[i] += land[i][j];
                colSum[j] += land[i][j];
            }
        }
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minDiff = Math.min(minDiff, calculateDifference(rowSum, i));
        }
        for (int j = 0; j < m; j++) {
            minDiff = Math.min(minDiff, calculateDifference(colSum, j));
        }

        return minDiff;
    }

    /**
     * 计算在指定分割点的两部分和的差值
     * 使用前缀和的思想优化计算效率
     * 
     * @param nums 待分割的数组，可以是行和数组或列和数组
     * @param divisionIndex 分割点索引，将数组分为左右（或上下）两部分
     * @return 两部分和的绝对差值
     */
    private int calculateDifference(int[] nums, int divisionIndex) {
        int leftSum = 0;   // 左侧（或上侧）区域的和
        int rightSum = 0;  // 右侧（或下侧）区域的和
        
        // 计算分割点左侧（或上侧）的和
        for (int i = 0; i <= divisionIndex; i++) {
            leftSum += nums[i];
        }
        
        // 计算分割点右侧（或下侧）的和
        for (int i = divisionIndex + 1; i < nums.length; i++) {
            rightSum += nums[i];
        }
        
        return Math.abs(leftSum - rightSum);  // 返回两部分和的绝对差值
    }
}