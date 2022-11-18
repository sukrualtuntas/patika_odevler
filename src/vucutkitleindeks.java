import java.util.Scanner;

public class vucutkitleindeks {
    public static void main(String[] args){
        double kilo,boy,indeks;
        Scanner imp= new Scanner(System.in);
        System.out.print("Kilonuzu girin;");
        kilo = imp.nextDouble();
        System.out.print("Boyunuzu girin:");
        boy = imp.nextDouble();
        indeks= kilo/ (boy*boy);
        System.out.print("Vücut Kitle İndeksiniz:"+indeks);

    }
}
