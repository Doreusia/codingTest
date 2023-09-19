package programmers.숫자_문자열과_영단어;

public class Solution2 {
    public static int solution(String str) {
        StringBuffer sb = new StringBuffer();
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (int i = 0; i < word.length; i++) {
            str = str.replace(word[i], num[i]);
        }
        
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        System.out.println(solution("23seven8nine"));
    }
}