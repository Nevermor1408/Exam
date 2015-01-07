package unit.pkg5;

import java.util.ArrayList;
import java.util.ListIterator;


public class IteratorExample {

  static ArrayList list = new ArrayList();
  static ListIterator li;
  static int pos = 0;
  
    public static void main(String[] args) {
        list.add("a");
        list.add("b");
        list.add("c");
        li = list.listIterator();
        
        System.out.println("move over item "+li.next());
        pos++;
        System.out.println("move over item "+li.next());
        pos++;
        System.out.println("remove something");
        li.remove();
        pos--;
        System.out.println("Add b back");
        li.add("b");
        pos++;
        System.out.println("move over item "+li.next());
        pos++;
        System.out.println("Previous "+li.previous());
        pos--;
        System.out.println("Remove last item seen");
        li.remove();
        System.out.println("Previous "+li.previous());
        pos--;
        System.out.println("set last thing seen to e");
        li.set("e");
        System.out.println("Add b back in to left of li");
        li.add("b");
        pos++;
        System.out.println("add c back to left of lo");
        li.add("c");
        pos ++;
        System.out.println("try to remove something wont work at all ");
        //li.remove();
        System.out.println("next"+li.next());
        pos++;
       // System.out.println("Another next, try to move past end of list"+li.next());
       // pos++;
        showlist();
        
    }
  public static void showlist(){
      for (int x=0;x<list.size();x++){
          if(x==pos)System.out.print("*");
          System.out.print(list.get(x));
      }
      if(pos==list.size())System.out.print("*");
      System.out.println("");
      
  }  
}
