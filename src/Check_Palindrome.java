import java.util.Scanner;

public class Check_Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String !!");

        String string=scanner.next();

        int isPal=isPalindrome(string.toCharArray(),0,string.length()-1);
        System.out.println(isPal);
    }

    private static int isPalindrome(char[] string, int start, int end) {

        if(start>=end){
            return 1;
        }
        if(string[start]!=string[end]){
            return 0;
        }

        return isPalindrome(string,start+1,end-1);
    }
}