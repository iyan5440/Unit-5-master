
import java.util.ArrayList;
import java.util.ListIterator;


public class sampleiterator {

 
    
    
    public static void main(String[] args) {
        //declaring and assigning instance variables
        ArrayList <String> x = new ArrayList();
        ListIterator li = x.listIterator();
        //add a,b,c to the list
        li.add("a");
        li.add("b");
        li.add("c");
        //move to the second location
        li.previous();
        li.previous();
        li.previous();
        showList(x,li); //display list
        System.out.println("Move 1 - Travelling nxt over "+li.next());
        showList(x,li); //display list
        System.out.println("Move 2 - Travelling nxt over "+li.next());
        showList(x,li); //display list
        System.out.println("Move 3 - removing last thing travelled over ");
        li.remove();
        showList(x,li); //display list
        
        System.out.println("Move 4 - Adding b to lft of iterator ");
        li.add("b"); //add b to the list
        showList(x,li); //display list
        System.out.println("Move 5 - Travelling nxt over "+li.next());
        showList(x,li); //display list
        System.out.println("Move 6 - Travelling backwards over "+li.previous());
        showList(x,li); //display list
        
        System.out.println("Move 7 - removing last thing travelled over ");
        li.remove();
        showList(x,li);//display list
        
        System.out.println("Move 6 - Travelling backwards over "+li.previous());
        showList(x,li); //display list
        
        System.out.println("Move 9 - modifiying last thing travelled over : b to e");
        li.set("e");
        showList(x,li); //display list
        
        System.out.println("Move 10 & 11 - Adding b & c to lft of iterator ");
        li.add("b");
        li.add("c");
        showList(x,li); //display list
        
        System.out.println("Move 12 will cause error - cant remove unless nxt or previous first");
        try{
            li.remove();
        }catch(Exception e){
            
        }
        
        System.out.println("Move 13 - Travelling nxt over "+li.next());
        showList(x,li); //display list
        
        System.out.println("Move 14 will cause error cant go nxt when at the end ");
        try{
            li.next();
        }catch(Exception e){
            
        }
        showList(x,li); //display list
        
        System.out.println("BOMUS MOVE - MOVE * ALL THE WAY TO THE FRONT ");
        while(li.hasPrevious())
            li.previous();
        showList(x,li); //display list
        
        
        
    }
    
    public static void showList(ArrayList list, ListIterator li){
        for (int i = 0; i < list.size(); i++) {
            if(li.hasPrevious()==false && i==0) System.out.print("*|");
            System.out.print(list.get(i) + "|");
            if(i==li.previousIndex()) System.out.print("*|");
        }
        System.out.println("\n-------------------------");
    }
    
}
