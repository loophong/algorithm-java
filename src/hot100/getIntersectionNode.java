package hot100;

public class getIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 获取headA和headB的长度
        int a = 0, b = 0;
        ListNode ta = headA, tb = headB;
        while (ta.next != null) {
            a++;
            ta = ta.next;
        }
        while (tb.next != null) {
            b++;
            tb = tb.next;
        }
        // 较长的链表跳过前面 |a-b| 次，对其链表
        ta = headA;
        tb = headB;
        int skip = a - b >= 0 ? a - b : b - a;
        for (int i = 0; i < skip; i++) {
            if (a > b) {
                ta = ta.next;
            } else {
                tb = tb.next;
            }
        }
        // 进行比较
        ListNode result = null;
        while (ta.next != null) {
            if (ta.val != tb.val) {
                result = null;
            } else if (result == null) {
                result = ta;
            }
            ta = ta.next;
            tb = tb.next;

        }

        return result;

    }
}

