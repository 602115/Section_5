package no.hvl.dat100;

public class Sum3And5Challange {
    public static void main(String[] args) {
    int n = 0;
    int sum = 0;
        for (int i=1; i<=1000; i++) {
            if((i % 3==0) && (i % 5==0)) {
                n++;
                sum += i;
                System.out.println( i + " er delelig på 5 eller 3");
            }
            if (n == 5) {
                break;
            }
        }
        System.out.println("Dette er summen av de 5 første tallene som er delelig på 3 eller 5: " + sum);
    }
}
