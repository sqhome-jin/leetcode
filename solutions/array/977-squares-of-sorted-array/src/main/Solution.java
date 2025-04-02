class Solution {
    /**
     * 有序数组的平方
     * 
     * @param nums 非递减顺序排序的整数数组
     * @return 每个数字的平方组成的新数组，按非递减顺序排序
     */
    public int[] sortedSquares(int[] nums) {
        int right = nums.length;
        int left = 0;
        int[] result = new int[right];
        while (left < right) {
            if (square(nums[left]) < square(nums[right])) {
                result[right - 1] = square(nums[right]);
                right--;
            } else {
                result[right - 1] = square(nums[left]);
                left++;
            }
        }
        return result;
    }

    private int square(int num) {
        return num * num;
    }
}