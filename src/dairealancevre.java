import java.util.Scanner;

public class dairealancevre {
    public static void main(String[] args){

        double r,a;
        double pi = 3.14;
        double cevre,alan;
        Scanner imp= new Scanner(System.in);
        System.out.println("Eğer dairenin tamamının alanını hesaplayacaksanız açı ölçüsünü 360 olarak giriniz");
        System.out.print("Dairenin yarı çapı:");
        r = imp.nextDouble();
        System.out.print("Dairenin açı ölçüsü:");
        a = imp.nextDouble();
        cevre = 2*pi*r;
        alan = (pi*(r*r)*a)/360;
        System.out.println("Dairenin çevre uzunluğu:" + cevre);
        System.out.println("Dairenin alanı:" + alan);
        
    }

}
