/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA=0,countB=0;   
        ListNode A=headA;
        ListNode B=headB;
        while(A!=null || B!=null)
        {
            if(A!=null){ countA++; A=A.next;}
            
            if(B!=null){ countB++; B=B.next;}
        }
        if(countA>countB)      
        {
            int dif=countA-countB; 
            
            while(dif>0){
                headA=headA.next; dif--;}
        }
        else if(countA<countB)
        {
            int dif=countB-countA;
            while(dif>0){
                headB=headB.next; dif--;} 
        }
        while(headA != headB)
        {
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}