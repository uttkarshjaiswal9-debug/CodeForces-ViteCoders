import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int m = s.nextInt();
            int[][] a = new int[m][];
            int[] ans = new int[m];
            HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<m;i++) {
                int n=s.nextInt();
                a[i]=new int[n];
                for(int j=0;j<n;j++) a[i][j]=s.nextInt();
            }
            for(int i=m-1;i>=0;i--) {
                for(int x:a[i]) if(!set.contains(x)){ans[i]=x;break;}
                for(int x:a[i]) set.add(x);
            }
            boolean ok=true;
            for(int x:ans) if(x==0) ok=false;
            if(!ok) System.out.println(-1);
            else {
                for(int x:ans) System.out.print(x+" ");
                System.out.println();
            }
        }
    }
}