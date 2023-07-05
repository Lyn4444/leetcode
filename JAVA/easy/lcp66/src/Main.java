import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public int minNumBooths(String[] demand) {
        Map<Integer, Integer> res  = new HashMap<>();

        for (String s: demand) {
            int[] a = new int[26];

            for (int i = 0; i < s.length(); i ++ ) {
                a[s.charAt(i) - 'a'] ++;
            }

            for (int i = 0; i < 26; i ++ ) {
                if (res.containsKey(i)) {
                    res.put(i, a[i] > res.get(i)? a[i]: res.get(i));
                } else {
                    res.put(i, a[i]);
                }
            }
        }
        int arr = 0;
        for (int i = 0; i < 26; i ++ ) {
            arr += res.get(i);
        }
        return arr;
    }
}