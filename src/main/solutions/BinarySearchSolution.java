package solutions;


public class BinarySearchSolution {
    /**
     * 二分查找
     * 
     * @param nums   有序整型数组
     * @param target 目标值
     * @return 如果目标值存在返回下标，否则返回 -1
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
