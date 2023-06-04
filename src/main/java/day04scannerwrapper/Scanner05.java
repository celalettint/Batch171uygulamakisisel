package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ekrana bes basamakli bir sayi giriniz.."); //12345
        int number= input.nextInt();

        int birlerBasmagi=number%10;
        number=number/10;
        int onlarBasmagi =number%10;
        number=number/10;
        int yuzlerBasmagi =number%10;
        number=number/10;
        int binlerBasmagi =number%10;
        number=number/10;
        int onbinlerBasmagi =number%10;
        number=number/10;
        System.out.println(birlerBasmagi+onlarBasmagi+binlerBasmagi+onbinlerBasmagi);//12







    }
}
