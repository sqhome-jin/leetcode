package solutions.array;

/**
 * 27. 移除元素
 * 
 * 题目描述：
 * 给你一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，
 * 并返回移除后数组的新长度。
 * 
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并原地修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * 
 * 示例：
 * 输入：nums = [3,2,2,3], val = 3
 * 输出：2, nums = [2,2,_,_]
 * 解释：函数应该返回新的长度 2，并且 nums 中前两个元素均为 2。
 * 
 * 限制条件：
 * - 0 <= nums.length <= 100
 * - 0 <= nums[i] <= 50
 * - 0 <= val <= 100
 */
public class ArrayElementRemover {
    /**
     * 移除数组中指定的元素
     * 
     * @param nums 输入数组，会被原地修改
     * @param val  要移除的目标值
     * @return 移除指定元素后数组的新长度
     */
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}