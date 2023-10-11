package baekjoon.bj11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int amount = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());

        int[] coins = new int[amount];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        while (price != 0) {
            for (int i = coins.length - 1; i >= 0; i--) {
                if (coins[i] <= price) {
                    int tmp = price / coins[i];
                    cnt += tmp;
                    price %= coins[i];
                }
            }
        }
        System.out.println(cnt);
    }
}
