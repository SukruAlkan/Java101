import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n , m , h;
        Scanner input= new Scanner(System.in);
        System.out.println( "toplam 1\ncikarma 2\ncarpma 3\nbolme 4");
        System.out.print( "lütfen secim yapınız: ");
        h = input.nextInt();
        System.out.print( "ilk sayinizi giriniz: ");
        n = input.nextInt();
        System.out.print( "ikinci sayinizi giriniz: ");
        m = input.nextInt();

        switch (h) {
            case 1:
                System.out.println("Toplam: " + (n + m));
                break;
            case 2:
                System.out.println("Fark: " + (n - m));
                break;
            case 3:
                System.out.println("Çarpım: " + (n * m));
                break;
            case 4:
                if (m != 0) {
                    System.out.println("Bölüm: "+ n / m);
                } else {
                    System.out.println("0 a bölünmez");
                }
                break;
            default:
                System.out.println("Yanlis Secim");
        }
    }
}
