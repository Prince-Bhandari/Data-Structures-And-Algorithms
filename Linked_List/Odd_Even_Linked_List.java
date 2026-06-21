class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return head;
        }

        ListNode oddptr = head;
        ListNode evenptr = head.next;
        ListNode evenHead = evenptr;

        while(evenptr != null && evenptr.next != null){
            oddptr.next = evenptr.next;
            oddptr = oddptr.next;
            evenptr.next = oddptr.next;
            evenptr = evenptr.next;
        }
        oddptr.next = evenHead; 
        return head;
    }
}