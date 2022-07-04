import java.util.Scanner;

/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */
public class ManavKasaProgramı {
    public static void main(String[] args) {
        double toplam = 0;
        int kg = 0;
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        kg = input.nextInt();
        toplam = toplam + (armut * kg);

        System.out.print("Elma Kaç Kilo ? :");
        kg = input.nextInt();
        toplam = toplam + (elma * kg);

        System.out.print("Domates Kaç Kilo ? :");
        kg = input.nextInt();
        toplam = toplam + (domates * kg);

        System.out.print("Muz Kaç Kilo ? :");
        kg = input.nextInt();
        toplam = toplam + (muz * kg);

        System.out.print("Patlıcan Kaç Kilo ? :");
        kg = input.nextInt();
        toplam = toplam + (patlıcan * kg);

        System.out.print("Toplam Tutar : "+toplam+" TL");
    }
}
