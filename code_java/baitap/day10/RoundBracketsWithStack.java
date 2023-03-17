package day10;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class RoundBracketsWithStack {
        public static boolean checkBrackets(String str) {
                Stack<Character> stack = new Stack<>();
                char[] charArray = str.toCharArray();
                for (char ch : charArray) {
                        if (ch == '(') {
                                stack.push(ch);
                        } else if (ch == ')') {
                                if (stack.isEmpty()) {
                                        return false;
                                }
                                char last = stack.peek();
                                if ((ch == ')' && last == '(')) {
                                        stack.pop();
                                } else {
                                        return false;
                                }
                        }
                }
                return stack.isEmpty();
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter something:");
                String str = sc.nextLine();
                System.out.println(str + ": " + checkBrackets(str));
        }
}
