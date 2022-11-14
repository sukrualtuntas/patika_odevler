import java.util.Scanner;

public class taksi_odev{

    public static void main(String[] args) {
        double km, tutar;
        double kbirim = 2.20, acilis = 10, mintutar = 20;
        Scanner imp = new Scanner(System.in);
        System.out.print("Mesafeyi giriniz:");
        km = imp.nextDouble();
        tutar = acilis + (kbirim * km);
        if (tutar<=mintutar)
            tutar = mintutar;

        System.out.print("Tutar:"+tutar);

    }

}