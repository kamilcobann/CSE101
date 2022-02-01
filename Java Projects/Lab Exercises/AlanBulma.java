import java.util.Scanner;

/**
 * @author Kamil Çoban
 * @since 11.10.2019
 */
public class AlanBulma {
    public static void main(String[]args){
        Scanner k= new Scanner(System.in);
        System.out.println("Lütfen birinci kenarı gininiz.");
        int a= k.nextInt();
        System.out.println("Lütfen ikinci kenarı giriniz.");
        int b= k.nextInt();
        System.out.println("Lütfen üçüncü kenarı giriniz.");
        int c= k.nextInt();
        if (a>0&&b>0&&c>0){
            if (a+b>c&&b+c>a&&a+c>b){
                System.out.println("Üçgen geçerlidir.");
                int u=(a+b+c)/2;
                double A=Math.sqrt(u*(u-a)*(u-c)*(u-b));
                System.out.println("Üçgenin alanı:"+A);
            }
            else{
                System.out.println("Üçgen geçersizdir.");
            }
        }

    }
}
