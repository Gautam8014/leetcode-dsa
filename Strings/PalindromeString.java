// Source code written for DSA String practice
public class PalindromeString {

    public static void main(String[] args) {
        String str = "madam";
         String rvc ="";

     for(int i= str.length()-1; i>=0; i--) {
        rvc += str.charAt(i);
     }


      if(str.equals(rvc)){
        System.out.println("palindrome");
      }
    }


}
