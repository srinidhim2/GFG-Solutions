class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	int len=1;
    	Node ptr=head;
    	while(ptr.next!=null){
    	    ptr=ptr.next;
    	    len++;
    	}
    	if(len<n)
    	    return -1;
    	Node temp=head;
    	for(int i=0;i<len-n;i++){
    	    temp=temp.next;
    	}
    	
    	return temp.data;
    }
}
