public class string {
    public static void main(String[] args) {
        String str = "heLLo world";
        // System.out.println("string is "+str);
        // System.out.println("length is "+str.length());

        // //string concatination
        // String str1 = " JAVA";
        // System.out.println("string is "+str.concat(str1));

        // //string changed to upper case
        // System.out.println("string in upper case "+str.toUpperCase());
        
        // //access the string using substring
        // str =str.substring(0, 6);
        // System.out.println("string is "+str.concat(str1));

        // count the capital letter
        int count = 0;
        for(int i = 0;i< str.length();i++){
            System.out.println(str.charAt(i));
            if(Character.isUpperCase(str.charAt(i))){
                 count++; 
            }
        }
        System.out.println("count is :"+count);

        

        // //string is imutable(not modify) only temperory changes apply
        // System.out.println("string is "+str);
    }
}
