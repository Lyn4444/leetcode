public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num1 = 12, num2 = -55;
        int i = solution.makeTheIntegerZero(num1, num2);
        System.out.println(i);
    }
}

class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        if (num1 - num2 < 1) return -1;
        int res = 1;
        int num = num1 - num2;
        while (!isDone(num, res) && num >= 1) {
            res += 1;
            num = num - num2;
        }
        if (num < 1) {
            return -1;
        } else {
            return res;
        }
    }
    public static boolean isDone(int num, int step) {
        if (powNum(num, 1) == step) return true;
        return false;
    }

    public static int powNum(int num, int step) {
        int i = (int) (Math.log(num) / Math.log(2));
        if (num - (int)Math.pow(2, i) == 0) {
            return step + 1;
        } else {
            return powNum((num - (int)Math.pow(2, i)), step + 1);
        }
    }

}