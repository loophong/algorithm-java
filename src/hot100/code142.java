package hot100;

import java.util.HashSet;

public class code142 {
    /**
     * @description: 给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
     * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
     * 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
     * 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
     * 不允许修改 链表。
     * @author: hong
     * @date: 2025/4/21 10:31
     * @version: 1.0
     */

    /**
     * 快慢指针。当相遇时，快指针走的路程是慢指针的2倍，即环的大小为慢指针走过的路程
     * 重点：慢指针从当前位置走到环入口的路程 ==  从头节点到入口的位置。
     */
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null) {
            if (fast.next == null) {
                return null;
            } else {
                fast = fast.next.next;
            }
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }

    /**
     * 使用HashSet，每次遇到元素都判断是否在set中，如果存在，则该节点就是入环节点
     */
    public ListNode detectCycleBySet(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        HashSet<ListNode> set = new HashSet<>();
        while (fast != null && slow != null) {
            if (set.contains(slow)) {
                return slow;
            } else {
                set.add(slow);
            }
            if (fast.next == null)
                break;
            fast = fast.next.next;
            slow = slow.next;
        }
        return null;
    }
}
