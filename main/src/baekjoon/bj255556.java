package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class bj255556 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(scanner.next()));
        }

        List<Stack<Integer>> stackList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            stackList.add(new Stack<>());
            stackList.get(i).push(0);
        }

        boolean progress = true;
        for (int number : numbers) {
            boolean numberInto = false;
            for (Stack<Integer> stack : stackList) {
                if (number > stack.peek()) {
                    stack.push(number);
                    numberInto = true;
                    break;
                }
            }

            if (!numberInto) {
                progress = false;
                break;
            }
        }

        if (progress) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
