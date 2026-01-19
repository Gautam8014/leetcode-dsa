// Source code written for DSA String practice



public class AnagramCheck {

    public static void main(String[] args) {
         String s1 = "listmn";
        String s2 = "silent";
           int count=0;
        
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }


       for(int i=0;i<s1.length();i++){
        for(int j=0;j<s2.length();j++){
            if(s1.charAt(i)== s2.charAt(j)){
                count++;
            }
        }
       }
        if(count == s1.length()){
            System.out.println("Anagram");
        }else{
            System.out.println(" Not Anagram");
        }
        
    }
}
