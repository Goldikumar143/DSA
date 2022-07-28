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
    public ListNode deleteDuplicates(ListNode head) {
          if(head==null || head.next==null){
            return head;
        }
        
        Map<Integer,Integer> map =new HashMap<>();
        
        ListNode temp=head;
        while(temp!=null){
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp=temp.next;
        }
 
        ListNode ans=new ListNode(-1);
        ListNode curr=head;
        ListNode prev=ans;
        
        while(curr!=null){
            if(map.get(curr.val)==1){
                ListNode tempa=new ListNode(curr.val);
                prev.next=tempa;
                prev=tempa;
            }
            curr=curr.next;
        }
        
        return ans.next;
    }
    }
