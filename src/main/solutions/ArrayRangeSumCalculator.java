package solutions;

/**
 * 58. 区间和
 * 
 * 题目描述：
 * 给定一个整数数组 Array，请计算该数组在每个指定区间内元素的总和。
 * 
 * 输入格式：
 * - 第一行输入为整数数组 Array 的长度 n
 * - 接下来 n 行，每行一个整数，表示数组的元素
 * - 随后的输入为需要计算总和的区间，直至文件结束
 * 
 * 数据范围：
 * - 0 < n <= 100000
 */
public class ArrayRangeSumCalculator {
    
    /**
     * 计算指定区间内的元素和
     * 
     * @param nums 输入数组
     * @param start 区间起始位置（包含）
     * @param end 区间结束位置（包含）
     * @return 区间内元素的总和
     */
    public int calculateRangeSum(int[] nums, int start, int end) {
        // 参数校验更清晰地分开
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        if (start < 0 || end >= nums.length || start > end) {
            return 0;
        }
        
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }
        return sum;
    }
}