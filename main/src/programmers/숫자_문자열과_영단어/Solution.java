package programmers.숫자_문자열과_영단어;

public class Solution {
    public int solution(String str) {
        StringBuffer sb = new StringBuffer();
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String result = "";

        for (char s : str.toCharArray()) {
            if (s >= 97 && s <= 122) {
                sb.append(s);
                for (int i = 0; i < word.length; i++) {
                    if (sb.toString().equals(word[i])) {
                        result += num[i];
                        sb.setLength(0);
                    }
                }
            } else {
                result += s;
            }
        }
        return Integer.parseInt(result);
    }
}
