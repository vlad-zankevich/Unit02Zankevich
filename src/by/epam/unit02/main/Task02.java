package by.epam.unit02.main;

public class Task02 {
    public static void main(String[] args){

        double x = 2;
        double y = 12;
        double max;

        if (y > x) {
            max = x;
            x = y;
            y = max;
            System.out.println("x = " + x);// нет смыслка дважды повторять этот вывод
            System.out.println("y = " + y);
        } else {
            System.out.println("x = " + x);
            System.out.println("y = " + y);

        }

    }
}
