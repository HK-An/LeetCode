class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean answer = false;
        Arrays.sort(nums);

        if(nums.length == 1) return false;

        for(int i = 1; i<nums.length; i++) {
            if(i == nums.length) {
                break;
            } else if(nums[i-1] == nums[i]) {
                answer = true;
                break;
            }
        }
        return answer;
    }
}