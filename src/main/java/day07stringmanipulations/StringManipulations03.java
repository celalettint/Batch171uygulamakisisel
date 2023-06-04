package day07stringmanipulations;

public class StringManipulations03 {
    public static void main(String[] args) {
        //Ornek 1: Bir string in bas ve sonunda space character i varsa siliniz
        //  "    Ali Can    " ==> "Ali Can"
        String s = "   Ali Can   ";
        System.out.println(s); //  Ali Can

        String sTrimmed= s.trim();
        System.out.println(sTrimmed);//Ali Can

        //Ornek 2: Asagidaki fiyatlari verilen urunlerin toplam fiyatini bulunuz
        //  String tv = "$456.99";     String laptop = "$875.99";  ==> 456.99 + 875.99 = 1332.98

        String tv ="$456.99";
        String laptop="$875.99";

        String tv1=tv.replace("$","");
        System.out.println(tv1); //456.99

        String laptop1= laptop.replace("$","");
        System.out.println(laptop1);// 875.99

        double totalPrice = Double.valueOf(laptop1)+Double.valueOf(tv1);
        System.out.println(totalPrice); //1332.98

        //Ornek 3: Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        // "   Ali Can    " ==> AC
        String name = "   ali cAN    ";
        //split() methodu bir string i istedigimiz karakterden parcalamaya yarar.
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first); //A
        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last); //C

        System.out.println(""+first+last);







    }
}
