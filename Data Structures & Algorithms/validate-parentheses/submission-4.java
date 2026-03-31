class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] strArr = s.toCharArray();
        for(int i=0;i<s.length();i++) {
            if(strArr[i]=='(' || strArr[i]=='{' || strArr[i]=='[') {
                stack.push(strArr[i]);
            }
            else if(strArr[i]==')' && !stack.isEmpty() && stack.peek()=='(') {
                stack.pop();
            }
            else if(strArr[i]==']' && !stack.isEmpty() && stack.peek()=='[') {
                stack.pop();
            }
            else if(strArr[i]=='}' && !stack.isEmpty() && stack.peek()=='{') {
                stack.pop();;
            } 
            else {
                return false;
            }
        }
        if(stack.isEmpty()) {
            return true;
        } 
        return false;
    }
}
