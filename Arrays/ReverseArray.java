package Arrays;

public class ReverseArray {
    static void reverse(int a[]){
        for(int i = a.length-1;i>=0;i--){
            System.out.print(a[i] +" "); 
        }
    }
    public static void main(String[] args) {
        int a[] = {4,2,1,5,6};
        reverse(a);
    }
}
