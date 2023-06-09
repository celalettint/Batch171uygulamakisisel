package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {

         /*
        Ornek:
            Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
                1) En az 8 character olsun
                2) Space characteri passwordde olmasin
                3) En az bir buyuk harf olsun
                4) En az bir kucuk harf olsun
                5) En az bir rakam olsun
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz..");
        String pwd=input.nextLine();

        //1) En az 8 charakter olsun.
        boolean first =pwd.length()>7;
        System.out.println("first = " + first);

        //2) Space characteri passwordde olmasin
        boolean second = !pwd.contains(" ");
        System.out.println("second = " + second);

        //3) En az bir buyuk harf olsun
        boolean third = pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("third = " + third);

        //4) En az bir kucuk harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("fourth = " + fourth);

        //5) En az bir rakam olsun
        boolean fifth = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("fifth = " + fifth);

        System.out.println("Passwort gecerli mi? "+ (first&&second&&third&&fourth&&fifth)); // Ahmet123. true


    }
}
