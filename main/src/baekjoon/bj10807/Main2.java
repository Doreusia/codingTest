package baekjoon.bj10807;

import java.util.Hashtable;
import java.util.Scanner;

public class Main2 {
    // HashTable 메서드 사용한 방법
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if (ht.containsKey(k)) {
                ht.put(k, ht.get(k) + 1);
            } else {
                ht.put(k, 1);
            }
        }
        int v = sc.nextInt();

        System.out.println(ht.get(v) == null ? 0 : ht.get(v));

    }
}
