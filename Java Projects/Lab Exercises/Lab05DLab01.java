public class Lab05DLab01
/**
 * @author Kamil Çoban
 * @since 29.03.20
 */
{
    public static void main(String[]args){
       try {
           String[] weekends = {"Saturday", "Sunday"};
           System.out.println(weekends[3]);
       }catch (ArrayIndexOutOfBoundsException k){
           System.out.println("We have only 2 days in weekends.");
       }
       try {
           String word = "labassignment";
           System.out.println(word.charAt(14));
       }catch (StringIndexOutOfBoundsException k){
           System.out.println("Something went wrong");
       }

       try {
           int sayi1=999;
           int sayi2=0;
           int bolme=999/0;
           System.out.println("Result is "+bolme);
       }catch (ArithmeticException k){
           System.out.println("You can't divide an integer by zero.");
       }



}

}
