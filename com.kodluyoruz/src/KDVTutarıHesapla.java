import java.util.Scanner;

public class KDVTutarıHesapla {
    public static void main(String[] args) {
        /*
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak
        KDV tutarı hesaplayan programı yazınız.
         */
        double maliyet, kdvtutari, satis;

        Scanner inp = new Scanner(System.in);
        System.out.print("maliyeti gir: ");
        maliyet = inp.nextInt();

        if (maliyet>0 && maliyet<1000) {
            double kdvorani = 0.18;
            kdvtutari = maliyet * kdvorani;
            satis = maliyet + kdvtutari;
            System.out.println("KDV'siz Fiyat ="+maliyet);
            System.out.println("KDV Oranı ="+kdvorani);
            System.out.println("KDV'li Fiyat ="+ satis);
            System.out.println("KDV Tutarı ="+ kdvtutari);
        } else if (maliyet>= 1000) {
            double kdvorani = 0.08;
            kdvtutari = maliyet * kdvorani;
            satis = maliyet + kdvtutari;
            System.out.println("KDV'siz Fiyat ="+maliyet);
            System.out.println("KDV Oranı ="+kdvorani);
            System.out.println("KDV'li Fiyat ="+ satis);
            System.out.println("KDV Tutarı ="+ kdvtutari);
        } else {
            System.out.println("Lütfen geçerli bir aralık giriniz.");
        }


    }
}
