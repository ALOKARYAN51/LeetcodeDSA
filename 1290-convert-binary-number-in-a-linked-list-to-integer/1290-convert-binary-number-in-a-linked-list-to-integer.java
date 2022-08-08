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
    public int getDecimalValue(ListNode head) {
        ListNode current = head;
        Stack<Integer> st = new Stack<>();
        while(current != null){
            st.add(current.val);
            current = current.next;
        }
        int sum=0;
        int index=0;
        
        while(!st.isEmpty()){
            if(st.pop()==1){
                sum += (int)Math.pow(2,index);
            }
            index++;
        }
        return sum;
    }
}