package by.epam.unit02.main;

public class Task04 {
    public static void main(String[] args){
        int x1 = 2;
        int y1 = 3;
        int x2 = -3;
        int y2 = -4;

        int x = x2 - x1;
        int y = y2 - y1;
        double l = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("The distance between two points = " + l);

    }
}
