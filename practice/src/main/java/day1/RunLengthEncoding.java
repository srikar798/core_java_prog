package day1;

public class RunLengthEncoding {

    public static String doEncode(String str){
        StringBuffer bf = new StringBuffer();
        for(int i = 0; i< str.length(); i++){
            int count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            bf.append(str.charAt(i));
            bf.append(count);
        }
        return bf.toString();
    }

    public static void main(String[] args) {
        System.out.println(doEncode("aaabccabbb"));
    }
}
