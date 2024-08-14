package Arrays;

import java.util.HashSet;

public class ContainsDup {
    static boolean duplicate(int a[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i< a.length;i++){
            set.add(a[i]);
        }
        if(set.size()<a.length){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,1};
        System.out.println(duplicate(a));
    }
}
