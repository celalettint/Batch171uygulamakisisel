package day05concatinationoperatorstypecasting;

import com.sun.jdi.IntegerValue;

public class Concatination {
    public static void main(String[] args) {

        //Ornek 1: Bir string ve iki integer variable olusturun. String degeri ile Integer larin toplamini console a yazdiirin

        String s = "armut";
        int a = 20;
        int b = 41;
        System.out.println(s+a+b);// armut2041
        System.out.println(s+b+a);//armut4120
        System.out.println(a+b+s);//61armut
        System.out.println(s+(a+b));//armut61

        //Ornek 2: Size String olarak verilen iki fiyat'in toplamini ekrana yazdiriniz

        String shirtPrice ="2800";
        String shoesPrice ="3500";

        System.out.println(shirtPrice+shoesPrice);//28003500
        System.out.println("shirtPrice"+"shoesPrice"); //shirtPriceshoesPrice

        int toplamFiyat = Integer.valueOf(shirtPrice)+Integer.valueOf(shoesPrice);
        System.out.println(toplamFiyat); // 6300

        //Ornek 3: Size String olarak verilen iki fiyat'in toplamini ekrana yazdiriniz
        String tv = "$1100";
        String radio="$300";
        System.out.println(tv+radio); // $1100$300

        int totalPrice = Integer.valueOf(tv)+Integer.valueOf(radio);
        System.out.println(totalPrice);//

        //Note : valueOf() methodu tum karakterleri rakam olan String leri sayilara cevirir
        //Eger valueOf() methodu kullanilirken Stirng in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz
        //valueOf() methoud kullanilirken sadece rakam olan karakterler kullanilmalidir.



    }
}
