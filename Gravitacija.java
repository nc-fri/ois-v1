import java.util.Scanner;

public class Gravitacija {

    private static final double C = 6.674 * Math.pow(10,-11);
    private static final double M = 5.972 * Math.pow(10,24);
    private static final double r = 6.371 * Math.pow(10,6);


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vnesite nadmorsko višino");
        int visina = sc.nextInt();
        izpis(visina,gravitacija(visina));
    }

    public static double gravitacija(int visina){
        return (C * M) / Math.pow((r + visina),2);
    }
    public static void izpis(int visina, double gravitacija) {
        System.out.printf("Gravitacijski pospešek znaša %f na nadmorski višini %d",gravitacija, visina);
    }
}