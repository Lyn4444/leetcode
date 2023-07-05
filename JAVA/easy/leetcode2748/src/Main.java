public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {11,21,12};
        int i = solution.countBeautifulPairs(nums);
        System.out.println(i);
    }
}

class Solution {
    public int countBeautifulPairs(int[] nums) {
        int res = 0;
        int numLength = nums.length;
        for (int i = 0; i < numLength - 1; i++) {
            for (int j = i + 1; j < numLength; j++) {
                int start = getNum(nums[i], 0);
                int end = getNum(nums[j], 1);
                int gcd = gcd(start, end);
                if(gcd == 1){
                    res += 1;
                }
            }
        }
        return res;
    }

    public static int getNum(int num, int flat) {
        String numString = Integer.toString(num);
        if (flat == 0) {
            return (int) numString.charAt(0) - 48;
        } else {
            return (int) numString.charAt(numString.length() - 1) - 48;
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}