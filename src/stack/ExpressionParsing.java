package stack;

import java.util.Stack;

public class ExpressionParsing {

    private Stack<Integer> nums = new Stack<>();
    private Stack<Character> operators = new Stack<>();

    public int calculate(String s) {
        int n = s.length();
        if (n == 0) return 0;
        for (int i=0; i<n; i++) {
            char c = s.charAt(i);
            switch (c) {
                case ' ' :
                    break;
                case '(':
                    operators.push(c);
                    break;
                case ')' :
                    while (operators.peek() != '(') {
                        char op = operators.pop();
                        processOperation(op);
                    }
                    operators.pop();
                    break;
                case '+' :
                case '-':
                    while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(c)) {
                        processOperation(operators.pop());
                    }
                    operators.push(c);
                    break;
                default:
                    int num = 0;
                    while (i<n && Character.isDigit(s.charAt(i))) {
                        num = num*10 + (s.charAt(i) - '0');
                        i++;
                    }
                    i--;
                    nums.push(num);
            }
        }

        while(!operators.isEmpty()) {
            processOperation(operators.pop());
        }
        return nums.pop();
    }

    private void processOperation(char op) {
        int r = nums.pop();
        int l = nums.pop();
        switch (op) {
            case '+' :
                nums.push(l+r);
                break;
            case '-' :
                nums.push(l-r);
                break;
        }
    }

    private int precedence(char op) {
        if (op == '+' || op == '-')
            return 1;
        else
            return -1;
    }
}
