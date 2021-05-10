package by.epam.unit02.main;

public class Task06 {
    public static void main(String[] args){
        int M = 13;
        int N = 0;
        double A;

        if (N != 0) {
            A = (double) M / (double) N;
            int B = (int)A;
            double C = A - B;
            C = C * 10;
            int D = (int)C;

            System.out.println("The highest digit of the fractional part = " + D);
            System.out.println("The lowest digit of the integer part = " + B % 10);
        }else {
            System.out.println("The denominator is zero. ");
            A = Double.NaN;
        }

    }
}
