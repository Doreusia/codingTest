package baekjoon.step.step1.bj11382;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        for (int i = 0; i < 3; i++) {
            long numbers = sc.nextLong();
            sum += numbers;
        }
        System.out.println(sum);
    }
}