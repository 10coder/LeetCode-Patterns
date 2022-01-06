public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        if(head==null) {
            return head;
        }

        //skip heads with same value
        while(head!=null && head.val==val) {
            head=head.next;
        }

        ListNode temp=head;

        //delete same value nodes
        while(temp!= null && temp.next!=null) {

            //for the corner case 1 2 2 1
            //we have to remove all the middle elements

            while(temp.next!=null && temp.next.val==val) {
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }

        return head;
    }
}
