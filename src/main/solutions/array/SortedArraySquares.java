package solutions.array;

/**
 * 977. 有序数组的平方
 * 
 * 题目描述：
 * 给你一个按非递减顺序排序的整数数组 nums，返回每个数字的平方组成的新数组，
 * 要求也按非递减顺序排序。
 * 
 * 示例：
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 解释：平方后数组为 [16,1,0,9,100]，排序后为 [0,1,9,16,100]
 * 
 * 限制条件：
 * - 1 <= nums.length <= 10^4
 * - -10^4 <= nums[i] <= 10^4
 * - nums 已按非递减顺序排序
 */
public class SortedArraySquares {
    /**
     * 计算有序数组的平方值并保持有序
     * 
     * @param nums 按非递减顺序排序的整数数组
     * @return 返回每个数字平方后的有序数组
     */
    public int[] sortedSquares(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        int[] result = new int[nums.length];
        int currentIndex = nums.length - 1;

        while (left <= right) {
            int leftSquare = square(nums[left]);
            int rightSquare = square(nums[right]);

            if (leftSquare > rightSquare) {
                result[currentIndex] = leftSquare;
                left++;
            } else {
                result[currentIndex] = rightSquare;
                right--;
            }
            currentIndex--;
        }
        return result;
    }

    /**
     * 计算一个数的平方
     * 
     * @param num 输入数字
     * @return 输入数字的平方
     */
    private int square(int num) {
        return num * num;
    }
}