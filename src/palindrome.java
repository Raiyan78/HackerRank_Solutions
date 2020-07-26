import java.io.*;
import java.util.*;

public class palindrome {
    public static void palindrome(String s){
        if(s.length()%2!=0) {
            System.out.println("Invalid string!!!!");
            return;
        }
        char[] ch = s.toCharArray();
        int middlePoint = (s.length()+1)/2;
        int i;
        int j;
        char[] returnChar;
        for(i = 0, j = ch.length-1; i < middlePoint || j > middlePoint; i++,j--){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        if(Arrays.equals(ch, s.toCharArray()))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        palindrome(A);
    }
}
