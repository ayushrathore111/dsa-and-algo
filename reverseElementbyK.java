import java.util.*;

public class reverseElementbyK {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        while(n>0){
            q.add(sc.nextInt());
            n--;
        }
        Stack<Integer> s = new Stack<>();

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<k;i++){
            s.push(q.poll());
        }
        while(!s.isEmpty()){
            queue.add(s.pop());
        }
        while(q.isEmpty()){
            queue.add(q.poll());
        }
        while(!q.isEmpty()){
            System.out.println(q.poll()+" ");
        }
    }
}
