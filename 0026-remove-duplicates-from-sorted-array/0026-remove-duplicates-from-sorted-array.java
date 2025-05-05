class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int insertPos = 1;

        for(int i = 1; i<nums.length; i++) {
            if(nums[i] != nums[insertPos-1]) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        return insertPos;
    }
}