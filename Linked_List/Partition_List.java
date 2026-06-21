class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        
        ListNode dummy1 = new ListNode(0);
        ListNode p1 = dummy1; //for 1st partition
        
        ListNode dummy2 = new ListNode(0);
        ListNode p2 = dummy2; //for 2nd partition 
        
        ListNode curr = head;

        while(curr != null){
            if(curr.val < x){
                p1.next = curr;
                p1 = p1.next;
                curr = curr.next;
            } else{
                p2.next = curr;
                p2 = p2.next;
                curr = curr.next;
            }
        }
        p2.next = null;
        p1.next = dummy2.next;
        
        return dummy1.next;
    }
}