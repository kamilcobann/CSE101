import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Section2Lab1 {
    public static void main (String[]args){
        Scanner k=new Scanner(System.in);

        System.out.println("Birinci sayıyı girin");
        int sayi1= k.nextInt();
        System.out.println("İkinci sayıyı girin");
        int sayi2= k.nextInt();
        System.out.println("Üçüncü sayıyı girin");
        int sayi3= k.nextInt();
        if(sayi1<sayi2&sayi1<sayi3){
            System.out.println("En küçük sayı:" + sayi1);

            }else if (sayi2<sayi1&&sayi2<sayi3){
            System.out.println("En küçük sayı:" + sayi2);
        }else if(sayi3<sayi1&sayi3<sayi2){
            System.out.println("En küçük sayı:" + sayi3);
        }
    }

}