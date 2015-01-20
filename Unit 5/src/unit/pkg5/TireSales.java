

package unit.pkg5;


public class TireSales {
    public static void main(String[]args){
        ArrayStack pole = new ArrayStack();
        pole.push(new Tire("Goodyear"));
        pole.push(new Tire("Goodyear"));
        pole.push(new Tire("Goodyear"));
        pole.push(new Tire("Goodyear"));

        System.out.println("Selling two tires: ");
        System.out.println(pole.pop());
        System.out.println(pole.pop());
        
        pole.push(new Tire("ALLSTATE"));
        pole.push(new Tire("ALLSTATE"));
        
        System.out.println("Selling Three Tires MAAAAN");
        System.out.println(pole.pop());
        System.out.println(pole.pop());
        System.out.println(pole.pop());
      
    }
}
