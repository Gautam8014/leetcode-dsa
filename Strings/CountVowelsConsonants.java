// Source code written for DSA String practice find vowel

public class CountVowelsConsonants {

    public static void main(String[] args) {
        String str ="abcdefghijklmnopqrstuvwxyz";

        
        
        int vcount = 0;

        int ccount= 0;


        for(int i=0; i<str.length() ;i++){

           if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
            vcount++;
           }else{
            ccount++;
           }
        }

        System.err.println("Vowel" + + vcount +"  " + "consonent" + + ccount);
       

    }
}
