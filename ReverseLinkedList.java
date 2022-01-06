public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if(head==null) {
            return head;
        }
        ListNode before=null,after=head;

        while(head!=null) {
            //store next ptr so that node is not lost
            after=head.next;
            //point next ptr to before node
            head.next=before;
            //this node becomes next nodes before node
            before=head;
            //break at last node
            if(after==null) {
                return head;
            }
            //move to next node
            head=after;
        }

        return head;
    }
    
}
