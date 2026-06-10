// Rotate List - O(n) time, O(1) space
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
         if (head == null || head.next == null || k == 0) {return head;}

        ListNode tail = head;
       
        int n = 1;
        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        int rotate = k % n;
        if (rotate == 0) {return head;}

        int stepsToNewTail = n - rotate - 1;

        ListNode newTail = head;
        for (int i = 0; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;

        tail.next = head;    
        newTail.next = null;   

        return newHead;
    }
}
