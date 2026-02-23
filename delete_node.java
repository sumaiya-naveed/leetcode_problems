class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        head = reverse(head);
        ListNode temp = head;
        int count = 1;
        if(n == 1){
            head = head.next;
            return reverse(head);
        }
        else{
        while(temp!=null&&count<n-1){
            temp = temp.next;
            count++;
        }
        temp.next = temp.next.next;
        return reverse(head);
    }
    }

     private static ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode next_ptr = null;
        while(current!=null){
            next_ptr = current.next;
            current.next = previous;
            previous = current;
            current = next_ptr;
        }
        head = previous;
        return previous;
}
};

