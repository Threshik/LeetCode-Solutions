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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        set.add(nums[i]);
        ListNode head2 = new ListNode(-1);
        ListNode t1=head2;
        ListNode t2 = head;
        while(t2!=null)
        {
            if(!set.contains(t2.val))
            {
                t1.next=new ListNode(t2.val);
                t1=t1.next;
            }
            t2=t2.next;
        }
        return head2.next;
        
    }
}