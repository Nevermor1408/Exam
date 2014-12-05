package lesson10_11;

import java.util.ArrayList;


public class PeopleList {

 
    public static void main(String[] args) {
        ArrayList people = new ArrayList();
        Person p = new Person("Bob",32);
        people.add(p);
        people.add(new Person("Jon Lester", 25));
        people.add(new Person("Cindy",7));
        //print all in array list
        for(int x=0;x<people.size();x++){
            p=(Person) people.get(x);
            System.out.println(p);
            
        }
        people.remove(1);
        for(int x=0;x<people.size();x++){
            p=(Person) people.get(x);
            System.out.println(p);
            
        }
        
    }
    
}
