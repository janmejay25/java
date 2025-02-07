import java.util.Arrays;
public class ForEachLoop {
    public static void main(String[] args) {
        
     // count words with starting capital letter
     String str = "Hello World Java"; 
     int wCount = 0;
     String[] words = str.split(" ");
     System.out.println(Arrays.toString(words));
     for(String word : words){
         if(Character.isUpperCase(word.charAt(0))){
             wCount++;
         }
     }
     System.out.println("number of word with UpperCase is :"+wCount);
    }
}