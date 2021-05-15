package by.epam.unit02.main;

public class Task09 {
    public static void main(String[] args){
        double x;
        double y;

        x = -4;

        if (x <= -3) {
            y = 9;
            System.out.println("F(x)= " + y);
        } else if (x > 3) {
            y = 1 / (Math.pow(x, 2) + 1);
            System.out.println("F(x)= " + y);
        } else {
            System.out.println("There is no F(x) value for x = " + x );
        }

    }
}
