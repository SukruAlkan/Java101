import java.util.Scanner;

abstract class Ucgen { //abstract class
    public abstract double cevre(Double a, Double b, Double c); //abstact method
    public double uMethod(Double a, Double b, Double c) {
        double u = 0;
        u = (a+b+c)/2;
        return u;
    }
}
class Hesaplama extends Ucgen {

    @Override
    public double cevre(Double a, Double b, Double c) {
        double u = 0;
        u = uMethod(a, b, c);
        double cevre = 2 * u;
        return cevre;
    }

    public double alan(Double a, Double b, Double c) { //public method
        double u = 0;
        u = uMethod(a, b, c);
        double alan = 0;
        alan = u*(u-a)*(u-b)*(u-c);
        return alan;
    }
}

public class ucgenClass {
    static double hipotenus(Double a, Double b) { //static method
        double c = 0;
        c = Math.sqrt((a*a)+(b*b));
        return c;
    }

    public static void main(String[] args) {
        System.out.print("Üçgen\n" +
                "1 -> Hipotenüs hesaplama\n" +
                "2 -> Çevre Hesaplama\n" +
                "3 -> Alan Hesaplama\n" +
                "Lütfen Seçim Yapınız:");
        Scanner input = new Scanner(System.in);
        int secim = 0;
        secim = input.nextInt();

        double a = 0, b = 0, c = 0;
        Hesaplama newObj = new Hesaplama();

        switch (secim) {
            case 1:
                System.out.print("1. Kenarı Giriniz: ");
                a = input.nextInt();
                System.out.print("2. Kenarı Giriniz: ");
                b = input.nextInt();
                c = hipotenus(a, b); //static method çağırma
                System.out.print("Hipotenüs: " + c);
                break;
            case 2:
                System.out.print("1. Kenarı Giriniz: ");
                a = input.nextInt();
                System.out.print("2. Kenarı Giriniz: ");
                b = input.nextInt();
                System.out.print("3. Kenarı Giriniz: ");
                c = input.nextInt();

                double cevre = 0;
                cevre = newObj.cevre(a, b, c);
                System.out.print("Çevre: " + cevre);
                break;
            case 3:
                System.out.print("1. Kenarı Giriniz: ");
                a = input.nextInt();
                System.out.print("2. Kenarı Giriniz: ");
                b = input.nextInt();
                System.out.print("3. Kenarı Giriniz: ");
                c = input.nextInt();

                double alan = 0;
                alan = newObj.alan(a, b, c);
                System.out.print("Alan: " + alan);
                break;
        }
    }
}
