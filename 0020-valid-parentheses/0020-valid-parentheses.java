class Solution {
    public boolean isValid(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        if(s.length() == 1) return false;

        for(char c : s.toCharArray()) {

            if(c == '(' || c=='[' || c=='{') {
                stack.push(c);
            } else {
                if(stack.size() == 0) {
                    answer = false;
                    break;
                }
                
                char cFromStack = stack.pop();
                if(!isMatched(c, cFromStack)) {
                    answer = false;
                    break;
                }
            }
        }

        return stack.size() != 0 ? false : answer;
    }

    private boolean isMatched(char c, char cFromStack) {
        if(c == ')' && cFromStack == '(') return true;
        else if(c == ']' && cFromStack == '[') return true;
        else if(c == '}' && cFromStack == '{') return true;
        else return false;
    }
}