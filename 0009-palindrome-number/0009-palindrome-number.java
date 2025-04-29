class Solution {
    public boolean isPalindrome(int x) {
        char[] charArrX = String.valueOf(x).toCharArray();
        StringBuilder stb = new StringBuilder();

        for(int i = charArrX.length-1; i >= 0; i--) {
            stb.append(charArrX[i]);
        }

        try {
            Integer palindrome = Integer.parseInt(stb.toString());
            if(palindrome.equals(x)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}