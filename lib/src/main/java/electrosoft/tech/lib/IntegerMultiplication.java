package electrosoft.tech.lib;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


import java.util.Arrays;

class IntegerMultiplication {
    public static void main(String []args) {
        int[] inputs=  {10, 7, 5, 8, 11, 9};
        int min=0;
        int max=0;
        for(int input:inputs){
            if(input>0){
                if(min==0){
                    min=input;
                }
                min=Math.min(input,min);
                max=Math.max(input,max);
            }
        }
        String str="3141592653589793238462643383279502884197169399375105820974944592";
        String str1="2718281828459045235360287471352662497757247093699959574966967627";
        System.out.print(multiply(str,str1));
    }

    public static String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] pos = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + pos[p2];

                pos[p1] += sum / 10;
                pos[p2] = (sum) % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int p : pos) if (!(sb.length() == 0 && p == 0)) sb.append(p);
        return sb.length() == 0 ? "0" : sb.toString();
    }
}