import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {

        int temperature;
        Scanner input = new Scanner(System.in);

        System.out.print("Oneri almak icin hava sicakligini giriniz: ");
        temperature = input.nextInt();

        String suggestion = (temperature < 5) ? "Kayak"
                : ((5 <= temperature && temperature < 15) ? "Sinema"
                : ((15 <= temperature && temperature <= 25) ? "Piknik"
                : "Yüzme"));

        System.out.println(suggestion);

        input.close();
    }
    /* //V2
    public static void main(String[] args) {
        double s;
        Scanner inp=new Scanner(System.in);
        System.out.print("Oneri almak icin hava sicakligini giriniz: ");
        s= inp.nextDouble();
        if (s<=5){
            System.out.println("Kayak");
        } else if (s>5 && s<=15 ) {
            System.out.println("Sinema");
        } else if (s>15 && s<=25) {
            System.out.println("Piknik");
        } else if (s>25) {
            System.out.println("Yüzme");
        }

    }
    */

}
