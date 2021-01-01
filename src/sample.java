
import java.util.ArrayList;


public class sample {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        
        list.add("a"); //add a to the list
        list.add("b");//add b to the list
        list.add(1,"c");//add c to the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); //for loop to print all in the list
        }
        list.set(1,"e"); //sets c to e to the second point in the list
        for (String lett : list) {
            System.out.println(lett); //for loop to print all in the list
        }
        list.add("f"); //add f to the list
        list.remove(2); //remove b in the list
        for (String string : list) {
            System.out.println(string); //for loop to print all in the list
        }
    }
    
}
