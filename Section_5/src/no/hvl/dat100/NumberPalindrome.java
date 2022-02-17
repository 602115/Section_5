package no.hvl.dat100;

public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(1221);
    }
    public static boolean isPalindrome(int number){
        if (number < 0) {
            number *= -1;
        }
        int revers = 0;
        int stored = number;
        while (stored >0) {
            int digit = stored % 10;
            revers = (revers * 10) + digit;
            stored /= 10;
        }

        if (number==revers){
            return true;
        }
            return false;
    }
}
