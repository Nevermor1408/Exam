
package unit.pkg5;


public class RadioShow {
   public static void main(String[] args){
    LinkedQueue phoneLine = new LinkedQueue();
    phoneLine.enqueue (new Caller("Chuck"));
    phoneLine.enqueue (new Caller("Chuncky noodle soup"));
    phoneLine.enqueue (new Caller("Punck"));
    
    System.out.println("take next caller");
    System.out.println(phoneLine.dequeue());
    
    phoneLine.enqueue (new Caller("Duck"));
    phoneLine.enqueue (new Caller("Luck"));
    
    System.out.println("Take next 3 callers");
    System.out.println(phoneLine.dequeue());
    System.out.println(phoneLine.dequeue());
    System.out.println(phoneLine.dequeue());
    System.out.println("next caller will be " + phoneLine.peekFront());
    System.out.println("Callers Waiting: " +phoneLine.size());
   }
}
