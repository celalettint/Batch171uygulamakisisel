package day02datatypesmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {

        int sonuc = toplamaYap(3,5);
        System.out.println(sonuc);

      long carpmaSonucu = multiply (4,5);
        System.out.println(carpmaSonucu);

        System.out.println(firstTwoMultiplyThirdAdd(2,3,4));

        int bolmeSonucu = bolme(25,5);
        System.out.println(bolmeSonucu);












    }

    private static int bolme(int a, int b) {
        return a/b;
    }

    private static int firstTwoMultiplyThirdAdd(int a, int b, int c) {
        return a * b + c;
    }

    private static long multiply(long a , long b) {
        return a*b;
    }

    private static int toplamaYap(int a, int b) {
        return a+b;
    }
}
