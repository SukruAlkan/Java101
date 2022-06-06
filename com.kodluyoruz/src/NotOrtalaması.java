import java.util.Scanner;

public class NotOrtalaması {
    public static void main(String[] args) {
        // Degiskenler
        int matematik, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfı
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz:");
        matematik = input.nextInt();

        System.out.print("Fizik notunu giriniz:");
        fizik = input.nextInt();

        System.out.print("Kimya notunu giriniz:");
        kimya = input.nextInt();

        System.out.print("Turkce notunu giriniz:");
        turkce = input.nextInt();

        System.out.print("Tarih notunu giriniz:");
        tarih = input.nextInt();

        System.out.print("Muzik notunu giriniz:");
        muzik = input.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6;

        if (ortalama > 60) {
            System.out.println("Sınıfı Geçti");
        } else {
            System.out.println("Sınıfta Kaldı");
        }
    }
}
