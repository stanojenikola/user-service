package com.nikolanew.testingnew.helper.l2;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var dummy = new ListNode(0);
        var current = dummy;
        int carry = 0;


        while (l1!=null || l2!= null || carry == 1) {

            var sum = 0;

            if (l1!=null) {
                sum+=l1.val;
                l1 = l1.next;

            }

            if (l2!=null) {
                sum+=l2.val;
                l2 = l2.next;
            }


            sum+= carry;
            carry = sum /10;
            var newNode = new ListNode(sum%10);
            current.next = newNode;
            current = current.next;

        }

        return dummy.next;
    }
}
