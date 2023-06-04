package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Ornek : Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //a) Alanini hesaplayiniz  ==> Kisa kenar * Uzun kenar
        //b) Cevresiniz hesaplayiniz ==> 2 * Kisa kenar + 2 * Uzun kenar

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Kisa kenarin uzunlugunu giriniz..");
        double shortSide = input.nextDouble();
        System.out.println("Lutfen zun kenarin uzunlugunu giriniz..");
        double longSide = input.nextDouble();

        System.out.println("dikdortgenAlan = " +(shortSide*longSide));
        System.out.println("dikdortgenCevre = "+ (2*(shortSide+longSide)));









    }
}
