public class Gravitacija {

    private static final double C = 6.674 * Math.pow(10,-11);
    private static final double M = 5.972 * Math.pow(10,24);
    private static final double r = 6.371 * Math.pow(10,6);


    public static void main(String[] args) {
        System.out.println("OIS je zakon");
    }

    public static double gravitacija(int visina){
        return (C * M) / Math.pow((r + visina),2);
    }
}