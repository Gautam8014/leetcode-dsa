public class RemoveVowels {
    public static void main(String[] args) {
        String str = "HelloWorld";
         String cons="";

         for(int i=0;i<str.length();i++){
            if(str.charAt(i) !='a' && str.charAt(i) !='e' && str.charAt(i) !='i' && str.charAt(i) !='o' && str.charAt(i) !='u'){
                cons+=str.charAt(i);
            }
         }

         System.out.println(cons);

     }
        
    
}

