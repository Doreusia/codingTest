package baekjoon.bj1021;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;

        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int[] pick = new int[m];
        for (int i = 0; i < m; i++) {
            pick[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int tgIndex = queue.indexOf(pick[i]);
            int mdIndex;

            if (queue.size() % 2 == 0) {
                mdIndex = (queue.size() / 2) - 1;
            } else {
                mdIndex = (queue.size() / 2);
            }

            if (tgIndex <= mdIndex) {
                for (int j = 0; j < tgIndex; j++) {
                    int tmp = queue.pollFirst();
                    queue.offerLast(tmp);
                    count++;
                }
            } else {
                for (int j = 0; j < queue.size() - tgIndex; j++) {
                    int tmp = queue.pollLast();
                    queue.offerFirst(tmp);
                    count++;
                }
            }
            queue.pollFirst();
        }
        System.out.println(count);
    }
}
