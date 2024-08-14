package Arrays;
public class Max_Min{
    static void max_min(int a[]){
        int min = a[0] , max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]>max){
               max = a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
   
    }
    public static void main(String[] args) {
        int a[] = {4,2,5,1,6};
        max_min(a);
    }
}