package hot100;

import java.util.LinkedList;

public class addTwoNumbers {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        l2.add(5);
        l2.add(6);
        l2.add(4);

        LinkedList<Integer> large;
        LinkedList<Integer> min;

        if (l1.size() < l2.size()) {
            large = l2;
            min = l1;
        } else {
            large = l1;
            min = l2;
        }

        boolean isStep = false;


        for (int i = 0; i < min.size(); i++) {

        }

    }
}
