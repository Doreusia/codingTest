package baekjoon.step.step1.bj2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        sc.nextLine();
        char[] num2 = sc.nextLine().toCharArray();
        int result = 0;
        int[] mul = {100, 10, 1};

        for (int i = num2.length - 1; i >= 0; i--) {
            System.out.println((int)(num2[i] - '0') * num1);
            result += (int)(num2[i] - '0') * num1 * mul[i];
        }
        System.out.println(result);
    }
}