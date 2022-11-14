import java.util.Scanner;

public class kdvodev {
    public static void main(String[] args) {
        double n_fiyat, k_fiyat;
        double k1_oran = 0.18, k2_oran=0.08;
        double kdv_tutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ürününüzün yalın fiyatı:");
        n_fiyat = inp.nextDouble();
        if (n_fiyat<1000)
            kdv_tutar=n_fiyat*k1_oran;
        else
            kdv_tutar=n_fiyat*k2_oran;

        k_fiyat = kdv_tutar + n_fiyat;
        System.out.println("Ürünün KDV'siz fiyatı:" + n_fiyat);
        System.out.println("Ürüne yansıyan KDV tutarı:" + kdv_tutar);
        System.out.println("Ürünün KDV dahil fiyatı:" + k_fiyat);
    }
}