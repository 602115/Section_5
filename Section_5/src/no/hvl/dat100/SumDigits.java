package no.hvl.dat100;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println("The sum of digets is " + sumDigits(-125));
    }
    public static int sumDigits(int number) {
        if (number<10) {
            return -1;
        }
        int sum = 0;

        while (number>0) {
            int digit = number %10;
            sum+=digit;
            number/=10;
        }
        return sum;
    }
}
