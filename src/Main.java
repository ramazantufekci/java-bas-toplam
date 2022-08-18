import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("Sayı Giriniz :");
        int sayi = girdi.nextInt();
        int tmpSayi = sayi;
        int basSayi=0;

        while(tmpSayi != 0){
            tmpSayi /= 10;
            basSayi++;
        }

        tmpSayi = sayi;
        int basToplam = 0;
        while (tmpSayi != 0){
            basSayi = tmpSayi%10;
            basToplam += basSayi;
            tmpSayi /= 10;
        }
        System.out.println("Basamakların Toplamı :"+basToplam);
    }
}
