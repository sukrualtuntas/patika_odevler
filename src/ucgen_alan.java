import java.util.Scanner;

public class ucgen_alan {
    public static void main(String[] args){

        double a,b,c;
        Scanner ucg= new Scanner(System.in);
        System.out.print("a kenarını giriniz:");
        a = ucg.nextDouble();
        System.out.print("b kenarını giriniz:");
        b = ucg.nextDouble();
        System.out.print("c kenarını giriniz:");
        c = ucg.nextDouble();

        double u =(a+b+c) / 2;
        double s =Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("Üçgenin alanı:" + s);

    }
}