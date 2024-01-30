package day2;

public class GetAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {2,1,2,0,2};
        int nonZeroIndex = 0;
        for(int index = 0; index < arr.length ; index++){

            if(arr[index] != 0){
                int temp = arr[index];
                arr[index] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
        for(int  num : arr){
            System.out.print(num);
        }
    }
}
