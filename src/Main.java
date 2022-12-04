import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double armut= 2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00, aKilo,eKilo,dKilo,mKilo,pKilo,toplamTutar;
        Scanner input= new Scanner(System.in);
        System.out.print("Kaç kilo armut: ");
        aKilo=input.nextDouble();
        System.out.print("Kaç kilo elma: ");
        eKilo=input.nextDouble();
        System.out.print("Kaç kilo domates: ");
        dKilo=input.nextDouble();
        System.out.print("Kaç kilo muz: ");
        mKilo=input.nextDouble();
        System.out.print("Kaç kilo patlıcan: ");
        pKilo=input.nextDouble();
    toplamTutar= (aKilo*armut)+(eKilo*elma)+(dKilo*domates)+(mKilo*muz)+(pKilo*patlican);
    System.out.print("Toplam Tutar: "+toplamTutar);
    }
}