import java.util.Scanner;

public class Java_Substring_Comparison {
    public static String getSmallestAndLargest(String s, int k) {
        int n = (s.length()-k)+1;

        String[] tempString = new String[n];
        for(int i = 0; i < n; i++){
            tempString[i] = s.substring(i,(i+k));
        }
        int i;
        int j;

        String smallest = tempString[0];
        String largest = tempString[0];
        for(i = 1 ; i <= tempString.length-1; i++){
            if(tempString[i].compareTo(smallest) < 0)
                smallest = tempString[i];
            if(tempString[i].compareTo(largest) > 0)
                largest = tempString[i];
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s,k));
    }
}
