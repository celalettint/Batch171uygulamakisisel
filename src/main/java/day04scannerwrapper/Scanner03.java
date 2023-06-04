package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz.."); //15
        double sayi1 = input.nextDouble();

        System.out.println("Lutfen ikinci sayiyi giriniz..");// 5
        double sayi2 = input.nextDouble();

        System.out.println(sayi1+sayi2);//20
        System.out.println(sayi1-sayi2);//10
        System.out.println(sayi1*sayi2);//75
        System.out.println(sayi1/sayi2);//3













    }
}
