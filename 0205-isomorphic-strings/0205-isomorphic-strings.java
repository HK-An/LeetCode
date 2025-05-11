class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if(mapST.containsKey(cs)) {
                if(mapST.get(cs) != ct) return false;
            } else {
                if(mapTS.containsKey(ct)) return false;
                mapST.put(cs, ct);
                mapTS.put(ct, cs);
            }
        }

        return true;
    }
}