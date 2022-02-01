import java.util.Scanner;

public class Lab05Dlab01Task2 {
    /**
     * @author Kamil Çoban
     * @since 28.03.20
     */
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter an angle:");
        double angle=scn.nextDouble();
        System.out.println("Your input is "+angle);

        try{
            if (0<=angle && angle<=360){
                System.out.println("The angle is "+angle);
            }else {
                throw new IllegalArgumentException("Angle has to be between 0 and 360");
            }
        }catch (IllegalArgumentException ex){
            if (angle<0 && Math.abs(angle)<=360){
                angle+=360;
            }else if (angle<0 && Math.abs(angle)>360){

                angle=360-((Math.abs(angle))%360);

            }else if (0<=angle && angle>360){
                angle=angle%360;
            }


        }
        finally {
            System.out.println("Actual angle is "+angle);
        }



    }
}
