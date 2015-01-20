package lesson10_11;

import TerminalIO.*;
public class Hanoi {
    static int nummoves=0;
    
    public static void main(String[] args) {
        KeyboardReader k = new KeyboardReader();
        int numrings = k.readInt("Enter number of rings 3 to 10: ");
        if(numrings <3||numrings>10){
            System.out.println("Invalid inpit - program will now end. ");
            return;
           
        }
            move(numrings,1,2,3);
            System.out.println("Total moves = "+nummoves);
    }
            public static void move(int n, int i, int j, int k){
                if(n>0){
                    nummoves++;
                    move(n-1,i,k,k);
                    System.out.println("move ring "+n +" from peg "+ i + " to peg " + j);
                    move(n-1,k,j,i);
                }
            }
        }
        

    

