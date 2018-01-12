package linkedhash;

public class Appl {
    
    public static void main(String[] args) {
           LHashMap<Integer, Integer> linkHM = new LHashMap<Integer, Integer>();
           linkHM.put(24, 13);
           linkHM.put(25, 165);
           linkHM.put(30, 156);
           linkHM.put(33, 32);
           linkHM.put(35, 98);
 
           System.out.println("The hashmap is : ");
           linkHM.display();
           
           System.out.println("\n\nShowing some of the keys and their value : ");
           System.out.println("The value of key 24  :   " + linkHM.get(24));
           System.out.println("The value of key 30  :   " + linkHM.get(30));
           System.out.println("The value of key 35  :   " + linkHM.get(35));

 

 
           System.out.println("\n\nThe value of key 24 is removed: " + linkHM.remove(24));
           System.out.println("The value of key 33 is removed: " + linkHM.remove(33));
           System.out.println("The value of key 35 is removed: " + linkHM.remove(35));

           
           System.out.print("\nThe changed hashmap is : ");
           linkHM.display();
 
    }
}