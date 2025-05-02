class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '(' || c=='[' || c=='{') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;

                char open = stack.pop();
                if(!isMatched(open, c)) return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean isMatched(char open, char close) {
        if(open == '(' && close == ')') return true;
        else if(open == '[' && close == ']') return true;
        else if(open == '{' && close == '}') return true;
        else return false;
    }
}