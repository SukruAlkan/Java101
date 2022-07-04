import java.util.Scanner;

/*
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının
"Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
 */
class VücutKitleIndeksiHesaplama {

    public Double indeksHesapla(Integer kg, Double boy) {
        double indeks = kg / (boy * boy);
        return indeks;
    }
}

public class VucutKitleIndeksi {

    public static void main(String[] args) {
        VücutKitleIndeksiHesaplama vücutKitleIndeksiHesaplama = new VücutKitleIndeksiHesaplama();
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        Scanner inp = new Scanner(System.in);
        double boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        int kg = inp.nextInt();
        System.out.print("Vücut Kitle İndeksiniz : "+vücutKitleIndeksiHesaplama.indeksHesapla(kg,boy));
    }

}
