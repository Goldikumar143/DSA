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
    public ListNode middleNode(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;
        ListNode curr=head;
        int count=0;
         while(curr!=null){
            curr=curr.next;
             count++;
            
        }
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(count%2==0) return slow.next;
        
        
        return slow;
    }
}