class Solution {
    public static int findGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head){
        if(head.next == null){return head;}

        ListNode p1 = head, p2 = head.next;

        while(p2 != null){
            ListNode gcd = new ListNode(findGCD(p1.val, p2.val));
            p1.next = gcd;
            p1 = p1.next;
            p1.next = p2;
            p1 = p2;
            p2 = p2.next;
        }
        return head;
    }
}