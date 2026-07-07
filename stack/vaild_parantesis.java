class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                stack.push(arr[i]);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (arr[i] == ')' && stack.peek() == '('
                    || arr[i] == '}' && stack.peek() == '{' ||
                    arr[i] == ']' && stack.peek() == '[') {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
