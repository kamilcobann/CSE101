import java.util.Scanner;

/**
 * @author Kamil Çoban
 * @since 1.11.19
 */
public class kamil {
    public static void main(String []args){
        Scanner scn=new Scanner(System.in);
        int a=0;
        int n= (a*a*a)-(a*a);
        System.out.println("Sayı giriniz");
        int sayi= scn.nextInt();
        for (a=0;a<sayi;a++){
            n=(a*a*a)-(a*a);
            if (n==sayi){
                System.out.println("a ="+a);
            }
            }
        }


    }

