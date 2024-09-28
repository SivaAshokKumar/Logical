package Siva.Java.Practise;

//import java.lang.classfile.components.ClassPrinter;

public class ListNode {
    public int val;
    public ListNode nxt;

    public ListNode(int x){
        val = x;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(45);
        ListNode l3 = new ListNode(43);
        ListNode l4 = new ListNode(334);
        ListNode l5 = new ListNode(34);
         l5.nxt = l1;
         l1.nxt = l3;
         l2.nxt = null;//DEleting an Node
         l3.nxt = l4;
         l4.nxt = null;
         ListNode ptr =  l5;
         while (ptr != null){
             System.out.println(ptr.val);
             ptr = ptr.nxt;
         }

    }
}
