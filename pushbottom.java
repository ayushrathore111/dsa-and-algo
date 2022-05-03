import java.util.*;

public class pushbottom {
    public static void pushBot(int n , Stack<Integer> s){
        if(s.isEmpty()){
            s.push(n);
            return;
        }
        int top = s.pop();
        pushBot(n, s);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushBot(top, s);
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        
        Scanner sc = new Scanner(System.in);
       
        s.push(23);
        s.push(54);
        s.push(12);
        s.push(8);
        reverse(s);
          while(!s.isEmpty()){
              System.out.println(s.pop());
          }
    }
}
