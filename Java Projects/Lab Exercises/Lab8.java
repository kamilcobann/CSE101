public class Lab8 {
    /**
     * @author Kamil Çoban
     * @since 29.11.19
     * @param array1
     * @return
     */
  public static int[]reverseArray(int[]array1){
      int x=array1.length;

      for(int i=0;i<=x-1;i++){
          int q=array1[i];
          array1[i]=array1[x-1];
          array1[x-1]=q;


      }
return array1;

}
    public static double[] findMeans(int[]array1){
      int k=array1.length;
      int sum=0;
      int sum1=1;
      int sum2=1;
      double arithmeticMean;
      double harmonicMean;
      double geometricMean;
      for (int i=1;i<=k;i++){
          sum+=array1[i-1];

      }
      for (int i=1;i<=k;i++){
          sum1*=array1[i-1];

      }
      for (int i=1;i<=k;i++){
          sum2+=(1/array1[i-1]);

      }
        arithmeticMean=(double)(sum)/(double)k;
        geometricMean=Math.pow((sum1),1/k);
        harmonicMean=k/sum2;

        double[] newArray={arithmeticMean,geometricMean,harmonicMean};
return newArray;

  }
public static void main(String[]args){
      int [] arr={2,2,4,2};
      double []array2=findMeans(arr);
      int [] array3= reverseArray(arr);

    for(int i=1; i<arr.length;i++){
        System.out.println(array2[i-1]);
    }
    for (int k=0;k<=arr.length;k++){
        System.out.println(array3[k]);
    }
}
}
