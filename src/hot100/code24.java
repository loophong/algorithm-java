package hot100;

public class code24 {

    /**
     * @description: 24. 两两交换链表中的节点
     * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
     * @author: hong
     * @date: 2025/4/21 15:14
     * @version: 1.0
     */

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tmp = head;
        head = head.next;
        while (true) {
            ListNode nextNode = tmp.next;
            tmp.next = nextNode.next;
            nextNode.next = tmp;

            if(tmp.next == null || tmp.next.next == null){
                break;
            }else {
                ListNode old = tmp;
                tmp = tmp.next;
                old.next = tmp.next;
            }
        }
        return head;
    }
}
