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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head.next==null) return null;
       
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        int del=count-n;
        System.out.print(del);
        
        if(count==n){
            head=head.next;
        return head;
        }
        
        if(head.next.next==null){
            head.next=null;
            return head;
        }
        int i=1;
        curr=head;
        while(i<del&&curr.next!=null){
           curr=curr.next; 
            i++;
        }
        curr.next=curr.next.next;
        
        
        
        return head;
        
    }
}