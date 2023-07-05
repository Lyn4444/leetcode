import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(7, new ListNode(2, new ListNode(4, new ListNode(3))));
        ListNode l2 = new ListNode(5 ,new ListNode(6, new ListNode(4)));

        Solution solution = new Solution();
        solution.addTwoNumbers(l1, l2);
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l1.val == 0) return l2;
        if (l2 == null || l2.val == 0) return l1;
        Deque<Integer> list1 = new LinkedList<>();
        Deque<Integer> list2 = new LinkedList<>();
        while (l1 != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            list2.add(l2.val);
            l2 = l2.next;
        }
        int les = 0, a , b;
        ListNode res = null;
        while (!list1.isEmpty() && !list2.isEmpty()) {
            a = list1.removeLast();
            b = list2.removeLast();
            if (res == null) {
                ListNode temp = new ListNode((a + b + les) % 10);
                les = (a + b + les) / 10;
                res = temp;
            } else {
                ListNode temp = new ListNode((a + b + les) % 10, res);
                les = (a + b + les) / 10;
                res = temp;
            }
        }
        if (list1.isEmpty()) {
            while (!list2.isEmpty()) {
                b = list2.removeLast();
                ListNode temp = new ListNode((les + b) % 10, res);
                les = (b + les) / 10;
                res = temp;
            }
        }
        if (list2.isEmpty()) {
            while (!list1.isEmpty()) {
                a = list1.removeLast();
                ListNode temp = new ListNode((les + a) % 10, res);
                les = (a + les) / 10;
                res = temp;
            }
        }
        if (les != 0) {
            ListNode temp = new ListNode(les, res);
            res = temp;
        }
        return res;
    }
}