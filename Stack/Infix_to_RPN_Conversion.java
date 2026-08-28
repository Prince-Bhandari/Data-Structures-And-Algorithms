class Solution {

    public String infixToRPN(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {result.append(ch);}
            else if (ch == '(') {stack.push(ch);}
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {result.append(stack.pop());}
                stack.pop(); // remove '('
            }else {
                while (!stack.isEmpty() && stack.peek() != '(' && precedence(stack.peek()) >= precedence(ch)) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Empty remaining operators
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    private int precedence(char ch) {
        if (ch == '+' || ch == '-') {return 1;}
        if (ch == '*' || ch == '/') {return 2;}
        if (ch == '^') {return 3;}
        return -1;
    }
}