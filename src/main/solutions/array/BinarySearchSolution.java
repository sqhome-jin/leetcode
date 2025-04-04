package solutions.array;

/**
 * 704. 二分查找
 * 
 * 题目描述：
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * 
 * 示例：
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 * 
 * 限制条件：
 * - 你可以假设 nums 中的所有元素是不重复的
 * - n 将在 [1, 10000]之间
 * - nums 的每个元素都将在 [-9999, 9999]之间
 */
public class BinarySearchSolution {
    /**
     * 二分查找目标值
     * 
     * @param nums   有序整型数组（升序）
     * @param target 要查找的目标值
     * @return 如果找到目标值返回其下标，否则返回 -1
     */
    public int search(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        int index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                index = mid;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
}
