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
    public ListNode deleteMiddle(ListNode head) {

        if(head.next==null)return null;
        ListNode slow=head;
        ListNode fast=head;
        ListNode curr=head;
             ListNode prev=null;
        int count=0;
         while(curr!=null){
            curr=curr.next;
             count++;
            
        }
        while(fast.next!=null&&fast.next.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(count%2==0) {
            slow.next=slow.next.next;
            return head;
        }
             else{
                 prev.next=prev.next.next;
                 return head;
             }
        
       
    }
}