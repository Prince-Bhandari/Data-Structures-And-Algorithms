// New List Approach - O(n) time, O(n) space
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ptr = head;
        ListNode newHead = new ListNode();
        ListNode newPtr = newHead;

        while(ptr != null){
            if(ptr.val != val){
                newPtr.next = new ListNode(ptr.val);
                newPtr = newPtr.next;
            }
            ptr = ptr.next;
        }
        return newHead.next;
    }
}


// Iterative Approach - O(n) time, O(1) space
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0, head);
        ListNode tail = dummy;

        while(tail.next != null){
            if(tail.next.val == val){
                tail.next = tail.next.next;
            }
            else{
                tail = tail.next;
            }
        }
        return dummy.next;
    }
}