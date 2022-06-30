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
    public ListNode rotateRight(ListNode head, int k) {
        while(head == null || head.next == null)
    {
        return head;
    }
    
    
    ListNode temp = head;
    int size = 1;
    
    while(temp.next != null)
    {
        size++;
        temp = temp.next;
    }
    
    k = k % size;   
    
    
    temp.next = head;
    
    
    int res = size - k;
    ListNode temp1 = head;
    
    for(int i=0; i<res-1;i++)  
    {
        temp1 = temp1.next;
    }
    
    head = temp1.next;
    temp1.next = null;
    
    return head;
        
    }
}