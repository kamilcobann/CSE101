import java.util.Scanner;

public class Store_20180808060
/**
 * @author Kamil Çoban
 * @since 14.11.2019
 */
{
    public static String capitalize(String product){
        char c=Character.toUpperCase(product.charAt(0));
        product=c+product.substring(1);
        String bosluk=" ";
        for (int i=1; i<product.length();i++){
            if (product.charAt(i)==' '){
                c=Character.toUpperCase(product.charAt(i+1));
                product=product.substring(0,i)+bosluk+c+product.substring(i+2);

            }
        }




        return product;
    }
    public static boolean validRequest(int quantity,int request){
        if (request>=0&&request<=quantity){
            return true;
        }else
            return false;
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


    public static void main(String[]args){
        System.out.println("*****Store Inventory Entry*****");
        Scanner q=new Scanner(System.in);
        System.out.println("Enter the name of first product: ");
        String prd1=q.nextLine();
        prd1=capitalize(prd1);
        System.out.println("Enter the number of "+capitalize(prd1)+":");
        int prdnumber1=q.nextInt();
        prdnumber1=Math.abs(prdnumber1);
        System.out.println("Enter the price of "+capitalize(prd1)+":");
        double prdprice1=q.nextDouble();
        prdprice1=Math.abs(prdprice1);
        System.out.println();
        q.nextLine();

        Scanner w=new Scanner(System.in);

        System.out.println("Enter the name of second product: ");
        String prd2 = w.nextLine();
        prd2=capitalize(prd2);
        System.out.println("Enter the number of "+capitalize(prd2)+":");
        int prdnumber2=w.nextInt();
        prdnumber2= Math.abs(prdnumber2);
        System.out.println("Enter the price of "+capitalize(prd2)+":");
        double prdprice2=w.nextDouble();
        prdprice2=Math.abs(prdprice2);
        System.out.println();
        w.nextLine();

        Scanner e=new Scanner(System.in);
        System.out.println("Enter the name of third product:");
        String prd3=e.nextLine();
        prd3=capitalize(prd3);
        System.out.println("Enter the number of "+capitalize(prd3)+":");
        int prdnumber3=e.nextInt();
        prdnumber3=Math.abs(prdnumber3);
        System.out.println("Enter the price of "+capitalize(prd3)+":");
        double prdprice3=e.nextDouble();
        prdprice3=Math.abs(prdnumber3);
        System.out.println();
        e.nextLine();


        Scanner r=new Scanner(System.in);
        System.out.println("Enter the name of fourth product:");
        String prd4=r.nextLine();
        prd4=capitalize(prd4);
        System.out.println("Enter the number of "+capitalize(prd4)+":");
        int prdnumber4=r.nextInt();
        prdnumber4=Math.abs(prdnumber4);
        System.out.println("Enter the price of "+capitalize(prd4)+":");
        double prdprice4=r.nextDouble();
        prdprice4=Math.abs(prdnumber4);
        System.out.println();
        r.nextLine();

        int prdcounter1=0;
        int prdcounter2=0;
        int prdcounter3=0;
        int prdcounter4=0;


        System.out.println("*****Customer Entry*****");
        boolean check= true;
        boolean check2= true;
        while (check=true){
            Scanner k= new Scanner(System.in);
            System.out.println("Welcome to our store,we have the following.Please enter what would you like:");
            System.out.println("1-"+prd1);
            System.out.println("2-"+prd2);
            System.out.println("3-"+prd3);
            System.out.println("4-"+prd4);
            System.out.println("0- to checkout");
            System.out.println();

            String select = q.nextLine();


            if (select.equals("1")){
                System.out.println("How many "+prd1+" would you like?");
                int s1=k.nextInt();
                if (!validRequest(prdnumber1,s1)){
                    System.out.println("Please enter lower than this.");
                }
                if (validRequest(prdnumber1,s1)){
                    prdcounter1+=s1;
                    prdnumber1-=s1;
                }
            }
            if (select.equals("2")){
                System.out.println("How many "+prd2+" would you like?");
                int s2=k.nextInt();
                if (validRequest(prdnumber2,s2)){
                    prdcounter2+=s2;
                    prdnumber2-=s2;
                }else System.out.println("Please enter lower than this.");
            }
            if (select.equals("3")){
                System.out.println("How many "+prd3+" would you like?");
                int s3=k.nextInt();
                if(validRequest(prdnumber3,s3)){
                    prdcounter3+=s3;
                    prdnumber3-=s3;
                }else System.out.println("Please enter lower than this.");
            }
            if (select.equals("4")){
                System.out.println("How many "+prd4+" would you like?");
                int s4=k.nextInt();
                if (validRequest(prdnumber4,s4)){
                    prdcounter4+=s4;
                    prdnumber4-=s4;
                }else System.out.println("Please enter lower than this.");
            }
            if (select.equals("0")){
                System.out.println("*****Customer Total*****");
                if(prdcounter1>0){
                    System.out.println(prd1+"-->"+prdcounter1+"*"
                            +prdprice1+"="+prdcounter1*prdprice1);
                }
                if (prdcounter2>0){
                    System.out.println(prd2+"-->"+prdcounter2+"*"
                            +prdprice2+"="+prdcounter2*prdprice2);
                }
                if (prdcounter3>0){
                    System.out.println(prd3+"-->"+prdcounter3+"*"
                            +prdprice3+"="+prdprice3*prdcounter3);
                }
                if (prdcounter4>0){
                    System.out.println(prd4+"-->"+prdcounter4+"*"
                            +prdprice4+"="+prdprice4*prdcounter4);
                }
                double sum=((prdprice4*prdcounter4)+(prdprice3*prdcounter3)+
                        (prdcounter2*prdprice2)+(prdcounter1*prdprice1));
                System.out.println("---------------------");
                System.out.println("Total due -"+sum);
                while (check2=true){
                    System.out.println("Please enter amount given:");
                    Scanner t=new Scanner(System.in);
                    double givenm=t.nextDouble();
                    if (givenm>=sum){givenm-=sum;cashReturned(givenm);
                        System.out.println("*Remaining Amounts*");
                        System.out.println(prd1+"-"+prdnumber1);
                        System.out.println(prd2+"-"+prdnumber2);
                        System.out.println(prd3+"-"+prdnumber3);
                        System.out.println(prd4+"-"+prdnumber4);
                    }else{
                        double givenm2=0;
                        do {
                            System.out.println("It's not enough.");
                            System.out.println("Please enter amount given:");
                            givenm2=q.nextDouble();
                            if (givenm2>=sum){givenm2-=sum;cashReturned(givenm2);
                                System.out.println("*Remaining Amounts*");
                                System.out.println(prd1+"-"+prdnumber1);
                                System.out.println(prd2+"-"+prdnumber2);
                                System.out.println(prd3+"-"+prdnumber3);
                                System.out.println(prd4+"-"+prdnumber4);
                                break;

                            }
                        }while (givenm2<0);
                        check2=false;
                    }
                    check=false;
                }











            }





        }}}
