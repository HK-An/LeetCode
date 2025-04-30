class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        int buffer = 0;

        char sCharArr[] = s.toCharArray();
        
        for(char c : sCharArr) {
            int num = getNumber(c);
            if(buffer < num) {
                answer = answer + num - 2 * buffer;
            } else {
                answer += num;
            }
            buffer = num;

        }

        return answer;
    }

    private int getNumber(char c) {
        if('I' == c) {
            return 1;
        } else if('V' ==c ) {
            return 5;
        } else if('X' == c) {
            return 10;
        } else if('L' == c) {
            return 50;
        } else if('C' == c) {
            return 100;
        } else if('D' == c) {
            return 500;
        } else {
            return 1000;
        }
    }
}