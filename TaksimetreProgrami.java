import java.util.Scanner;
public class TaksimetreProgrami {
    public static void main(String[] args) {

        /** TayTayTay54 */

        double km,perKm=2.20,total,startPrice=10;
        Scanner input = new Scanner(System.in);

        System.out.println("Merhaba,EmirTaksi'ye Hoş Geldiniz !!!");
        System.out.println("UYARI:Taksimetre Açılış Fiyatı 10 TL'dir ve Kilometre Başı 2.20 TL Yazmaktadır.");
        System.out.println("UYARI:Minimum Ücret 20 TL'dir.Bu Tutarın Altında Fiyat Gelse Dahi Sizden 20 TL Alınacaktır.");
        System.out.print("Kaç Kilometre Gideceksiniz:");
        km = input.nextDouble();

        total = (km*perKm)+startPrice;
        total = (total >= 20) ? total:20;

        System.out.println("Ödemeniz Gereken Tutar:"+total);
        System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkürler !!!");
    }
}
