class ArrayElementRemover {
    /**
     * 移除元素
     * 
     * @param nums 输入数组
     * @param val  要移除的值
     * @return 移除后数组的新长度
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