package baekjoon.bj10818;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);
        int min = numbers[0];
        int max = numbers[numbers.length -1];

        System.out.printf("%d %d", min, max);
    }
}