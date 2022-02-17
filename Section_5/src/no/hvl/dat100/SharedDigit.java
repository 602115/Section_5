package no.hvl.dat100;

public class SharedDigit {
    public static void main(String[] args) {
        hasSharedDigit(123, 12);
    }
    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
       if ((numberOne >99) || (numberOne < 10) || (numberTwo > 99) || (numberTwo < 10)) {
           return false;
       }
        int startnumberTwo = numberTwo;
        while (numberOne > 0) {
            int digitNumberOne= numberOne % 10;
            numberTwo = startnumberTwo;
            while (numberTwo > 0) {
                int digitNumberTwo = numberTwo % 10;
                if (digitNumberOne == digitNumberTwo) {
                    return true;
                }
                numberTwo/= 10;
            }
            numberOne /= 10;
        }
        return false;
    }
}
