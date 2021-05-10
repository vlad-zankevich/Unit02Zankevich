package by.epam.unit02.main;

public class Task03 {
    public static void main(String[] args){
        int T;
        int hour;
        int min;
        int sec;

        T = 12288;

        hour = T / 3600;
        min = (T - (hour * 3600)) / 60;
        sec = T - (hour * 3600) - (min * 60);
        String hourDisplay = String.format("%02d", hour);
        String minDisplay = String.format("%02d", min);
        String secDisplay = String.format("%02d", sec);

        System.out.println(hourDisplay + "ч" + " " + minDisplay + "мин" + " " + secDisplay + "с");

    }
}
