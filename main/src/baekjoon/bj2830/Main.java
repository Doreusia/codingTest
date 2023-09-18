package baekjoon.bj2830;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                result += Integer.parseInt(Integer.toBinaryString(num[i] ^ num[j]), 2);
            }
        }
        System.out.println(result);
    }
}
