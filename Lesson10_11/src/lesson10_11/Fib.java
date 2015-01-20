package lesson10_11;
import TerminalIO.*;

public class Fib {
static int result;
   
    public static void main(String[] args) {
        KeyboardReader k = new KeyboardReader();
        int n = k.readInt("Enter The Number Maxium is 15: ");
        
        while(true){
            if(n>0 && n<16){
                result=fibonacci(n);
                break;
            }
            else{
                System.out.println("Incorrect between 1 and 15");
                n=k.readInt();
            }
        }
        
        System.out.println("Fibonacci Output: " + result);
    
    }
    public static int fibonacci(int n){
        if(n<=2)return 1;
        else return fibonacci(n-1)+fibonacci(n-2);
    }
    
}
