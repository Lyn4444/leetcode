public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k ==0 ) return 0;
        if (k <= numOnes) return k;
        if (numOnes < k && k <= numZeros + numOnes) return numOnes;
        return numOnes * 2 + numZeros - k;
    }
}