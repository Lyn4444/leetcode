import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "8*((1*(5+6))*(8/6))";
        int i = solution.maxDepth(s);
        System.out.println(i);
    }
}

class Solution {
    public int maxDepth(String s) {
        String replace = s.replace(" ", "");
        int len =replace.length();
        if (len == 0) return 0;
        Deque<Character> deque = new ArrayDeque<>();
        Deque<Character> tmp = new ArrayDeque<>();
        for (int i = 0; i < len; i ++ ) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                deque.add(s.charAt(i));
            }
        }
        int num = deque.size();
        if (num % 2 != 0 || num == 0) return 0;
        if (deque.getFirst() != '(' || deque.getLast() != ')') return 0;
        int all = num / 2;
        Character c;
        int max = 0;
        while (!deque.isEmpty()) {
            c = deque.pop();
            if (tmp.isEmpty()) {
                tmp.add(c);
            } else {
                if (c == tmp.getLast()) {
                    tmp.add(c);
                } else {
                    tmp.pop();
                }
            }
            max = max > tmp.size()? max: tmp.size();
        }
        max = max > tmp.size()? max: tmp.size();
        return max;
    }
}