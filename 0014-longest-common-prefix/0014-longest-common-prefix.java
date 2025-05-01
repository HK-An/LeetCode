class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = null;
        for(String st : strs) {
            prefix = getPrefix(prefix, st);
            if(prefix.equals("")) return prefix;
        }

        return prefix;
    }

    private String getPrefix(String prefix, String st) {
        if(prefix == null) return st;
        char[] prefixCharArr = prefix.toCharArray();
        char[] stCharArr = st.toCharArray();
        StringBuilder stb = new StringBuilder();

        for(int i = 0; i < stCharArr.length; i++) {
            if(prefixCharArr.length < i+1) continue;

            if(prefixCharArr[i] == stCharArr[i]) stb.append(stCharArr[i]);
            else break;
        }
        return stb.toString();
    }
}