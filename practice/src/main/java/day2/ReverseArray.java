package day2;

public class ReverseArray {
    public static void main(String[] args) {
        char[] arr = new char[]{'h','e','l','l','o'};

        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(char ch : arr){
            System.out.println(ch);
        }
    }

}
