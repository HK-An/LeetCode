class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1) return;

        int pointer = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i == 0 && nums[i] != 0) {
                pointer++;
                continue;
            }
            else if(nums[i] != 0) {
                int temp = nums[pointer];
                nums[pointer++] = nums[i];
                nums[i] = temp;
            } 
        }
    }
}