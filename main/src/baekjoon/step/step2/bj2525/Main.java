package baekjoon.step.step2.bj2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        if (m + c >= 60) {
            int upH = (m + c) / 60;
            m = (m + c) % 60;
            if (h + upH >= 24) {
                h = (h + upH) % 24;
            } else {
                h += upH;
            }
        } else {
            m += c;
        }
        System.out.printf("%d %d", h, m);
    }
}