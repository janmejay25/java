import java.util.*;

class clsArray {
    public static void main(String[] args) {
        // ArrayList Example
        ArrayList<String> list = new ArrayList<String>();
        list.add("xyz");
        list.add("ABC");
        list.add("MAX");
        Iterator<String> itr = list.iterator();
        System.out.println("ArrayList Elements:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // LinkedList Example
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("123");
        linkedList.add("456");
        linkedList.add("789");
        Iterator<String> linkedItr = linkedList.iterator();
        System.out.println("\nLinkedList Elements:");
        while (linkedItr.hasNext()) {
            System.out.println(linkedItr.next());
        }

        // Vector Example
        Vector<String> vector = new Vector<String>();
        vector.add("PQR");
        vector.add("LMN");
        vector.add("TUV");
        Iterator<String> vectorItr = vector.iterator();
        System.out.println("\nVector Elements:");
        while (vectorItr.hasNext()) {
            System.out.println(vectorItr.next());
        }
    }
}