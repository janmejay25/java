public class stringbufftest {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str);
        StringBuffer s1 = new StringBuffer("janmejay");
        System.out.println(s1);
        s1.append(str);
        System.out.println(s1);
        s1.insert(8,"pandya");
        System.out.println(s1);
       s1.delete(8,14);
       System.out.println(s1);
       s1.reverse();
       System.out.println(s1);
       String str2 = s1.toString();

    }
}
