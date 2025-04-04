package solutions.array;

/**
 * 209. 长度最小的子数组
 * 
 * 题目描述：
 * 给定一个含有 n 个正整数的数组和一个正整数 target，
 * 找出该数组中满足其和 ≥ target 的长度最小的连续子数组，并返回其长度。
 * 如果不存在符合条件的子数组，返回 0。
 * 
 * 示例：
 * 输入：target = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 * 
 * 限制条件：
 * - 1 <= target <= 10^9
 * - 1 <= nums.length <= 10^5
 * - 1 <= nums[i] <= 10^5
 */
public class MinSubArrayLengthFinder {
    
    /**
     * 查找满足和大于等于目标值的最小连续子数组的长度
     * 使用滑动窗口方法实现
     * 
     * @param target 目标值，子数组的和需要大于等于此值
     * @param nums   输入的正整数数组
     * @return 满足条件的最小连续子数组的长度，如果不存在则返回0
     */
    public int findMinSubArrayLen(int target, int[] nums) {
        int left = 0;                      // 滑动窗口的左边界
        int result = Integer.MAX_VALUE;    // 最小子数组长度
        int sum = 0;                       // 当前窗口内的元素和
        
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