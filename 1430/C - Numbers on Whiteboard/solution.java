import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 1; i <= n; i++) pq.add(i);
            List<int[]> ans = new ArrayList<>();
            while (pq.size() > 1) {
                int a = pq.poll(), b = pq.poll();
                int c = (a + b + 1) / 2;
                ans.add(new int[]{a, b});
                pq.add(c);
            }
            System.out.println(pq.poll());
            for (int[] x : ans)
                System.out.println(x[0] + " " + x[1]);
        }
    }
}