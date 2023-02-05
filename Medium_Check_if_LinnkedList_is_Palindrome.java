class Solution

{

    //Function to check whether the list is palindrome.

    boolean isPalindrome(Node head){
        Node h1 = head;
        Node mid = findMid(head);
        Node h2 = reverse(mid);
        while(h1!=null && h2!=null){
            if(h1.data != h2.data){
                return false;
            }else{
                h1 = h1.next;
                h2 = h2.next;
            }
        }
        return true;
    }
    Node findMid(Node head){
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
  Node reverse(Node head){
        if(head==null ||head.next==null){
            return head;
        }
        Node prev = null;
        Node pres = head;
        Node next = head.next;
  while(pres!=null){
        pres.next = prev;
            prev = pres;
            pres = next;
            if(next!=null){
                next = next.next;
            }
        }
        return prev;
    }

}
