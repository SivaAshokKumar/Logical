package Siva.Java.Practise.Linked_List;

public class LinkingList {
    int val ;
    LinkingList next;

    public LinkingList(int x) {
         val = x;
    }

    public static void TranversingLinkedList(LinkingList head){
        LinkingList temp = head;

        while(temp != null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

    public static void TraversRevers(LinkingList head){
        LinkingList temp = head;
         while(temp == null){
             System.out.println(temp.val);
             temp = temp.next;
         }
    }

    public static LinkingList NewNodeAtBegin(LinkingList head, int valtoInsert){
       //Initializing a New Node
        LinkingList newNode  = new LinkingList(valtoInsert);
        //Positioning a Node to correct Head Position through l1
        newNode.next = head;
        //Pointing the Head to New Node
        head = newNode;
        //Returning the HeadNode
        return  head;
    }

    public static LinkingList insertAtEnd(LinkingList head,int valtoInsert){
//Initializing a New Node
        LinkingList newNode = new LinkingList(valtoInsert);
        //Poinitng to a Head Node
        LinkingList ptr = head;
        //Chck for the next value null
        while (ptr.next!=null)
            ptr = ptr.next;
        // if Next Node not Equals to Null
        ptr.next = newNode;
        return head;
    }

    public static LinkingList InsertAtMiddle(LinkingList head,int ValToInsert,int Position){
        LinkingList newNode = new LinkingList(ValToInsert);

        LinkingList ptr = head;
        for (int i= 0 ; i < Position; i++){
            ptr = ptr.next;
        }
        newNode.next = ptr.next;
        ptr.next = newNode;
        return head;
    }

    public static LinkingList DeleteAtBegin(LinkingList head){
        head = head.next;
        return head;
    }

    public  static  LinkingList DeleterAtEnd(LinkingList head){
        LinkingList ptr = head;
        while(ptr.next.next !=null){
            ptr = ptr.next;
        }
        ptr.next = null;
        return head;
    }

    public  static LinkingList DetleteATMiddle(LinkingList head,int position){
        LinkingList ptr = head;
        for(int i=0;i < position;i++){
            ptr = ptr.next;
        }
        LinkingList Nodetodele = ptr.next;
        LinkingList newNode = Nodetodele.next;
        ptr.next = newNode;
        return head;

    }

    public static void main(String[] args) {
        LinkingList l1 = new LinkingList(3);
        LinkingList l2 = new LinkingList(30);
        LinkingList l3 = new LinkingList(35);
        LinkingList l4 = new LinkingList(39);
        LinkingList l5 = new LinkingList(45);
        LinkingList l6 = new LinkingList(49);


        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = null;

        //DELETE AT MIDDLE
        //l3 = DetleteATMiddle(l3,0);
        //DEletion at End
       //  l1 = DeleterAtEnd(l1);
           //Deletion at Begin
        // l1  =   DeleteAtBegin(l1);

        //l1 = NewNodeAtBegin(l1, 234);
         //insertAtEnd(l4,4598);
       // l3 = InsertAtMiddle(l3,8888,0);
      // TranversingLinkedList(l1);
        TraversRevers(l5);
        /*LinkingList pointer = l1;
        while(pointer != null){
            System.out.println(pointer.val);
            pointer = pointer.next;

        }*/
    }
}
