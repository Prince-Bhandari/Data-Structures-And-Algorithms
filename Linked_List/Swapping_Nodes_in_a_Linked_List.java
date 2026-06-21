class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null) return null;
        
        ListNode p1 = head;
        for(int i = 1; i < k; i++){
            p1=p1.next;
        }
        ListNode p2 = head;
        ListNode temp1 = p1;
        while(temp1.next != null){
            temp1 = temp1.next;
            p2 = p2.next;
        }

        int temp = p1.val;
        p1.val = p2.val;
        p2.val = temp;

        return head;
    }
}