import java.util.Scanner;

public class Lab9 {
public static int[][]multipleMatrix(int[][]a, int[][]b){
    int length=a.length;

    int[][]c = new int[length][length];
    for(int i=0;i<length;i++){
        for (int j=0;j<length;j++){
            c[i][j]=a[i][j]+b[i][j];
        }
    }
    for (int k=0;k<length;k++){
        for (int q=0;q<length;q++){
            System.out.print((c[k][q])+"\t");
        }
        System.out.println();
    }
    return c;
}
    public static int[][] calculateTimes(int n){
        int[][]table=new int[n][n];

        for(int a=1;a<=n;a++){
            for (int b=1;b<=n;b++){
                table[a-1][b-1]=a*b;
            }
        }
        for(int i=0;i<table.length;i++){
            int a=1;
            int b=1;
            System.out.println((table[a-1][b-1])+"\t");
        }




        return table;
    }

public static void main(String[]args){
    int[][]a={{1,2},{3,4}};
    int[][]b={{5,6},{7,8}};
    multipleMatrix(a,b);
    calculateTimes(3);


}
}

