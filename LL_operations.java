// Question: Perform LinkedList Operations
// Operations: Add elements, addFirst, addLast, removeFirst, removeLast, remove a specific element
import java.util.*;

public class Main {
    public static void main(String[] args) {
      LinkedList<Integer> list=new LinkedList<>();
      list.add(10);
      list.add(20);
      list.add(30);
      System.out.println("Linked list="+list);
      list.addFirst(0);
      System.out.println("new LL="+list);
      list.addLast(50);
      System.out.println("new LL="+list);
      list.removeFirst();
      list.removeLast();
      list.remove(Integer.valueOf(20));
      System.out.println("new LL="+list);

    }
}
