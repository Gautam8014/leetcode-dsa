// Source code written for DSA practice
public class SecondSmallestElement {

    public static void main(String[] args) {
      int[] arr = new int[]{1, 2, 3, 4, 5, 7, 8, 6, 15};

       int small =99999;
                int ssmall= 9999;
         for(int i=0;i<arr.length;i++){
    if(arr[i]<small){
        small =arr[i];
    }
         }

         for(int i=0;i<arr.length;i++){
            if(arr[i]<ssmall && arr[i]!=small){
                ssmall=arr[i];
            }
         }

         System.out.println(ssmall);
    }
}
