package Arrays;

public class Max_SubArray {
    static int maxSum(int a[]){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<a.length ;i++){
            sum += a[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[] = {-2, 1 ,-3, 4 , -1 , 2, 1 , -5, 4};
        System.out.println(maxSum(a));
    }
}
