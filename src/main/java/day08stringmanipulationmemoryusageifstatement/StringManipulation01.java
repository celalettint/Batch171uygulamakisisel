package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation01 {
    public static void main(String[] args) {
        //Ornek 1: Bir String'in hic character icermedigini (Bos string oldugunu) kontrol eden kodu yaziniz.
        //1. yol length() methodu ile cozum

        String str ="";
        boolean result = str.length()==0;
        System.out.println("String bos mu? " + result); // String bos mu? true

        //2.yol tavsiye edilir
        //Java eger bir konuda method olusturmussa, o methodu kullanmak en iyisidir.

        boolean result2= str.isEmpty();
        System.out.println("is Empty? " + result2);//is Empty? true

        //Ornek 2:Bir String'in space haric hicbir character icermedigini kontrol eden kodu yaziniz
        String t = "";
        boolean result3= t.replaceAll(" ","").length()==0;
        System.out.println(result3); // true

        boolean result4 = t.replaceAll(" ", "").isEmpty();
        System.out.println(result4); // true

        boolean result5= t.isBlank();
        System.out.println(result5); // true

        //Ornek 3: Bir string de a, i, e characterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        // "Java is easy to learn" ==>   1 + 5 + 8 ==> 14
        //  0123456789.....index

        String str1="Java is easy to learn";
        System.out.println(str1); // Java is easy to learn

        int idxA=str1.indexOf('a');
        System.out.println(idxA); // 1

        int idxI=str1.indexOf('i');
        System.out.println(idxI); //5

        int idxE=str1.indexOf('e');
        System.out.println(idxE);//8

        System.out.println(idxA+idxE+idxI); //14

        //Ornek 4: Bir string deki "Java" kelime sinin ilk olarak kacinci index te kullanildigini gosteren kodu yaziniz
        //  "Ah Java vah Java sensiz olmuyor Java."
        //indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin) index ini almis olursunuz

        String u = "Ah Java vah Java sensiz olmuyor Java.";
        int idxJava= u.indexOf("Java");
        System.out.println(idxJava); //3

        //indexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 return eder
        int idxJava1=u.indexOf("idea");
        System.out.println(idxJava1); // -1

        //Ornek 5:  Bir string de a, i, e characterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //          0123456789
        String v = "Java is easy to learn";
        int idxA1= v.lastIndexOf('a');
        System.out.println(idxA1); //18

        int idxI1= v.lastIndexOf('i');
        System.out.println(idxI1); //5

        int idxE1= v.lastIndexOf('e');
        System.out.println(idxE1); //17

        System.out.println(idxA1+idxE1+idxI1); //40

        //Note : lastIndexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 verir.
        int idxZ= v.lastIndexOf('z');
        System.out.println(idxZ); // -1






    }
}
