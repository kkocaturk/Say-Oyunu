import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        //sayı tahmini
        int tahmin;
        int hak=5, sayac=0;
        Scanner klavye=new Scanner(System.in);
        int sayi=(int)(Math.random()*10+1);

        while (hak>0) {
            hak--;
            sayac++;
            System.out.println("1-10 arası bir sayı girin");
            tahmin = klavye.nextInt();

            if (sayi == tahmin){
                System.out.println("`tebrikler " + sayac+ " defada bildiniz doğru sayı:  "  + sayi);
                System.out.println("puanınız:" + (100-(sayac-1)*20));
                break;
            } else if (tahmin> sayi){
                System.out.println("daha küçük sayı girin. kalan hakkınız " + hak);
            }else{
                System.out.println("daha büyük sayı girin. kalan hakkınız "+hak);
            }
            if(hak==0){
                System.out.println("hakkınız bitti,yeniden deneyin. Doğru sayı: " + sayi);
            }
        }
    }
}