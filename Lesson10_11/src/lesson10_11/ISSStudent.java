

package lesson10_11;


public class ISSStudent implements Comparable {
       private String name;
       private String address;
       private int id;
      
       public ISSStudent(String n, String a, int i){
        name =n;
        address = a;
        id = i;
}
public String toString(){
    return "Name:\t\t"+name+"\nAddress:\t"+address + "\nID:\t\t"+id;
    
}
    public int getID(){
        return id;
    }
    public int compareTo(Object o) {
        
        if(this.id>((ISSStudent)o).getID())
            return 1;
        else if(this.id<((ISSStudent)o).getID())
            return -1;
        else
            return 0;
        
        
        
        //difference =id((ISSStudent)o).getID();
          //  return 1;
            //else if (this.id<((ISSStudent)o).getID())
              //  return -1;
            //else
              //  return 0;
    }
   
    
}
