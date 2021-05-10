package by.epam.unit02.main;

public class Task02 {
    public static void main(String[] args){
        double x;
        double y;
        double max;
        double min;

        x = 3;
        y = 6;

        if (x > y) {
            max = x;
            min = y;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }else {
            min = x;
            max = y;

            x = max;
            y = min;

            System.out.println("x = " + x);
            System.out.println("y = " + y);

        }

    }
}
