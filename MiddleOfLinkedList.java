public class MiddleOfLinkedList {

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

//Basic Approach: traverse till end of the list to find length and traverse till middle to find the middle of list
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         ListNode temp = head;
//         int len=0,i=0;
//         while(temp!=null) {
//             len++;
//             temp=temp.next;
//         }

//         len=(len/2);
//         temp=head;
//         while(i<len) {
//             temp=temp.next;
//             i++;
//         }
//         return temp;
//     }
// }

      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

//Better Approach
// have 2 pointers fst pointer and slow pointer by the time fst pointer reaches end we know the middle

        public ListNode middleNode(ListNode head) {
            if(head==null){
                return head;
            }
            ListNode fstptr=head, slwptr=head;
            while(fstptr!=null && fstptr.next!=null) {
                fstptr=fstptr.next.next;
                slwptr=slwptr.next;
            }

            return slwptr;
        }

}
