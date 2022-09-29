package hashcode;

public class Main {
    public static void main(String[] args) {

        String str = "GFG";
        System.out.println(str.hashCode());   // 70472

        /***
         * hashCode Calculation formula
         * s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
         * s[i] represents the ith character of the string
         * ^ refers to the exponential operand
         * n represents the length of the string = 3
         *
         * s[0]*31^(2) + s[1]*31^1 + s[2]
         * = G*31^2 + F*31 + G
         * = (as ASCII value of G = 71 and F = 70)
         *   71*312 + 70*31 + 71
         * = 68231 + 2170 + 71
         * = 70472
         */




    }
}
