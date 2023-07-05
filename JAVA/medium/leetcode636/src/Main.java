import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        Map<Integer, Integer> map = new HashMap<>();

        String[] log = null;
        String thread, timestamp;
        for (String s: logs) {
            log = s.split(":");
            thread = log[0];
            timestamp = log[2];
            map.put(Integer.getInteger(timestamp), Integer.getInteger(thread));
        }
        int[] res = new int[n];
        int num = 0;
        for (int i = 0; i < n; i ++ ) {

        }
    }
}