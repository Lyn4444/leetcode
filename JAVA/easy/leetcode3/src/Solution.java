//给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度。
//
//
//
// 示例 1:
//
//
//输入: s = "abcabcbb"
//输出: 3
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
//
//
// 示例 2:
//
//
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
//
//
// 示例 3:
//
//
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
//
//
//
//
// 提示：
//
//
// 0 <= s.length <= 5 * 10⁴
// s 由英文字母、数字、符号和空格组成
//
//
// Related Topics 哈希表 字符串 滑动窗口 👍 10127 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 测试用例1
        String input1 = "abcb";
        int result1 = solution.lengthOfLongestSubstring(input1);
        System.out.println("Input: " + input1);
        System.out.println("Length of Longest Substring: " + result1);

        // 测试用例2
        String input2 = "aab";
        int result2 = solution.lengthOfLongestSubstring(input2);
        System.out.println("Input: " + input2);
        System.out.println("Length of Longest Substring: " + result2);

    }
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        StringBuilder stringBuffer = new StringBuilder();

        int res = 0;

        for (int i = 0; i < len; i ++) {
            if (stringBuffer.toString().contains(String.valueOf(s.charAt(i)))) {
                int index = stringBuffer.indexOf(String.valueOf(s.charAt(i))) + 1;
                int length = stringBuffer.length();
                if (res <= length) {
                    res = length;
                }
                stringBuffer.delete(0, index);
            }
            stringBuffer.append(s.charAt(i));
        }

        return Math.max(stringBuffer.length(), res);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
