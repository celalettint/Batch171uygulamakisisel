package day05concatinationoperatorstypecasting;

public class Operators {
    public static void main(String[] args) {

        boolean first =1<5;
        boolean second= 2+3 !=5;
        boolean third = 2+3*5>=19;

        System.out.println(first+" - "+second+ " -  " + third);// true - false -  false

        System.out.println(first && second); //false
        System.out.println(first||second||third); // true



    }
}
