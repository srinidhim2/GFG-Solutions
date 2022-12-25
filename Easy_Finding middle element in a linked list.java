class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node ptr=head,last=head;
         int len=1;
         while(ptr.next!=null){
             len++;
             ptr=ptr.next;
         }
         for(int i=0;i<len/2;i++)
            last=last.next;
         return last.data;
    }
}
