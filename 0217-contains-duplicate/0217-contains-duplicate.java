class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean answer = false;
        HashSet<Integer> hashSet = new HashSet<>();

        for(int num : nums) {
            if(hashSet.contains(num)) {
                answer = true;
                break;
            } 
            hashSet.add(num);
        }

        return answer;
    }
}