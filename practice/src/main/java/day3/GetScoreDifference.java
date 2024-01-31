package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GetScoreDifference {

    public static void main(String[] args) {
        ArrayList<Integer> numSeq = new ArrayList<>(Arrays.asList(3,6,2,3,5));
        System.out.println(getScoreDifference(numSeq));
    }

    private static int getScoreDifference(ArrayList<Integer> numSeq) {
        int firstScore=0;
        int secondScore=0;
        boolean is_firstPerson = true;
        while(!numSeq.isEmpty())
        {
            int pickedNumber = numSeq.remove(0);
            if(is_firstPerson){
                firstScore+=pickedNumber;

            }else{
                secondScore+=pickedNumber;

            }
            if(!numSeq.isEmpty() && (pickedNumber%2 == 0)){
                Collections.reverse(numSeq);
            }
            is_firstPerson = !is_firstPerson;
        }
        return (firstScore-secondScore);
    }
}
