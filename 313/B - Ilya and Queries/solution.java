import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length(), m = sc.nextInt();
        int[] p = new int[n];
 
        for (int i = 1; i < n; i++)
            p[i] = p[i - 1] + (s.charAt(i) == s.charAt(i - 1) ? 1 : 0);
 
        while (m-- > 0) {
            int l = sc.nextInt(), r = sc.nextInt();
            System.out.println(p[r - 1] - p[l - 1]);
        }
    }
}