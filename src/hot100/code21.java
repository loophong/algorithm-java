package hot100;

public class code21 {

    public static void main(String[] args) {

    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode pointer = head;
        while (list1 != null && list2 != null) {
            ListNode tmp = new ListNode();
            pointer.next = tmp;
            if (list1.val <= list2.val) {
                tmp.val = list1.val;
                list1 = list1.next;
            } else {
                tmp.val = list2.val;
                list2 = list2.next;
            }
            pointer = tmp;
        }
        if (list1 == null) {
            pointer.next = list2;
        } else {
            pointer.next = list1;
        }
        return head.next;

    }
}
