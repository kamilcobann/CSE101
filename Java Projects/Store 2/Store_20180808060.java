import java.util.Scanner;
import java.util.SplittableRandom;

public class Store_20180808060
/**
 * @author Kamil Çoban
 * @since 6.12.19
 *
 */
{
    public static boolean validRequest(int quantity,int request){
        if (request>=0&& request<=quantity){
            return true;
        }else
            return false;
    }
    public static String[] capitalize(String[]items ){

        for (int i=1;i<=items.length;i++) {
            items[i-1]=items[i-1].toLowerCase();
            char c = Character.toUpperCase(items[i-1].charAt(0));
            items[i-1]=c+items[i-1].substring(1);
        }
        return items;
    }
    public static String cashReturned(double m){
        int tl200=0,tl100=0,tl50=0,tl20=0,tl10=0,tl5=0,tl1=0,tl050=0,tl025=0,tl010=0,tl005=0,tl001=0;
        String end="See you later.";
        System.out.println("Thank you for your business.Your change given is: ");
        System.out.println(m);
        System.out.println("pcs"+"TL");
        if (m>=200){tl200=tl200+(int)m/200;m=m-((int)m/200)*200;
        }if (m>=100){tl100=tl100+(int)m/100;m=m-((int)m/100*100);
        }if (m>=50){tl50=tl50=tl50+(int)m/50;m=m-((int)m/50)*50;}
        if (m>=20){tl20=tl20+(int)m/20;m=m-((int)m/20)*20;
        }if (m>=10){tl10=tl10+(int)m;m=m-((int)m/10)*10;
        }if (m>=5){tl5=tl5+(int)m;m=m-((int)m/5)*5;
        }if (m>=1){tl1=tl1+(int)m;m-=((int)m/1)*1;}
        if (m>=0.5){tl050+=(int)m/0.5;m-=((int)m/0.5)*(0.5);}
        if (m>=0.25){tl025+=(int)m/0.25;m-=((int)m/0.25)*(0.25);}
        if (m>=0.1){tl010+=(int)m/0.1;m-=((int)m/0.1)*(0.1);}
        if (m>=0.05) {
            tl005 += (int) m / 0.05;
            m -= ((int) m / 0.05) * (0.05);}
        if (m >= 0.01) {
            tl001 += (int) m / 0.01;
            m -= ((int) m / 0.01) * (0.01);
        }
        System.out.println("200 TL:" + tl200);
        System.out.println("100 TL:" + tl100);
        System.out.println("50 TL:" + tl50);
        System.out.println("20 TL:" + tl20);
        System.out.println("10 TL:" + tl10);
        System.out.println("5 TL:" + tl5);
        System.out.println("1 TL:" + tl1);
        System.out.println("0.5 TL:" + tl050);
        System.out.println("0.25 TL:" + tl025);
        System.out.println("0.10 TL:" + tl010);
        System.out.println("0.05 TL:" + tl005);
        System.out.println("0.01 TL:" + tl001);
        return end;}

        public static void displayMenu(String[]item,double[]price){
        for (int i=1;i<=item.length;i++){
            System.out.println(i+" - for "+item[i-1]+
                    "("+price[i-1]+")");
        }
            System.out.println("0 - to checkout");
        }
        public static void store(String[]items,int[]quantities,double[]price){

        boolean check=true;
        boolean check2=true;
        double haveToPay=0;
        capitalize(items);
        while (check==true) {
            displayMenu(items, price);
            Scanner scn = new Scanner(System.in);
            int selecteditem = scn.nextInt();
            double[] cost = new double[items.length];
            int req;
            int[] counter = new int[items.length];
            if (selecteditem >= 1 && selecteditem <= items.length) {
                System.out.println("How many " + items[selecteditem - 1] +
                        " would you like?");
                req = scn.nextInt();

                if (validRequest(quantities[selecteditem - 1], req)) {
                    cost[selecteditem - 1] += ((quantities[selecteditem - 1] - req) * price[selecteditem - 1]);
                    quantities[selecteditem - 1] -= req;
                    for (int j=1;j<=items.length;j++) {
                        counter[j - 1] += req;
                    }
                } else {
                    System.out.println("ERROR: Invalid Request");
                }
            }
            if (!(selecteditem>=0 && selecteditem<=items.length)){
                System.out.println("There is not an option like that");
                System.out.println("Please enter a valid number.");
            }
            if (selecteditem == 0) {
                System.out.println("*****Customer Total*****");
                for (int i = 0; i < items.length; i++) {
                    if (counter[i] > 0) {
                        System.out.println(items[selecteditem] + " -" +
                                counter[selecteditem] + " * " + price[selecteditem] + " =" + cost[selecteditem]);
                        haveToPay += cost[selecteditem];
                    }
                }
                System.out.println("Total due - " + haveToPay);
                System.out.println();

                while (check2 = true) {
                    System.out.println("Please enter amount given");
                    double money = scn.nextDouble();
                    money -= haveToPay;
                    cashReturned(money);
                    System.out.println();

                    System.out.println("Remaining Amounts");
                    for (int i = 1; i <= items.length; i++) {
                        System.out.println(items[i] + "->" + (quantities[i] - counter[i]));
                    }
                    break;


                }
            }
        }}


    public static void main(String []args){
        String[]items={"SNİCKERS","moka","tyfn"};
        double[]prices={5,6.5,7};
        int[]quantity={10,20,30};
        store(items,quantity,prices);
    }
}
