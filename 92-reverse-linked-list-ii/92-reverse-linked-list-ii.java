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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        
        ListNode ptr = head;
        int count = 1;
        Stack<Integer> st = new Stack<>();
        while(count <= right){
            if(count >= left && count <= right){
                st.push(ptr.val);
            }
            ptr = ptr.next;
            count++;
        }
        count =1;
        ptr = head;
        while(count <= right){
            if(count >= left && count <= right){
                ptr.val = st.pop();
            }
            ptr = ptr.next;
            count++;
        }
        return head;
    }
}