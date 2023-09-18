package baekjoon.bj9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        boolean checkFlag = true;
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }

        for (int i = 0; i < str.length; i++) {
            for (char s : str[i].toCharArray()) {
                if (stack.isEmpty()) {
                    if (s == ')') {
                        checkFlag = false;
                        break;
                    } else {
                        stack.push(s);
                    }
                } else {
                    if (s == ')') {
                        stack.pop();
                    } else {
                        stack.push(s);
                    }
                }
            }
            if (!stack.empty() || !checkFlag) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            stack.clear();
            checkFlag = true;
        }
    }
}