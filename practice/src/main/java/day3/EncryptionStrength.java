package day3;

import java.util.Arrays;

public class EncryptionStrength {
    public static void main(String[] args) {
        // Example inputs
        int instructionCount = 100;
        int validityPeriod = 1000;
        int[] keys = {2, 4};

        // Call the encryptionValidity function with the given inputs
        int[] result = encryptionValidity(instructionCount, validityPeriod, keys);

        // Output the result
        System.out.println(Arrays.toString(result));  // Output should be [1, 400000]
    }

    private static int[] encryptionValidity(int instructionCount, int validityPeriod, int[] keys) {
        int totalKeysTested= instructionCount * validityPeriod;
        int[] divisors = new int[keys.length];
        for(int i = 0 ; i< keys.length;i++){
            int count = 0;
            for(int key : keys){
                if(keys[i] % key == 0){
                    count++;
                }
            }
            divisors[i]=count;
        }
        int maxStrength = Arrays.stream(divisors).max().getAsInt() * 100000;

        int canCracked = totalKeysTested >= maxStrength ? 1 : 0;
        return new int[]{canCracked, maxStrength};
    }
}

