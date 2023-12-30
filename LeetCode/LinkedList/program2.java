/*Given the head of a singly linked list, return true if it is a 
palindrome or false otherwise.*/
/*
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
    public boolean isPalindrome(ListNode head) {

        ListNode temp = head;
        String str  = "";

        while(temp!=null){
            str = str+(temp.val);
            temp = temp.next;
        }

        StringBuilder reversed = new StringBuilder(str).reverse();
        boolean ret = str.equals(reversed.toString());
        return ret;
    }
}
