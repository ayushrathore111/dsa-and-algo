import java.util.*;

public class stackoperations {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        if(s.contains(9)){
            System.out.println("yes it is present...");
        }
        else{
            System.out.println("no it is not present..");
        }
    }
}
