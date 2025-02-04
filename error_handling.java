public class error_handling {
    public static void main(String[] args) {
        System.out.println("hello original");
        try {
            int[] number = {1, 2, 3};
            System.out.println(number[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array big");
        } catch(Exception e){
            System.out.println("error is general"+e);
        }finally{
        System.out.println("finally");}
    }
}

