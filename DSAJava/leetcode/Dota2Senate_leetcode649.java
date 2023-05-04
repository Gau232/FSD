package DSAJava;

import java.util.*;

public class Dota2Senate_leetcode649 {
    public static void main(String[] args) {
        String s= "RRDDD";// DDRD;
        String ans=predictPartyVictory(s);
        System.out.println(ans);
    }
    public static String predictPartyVictory(String senate) {
        char[] inputArray = senate.toCharArray();
        int count = inputArray.length;
        int n = count;
        int rCount = 0;
        int dCount = 0;
        boolean[] flagArray = new boolean[n];
        Arrays.fill(flagArray, true);

        for(int i=0; i<n; i++) {
            if (senate.charAt(i) == 'R') {
                rCount++;
            } else {
                dCount++;
            }
        }

        while (count > 1){
            for(int i=0; i<n; i++){
                if(flagArray[i] == true){
                    for(int j=n-1; j>=0; j--){
//                        if(i==j){
//                            continue;
//                        }
                        if((inputArray[i] != inputArray[j]) && (flagArray[j]==true)){
                            flagArray[j] = false;
                            if(inputArray[j] == 'R') {rCount--;}
                            else {dCount--;}
                            count--;
                            break;
                        }
                    }
                }
                if(dCount == 0 || rCount==0){
                    break;
                }
                if (count == 1){
                    break;
                }
            }
        }

//        char vic = 'a';
//        for(int i=0; i<n; i++){
//            if(flagArray[i]){
//                vic = inputArray[i];
//                break;
//            }
//        }

        if(dCount == 0) { return "Radiant";}
        else { return "Dire";}

    }
}
