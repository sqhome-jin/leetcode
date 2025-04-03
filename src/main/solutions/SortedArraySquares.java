package solutions;


public class SortedArraySquares {
    public int[] sortedSquares(int[] nums) {
        int right = nums.length - 1; // 修改：初始值应该是 length-1
        int left = 0;
        int[] result = new int[nums.length]; // 修改：使用 nums.length 更直观
        int currentIndex = nums.length - 1; // 修改：更有意义的变量名

        while (left <= right) { // 修改：边界条件改为 <=
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

    private int square(int num) {
        return num * num;
    }
}