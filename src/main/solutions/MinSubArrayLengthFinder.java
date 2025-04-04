package solutions;

/**
 * 209. 长度最小的子数组
 * 
 * 题目描述：
 * 给定一个含有 n 个正整数的数组和一个正整数 target，
 * 找出该数组中满足其和 ≥ target 的长度最小的连续子数组，并返回其长度。
 * 如果不存在符合条件的子数组，返回 0。
 * 
 * 限制条件：
 * - 1 <= target <= 10^9
 * - 1 <= nums.length <= 10^5
 * - 1 <= nums[i] <= 10^5
 */
public class MinSubArrayLengthFinder {
    
    /**
     * 查找满足和大于等于目标值的最小连续子数组的长度
     * 
     * @param target 目标值
     * @param nums   输入数组
     * @return 满足条件的最小连续子数组的长度，如果不存在则返回0
     */
    public int findMinSubArrayLen(int target, int[] nums) {
        int left = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        for(int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
}