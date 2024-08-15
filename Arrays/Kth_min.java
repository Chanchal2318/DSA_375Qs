package Arrays;
import java.util.*;
public class Kth_min {
    static int largest(int a[],int k){
        Arrays.sort(a);
        return a[k-1];
    }
    public static void main(String[] args) {
        int a[] = {22,11,9,7,6};
        int k;
        System.out.println("Enter the value of k");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println( largest(a, k));
    }
}
