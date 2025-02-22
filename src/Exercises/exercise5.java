package Exercises;

/*
Statement:
Java's System.out.printf function can be used to print formatted output.
The purpose of this exercise is to test your understanding of formatting
output using printf.

To get you started, a portion of the solution is provided for you in the
editor; you must format and print the input to complete the solution.

*Input Format:

- Every line of input will contain a String followed by an integer.
- Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

*Output Format:

- In each line of output there should be two columns:
- The first column contains the String and is left justified using
exactly  characters.
- The second column contains the integer, expressed in exactly
digits; if the original input has less than three digits, you must pad
your output's leading digits with zeroes.
 */

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String sl=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n", sl,x);
        }
        System.out.println("================================");

    }
}
