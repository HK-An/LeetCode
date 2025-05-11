class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();

        for(int i = 0; i < s.length(); i++) {
            char c = sCharArr[i];

            if(!map.keySet().contains(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        for(int i = 0; i < t.length(); i++) {
            char c = tCharArr[i];
            if(!map.keySet().contains(c) || map.get(c) == 0) {
                return false;
            } else {
                map.put(c, map.get(c) - 1);
            }
        }
        return true;
    }
}