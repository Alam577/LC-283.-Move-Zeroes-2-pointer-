package String;

import java.util.Arrays;

class DiffChar {

    public static char findTheDifference(String s, String t) {

        //Brute force
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != tArr[i]) {
                return tArr[i];
            }
        }

        return tArr[tArr.length - 1];


// with XOR 
        // char result = 0;

        // for (int i = 0; i < s.length(); i++) {
        //     result ^= s.charAt(i);
        // }

        // for (int i = 0; i < t.length(); i++) {
        //     result ^= t.charAt(i);
        // }

        // return result;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        System.out.println(findTheDifference(s, t)); 
    }
}
