class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
       Node temp=head;

        while(temp.next!=null){

            temp.data=-(temp.data);

            if(temp.next.data<0 && temp.next.next!=null){

             temp.next=null;

                break;

            }

            temp=temp.next;

        }
    }
}
