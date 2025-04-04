package solutions.array;

/**
 * 59. 螺旋矩阵 II
 * 
 * 题目描述：
 * 给定一个正整数 n，生成一个包含 1 到 n^2 所有元素，
 * 且元素按顺时针顺序螺旋排列的正方形矩阵。
 * 
 * 示例：
 * 输入: 3
 * 输出: [
 *   [1, 2, 3],
 *   [8, 9, 4],
 *   [7, 6, 5]
 * ]
 */
public class SpiralMatrixGenerator {
    
    /**
     * 生成螺旋矩阵
     * 
     * @param n 正方形矩阵的边长
     * @return 生成的螺旋矩阵，包含 1 到 n^2 的所有数字
     */
    public int[][] generateMatrix(int n) {
        int [][] res = new int[n][n];
        int num = 1;
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        while (num <= n * n) {
            for (int i = left; i <= right; i++) {
                res[top][i]= num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                res[i][right] = num++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                res[bottom][i] = num++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                res[i][left] = num++;
            }
            left++;
        }
        return res;
    }
}