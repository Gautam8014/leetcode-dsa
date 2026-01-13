public class TwoSum {
    public static void main(String[] args) {
        // check if an array is sorted  ?


        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10};
       
          int num=0;


        for(int i=0;i<arr.length;i++){
        
       if(arr[i]  != i+1){
              System.out.println(i+1);
             break;
       }else{
        num++;
       }


    }

    if(num==arr.length){
 System.out.println("all number is present");

    }

   
         
             
        




      
    }
}
