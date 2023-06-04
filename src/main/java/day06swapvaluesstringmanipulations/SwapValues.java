package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {

        //Swap : Yer degistirmek 1.kap Patates 2. kap Domates ==> swap => 1.Kap Domates  2. kap Patates

       int a=12;
       int b = 7;
       int temp = 0;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("temp = " + 0);

        temp=a;
        a=b;
        b=temp;
        System.out.println("a = " + a); //7
        System.out.println("b = " + b);//12

        //2.yol

        int elma = 12;
        int armut = 7;
        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);

        elma=elma+armut;
        armut=elma-armut;
        elma=elma-armut;

        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);








    }
}
