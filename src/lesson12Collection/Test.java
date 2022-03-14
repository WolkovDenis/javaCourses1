package lesson12Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long startArrayList = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add("qwerty" + i);
        }
        long endArrayList = System.currentTimeMillis();
        System.out.println("Add ArrayList:" + (endArrayList - startArrayList));

        ////////////////////////////////////////////////////////////////////////

        long startLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add("qwerty" + i);
        }
        long endLinkedList = System.currentTimeMillis();
        System.out.println("Add LinkedList:" + (endLinkedList - startLinkedList));

        //////////////////////////////////////////////////////////////////////////

        long startArrayListGet = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.get(i);
        }
        long endArrayListGet = System.currentTimeMillis();
        System.out.println("Add ArrayList:" + (endArrayListGet - startArrayListGet));

        ////////////////////////////////////////////////////////////////////////////////

        long startLinkedListGet = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.get(i);
        }
        long endLinkedListGet = System.currentTimeMillis();
        System.out.println("Add LinkedList:" + (endLinkedListGet - startLinkedListGet));
    }
}
