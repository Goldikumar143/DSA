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
        
        int size = 0;
        for (ListNode node = head; node != null; node = node.next) {
            size++;
        }
        if (size == n){
            if(head != null){
                return head.next;
            }
        }
        int posFromStart = size - n;
        int idx = 0;
        for (ListNode node = head; node != null; node = node.next) {
            idx++;
            if(idx == posFromStart){
                node.next = node.next.next;
                break;
            }
        }

        return head;
        
    }
}