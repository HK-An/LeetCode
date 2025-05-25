class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int biggest = -1;

        while(left != right) {
            int volume = (right - left) * Math.min(height[left], height[right]);
            biggest = volume > biggest ? volume : biggest;

            if(height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return biggest;
    }
}