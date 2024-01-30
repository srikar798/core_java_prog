package day2;

public class EvenLengthWords {
    public static void main(String[] args) {
        String str = "Sky is Blue and vast";
        String[] str1 = str.split(" ");
        for(String string : str1){
            if(string.length() % 2 == 0){
                System.out.println(string);
            }
        }
    }
}
