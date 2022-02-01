public class Lab {
    /**
     *
     * @since 1.11.19
     * @author Kamil Çoban
     */
    public static void main(String[]args){
        int s,sum =0;
        System.out.println("Sayı giriniz:");

        int s=scn.nextInt();
        for (int i=1;i<s;i++){
            if(s % i==0)
                sum +=1;
        }
        if (sum==s)
            System.out.println("sayı uygundur");
    }

}
