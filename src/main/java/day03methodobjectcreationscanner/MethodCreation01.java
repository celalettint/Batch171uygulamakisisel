package day03methodobjectcreationscanner;

public class MethodCreation01 {
    public static void main(String[] args) {

        double kup = getCube(5);
        System.out.println("kup = " + kup);

        print("Java is easy");

        String str ="TechproEdu";

        printConsole(str);
        int a=3;
        int b=5;
        carpmaYap(a,b);

        int sayi =5;
        karesiniAl(sayi);









    }

    private static void karesiniAl(int sayi) {
        System.out.println(sayi*sayi);

    }

    private static void carpmaYap(int a, int b) {
        System.out.println(a*b);
    }

    private static void printConsole(String str) {
        System.out.println(str);

    }

    public static void print(String str){
        System.out.println(str);
    }


    static double getCube(double a) {
        return a*a*a;
    }
}
