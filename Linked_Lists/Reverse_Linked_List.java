/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null; //1st Pointer
        ListNode curr=head; //2nd pointer
        
        while(curr !=null){
            ListNode temp = curr.next; //saving the next node before reversing
            curr.next=prev;
            prev = curr; //moving the pointer ahead
            curr = temp; //moving the pointer ahead
        }
        return prev;
    }
}