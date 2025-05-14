/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        List<ListNode> list = new ArrayList<>();
        while(head.next != null) {
            if(!list.contains(head)) {
                list.add(head);
                head = head.next;
            } else {
                return true;
            }
        }

        return false;
    }
}