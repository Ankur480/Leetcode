class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // Opening bracket
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            // Closing bracket
            else {

                // No opening bracket available
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();

                // Matching pair
                if ((c == ')' && top == '(') ||
                    (c == '}' && top == '{') ||
                    (c == ']' && top == '[')) {

                    stack.pop();

                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}