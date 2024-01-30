package day2;

import java.util.Arrays;
import java.util.HashSet;

public class MissingValues {
    public static void main(String[] args) {
        int[] arr = {1,5,3,6,7};
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        int n = set.size();
        for(int i = 0 ; i <= arr[n-1] + 1; i++){
            if(! set.contains(i)){
                System.out.println(i);
            }

        }

    }




}
