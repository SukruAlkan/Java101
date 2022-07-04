import java.util.Scanner;

/*
1)Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

2)Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
*/
abstract class AlanCevre {
    public abstract Double alan(Integer yariCap);
    public Double cevre(Integer r) {
        final double pi = 3.14;
        double cevre = 2 * pi * r;
        return cevre;
    }
}

interface DaireDilimininAlani {
    Double daireDilimininAlani(Integer r, Integer alfa);
}

class DaireIslemler extends AlanCevre implements DaireDilimininAlani{
    final double pi = 3.14;
    @Override
    public Double alan(Integer r) {
        double alan = pi * r * r;
        return alan;
    }

    @Override
    public Double daireDilimininAlani(Integer r, Integer alfa) {
        double dilimAlan = (pi * (r * r) * alfa) / 360;
        return dilimAlan;
    }
}

public class DaireClass {

    public static void main(String[] args) {
        DaireIslemler daireIslemler = new DaireIslemler();
        System.out.print("Dairenin yarıçapını giriniz: ");
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        System.out.print("Daire dilim açısını giriniz:  ");
        int alfa = input.nextInt();

        System.out.print("Alan:"+daireIslemler.alan(r));
        System.out.print("\nÇevre: "+daireIslemler.cevre(r));
        System.out.print("\nDilimin Alanı: "+daireIslemler.daireDilimininAlani(r,alfa));
    }
}
