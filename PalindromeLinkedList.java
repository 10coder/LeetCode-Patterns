//Question: https://leetcode.com/problems/palindrome-linked-list/

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if(head.next==null) {
            return true;
        }
        return null==checkPalin(head,head)?false:true;
    }



//Approach:
//recursively traverse till end of list through fstptr by skipping 2 nodes
// by the time fst ptr moves to the end slwptr reaches middle
// move the slwptr to next and check value with recursive calls backtracking to check palindrome

    //while traversing even list fstptr at the end pints to null and for odd list fst ptr to a value
// hence we need to return slwptr for even list and next slwprt for odd list
    ListNode checkPalin(ListNode slwptr, ListNode fstptr) {
        if(fstptr!=null && fstptr.next!=null) {
            ListNode n = checkPalin(slwptr.next,fstptr.next.next);
            if(n!=null && n.val==slwptr.val) {
                //System.out.println(slwptr.val);
                return fstptr==slwptr?slwptr:n.next;
            } else {
                return null;
            }

        }
        return fstptr!=null?slwptr.next:slwptr;
    }
}


