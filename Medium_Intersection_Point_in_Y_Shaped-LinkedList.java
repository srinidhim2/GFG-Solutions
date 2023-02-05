class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         Node p1=head1,p2=head2;
        Set<Node> set= new HashSet<>();
        while(p1!=null){
            set.add(p1);
            p1=p1.next;
        }
        while(p2!=null){
            if(set.contains(p2))
                return p2.data;
            p2=p2.next;
        }
        return -1;
	}
}
