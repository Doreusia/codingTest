package programmers.짝수는_싫어요;

public class Solution {
    public int[] solution(int n) {
        int[] arr = new int[n % 2 == 0 ? n /2 : (n / 2) + 1];

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = 1;
            } else {
                arr[i] = i * 2 + 1;
            }
        }
        return arr;
    }
}
