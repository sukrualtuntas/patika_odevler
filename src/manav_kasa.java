import java.util.Scanner;

public class manav_kasa {
    public static void main(String[]args){
        double armut,elma,domates,muz,patlican;
        double armutf =2.14,elmaf=3.67,domatesf=1.11,muzf=0.95,patlicanf=5.0,toplam=0,tkp;
        Scanner imp = new Scanner(System.in);
        System.out.print("Armut kaç kilo? :");
        armut = imp.nextDouble();
        tkp = armut*armutf;
        toplam = toplam + tkp;
        System.out.print("Elma kaç kilo?:");
        elma = imp.nextDouble();
        tkp = elma*elmaf;
        toplam +=tkp;
        System.out.print("Domates kaç kilo?:");
        domates = imp.nextDouble();
        tkp = domatesf*domates;
        toplam += tkp;
        System.out.print("Muz kaç kilo?:");
        muz = imp.nextDouble();
        tkp = muz*muzf;
        toplam += tkp;
        System.out.print("Patlıcan kaç kilo?;");
        patlican = imp.nextDouble();
        tkp = patlicanf*patlican;
        toplam += tkp;
        System.out.print("Toplam tutar:"+toplam+"TL");


    }
}
