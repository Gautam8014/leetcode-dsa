// Source code written for DSA practice
public class SecondLargestElement {

    public static void main(String[] args) {
         int[] arr = new int[]{1, 2, 3, 4, 5, 7, 8, 6, 15};
                int larg =0;
                int slarg= 0;
         for(int i=0;i<arr.length;i++){
    if(arr[i]>larg){
        larg =arr[i];
    }
         }

         for(int i=0;i<arr.length;i++){
            if(arr[i]>slarg && arr[i]!=larg){
                slarg=arr[i];
            }
         }

         System.out.println(slarg);

    }
}
