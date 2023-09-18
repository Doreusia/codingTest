package baekjoon.bj10807;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        for (int i = 0; i < n; i++) {
            ht.put(i, sc.nextInt());
        }
        int v = sc.nextInt();

        for (Integer value : ht.values()) {
            if (value == v) {
                count++;
            }
        }
        System.out.println(count);

    }
}
