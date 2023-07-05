public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public boolean isCircularSentence(String sentence) {
        if (sentence.length() == 0) return false;
        String[] split = sentence.split(" ");
        if (split.length == 1) {
            return split[0].charAt(0) == split[0].charAt(split[0].length() - 1);
        } else {
            int len = split.length;
            if (split[0].charAt(0) != split[len - 1].charAt(split[len - 1].length() - 1)) return false;
            for (int i = 0; i < len - 1; i++ ) {
                if (split[i].charAt(split[i].length() - 1) != split[i + 1].charAt(0)) return false;
            }
        }
        return true;
    }
}