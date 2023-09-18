package baekjoon.step.step2.bj2753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}