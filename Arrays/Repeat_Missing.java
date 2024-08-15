package Arrays;
import java.util.*;
public class Repeat_Missing {
    static void repeatedNumber(int a[]){
        int diff =0 ;
        Arrays.sort(a);
        for(int i = 0;i<a.length-1;i++){
            diff = a[i+1]-a[i];
            if(diff>1){
                System.out.println("The missing number is " +(a[i]+1));
            }
            if(diff == 0){
                System.out.println("The repeated number is " +a[i]);
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {3,1,2,5,3};
        repeatedNumber(a);
    }
}
