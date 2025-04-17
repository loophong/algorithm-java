package hot100;

public class code19 {


    public static void main(String[] args) {
//        head = [1,2,3,4,5], n = 2
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        head.next = node2;
//        ListNode head = new ListNode(1);
//        ListNode head = new ListNode(1);
//        ListNode head = new ListNode(1);

        ListNode listNode = removeNthFromEnd(head, 1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    /**
     * @description: 两次扫描，第一次获取长度，第二次删除
     * @author: hong
     * @date: 2025/4/17 13:30
     * @version: 1.0
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode tmp = head;
        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        if (length == n) {
            // 移动头节点
            head = head.next;
        } else {
            tmp = head;
            for (int i = 0; i < length - n - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next != null ? tmp.next.next : null;
        }

        return head;
    }

}
