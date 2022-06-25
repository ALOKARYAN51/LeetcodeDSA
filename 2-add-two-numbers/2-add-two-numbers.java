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
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode currL1 = l1;
        ListNode currL2 = l2;
        
       
        ListNode dummyNode = new ListNode();
        ListNode curr = dummyNode;
        
        int carry = 0;
        
        
        while(currL1 != null || currL2 != null){
            int sum = carry;
            
            if(currL1 != null){
                sum += currL1.val;
                currL1 = currL1.next;
            }
            
            
            if(currL2 != null){
                sum += currL2.val;
                currL2 = currL2.next;
            }
            
            int curentDigit = sum % 10;
            carry = sum / 10;
            

            curr.next = new ListNode(curentDigit);
        
            curr = curr.next;
        }
        
        if(carry == 1){
            curr.next = new ListNode(1);
        }
        
        return dummyNode.next;
    }
}