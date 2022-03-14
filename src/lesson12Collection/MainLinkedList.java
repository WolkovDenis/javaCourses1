package lesson12Collection;

import java.util.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(3);   //Добовляет по умолчанию в конец коллекции
        numbers.add(5);
        numbers.add(7);

        numbers.add(0,111);   //Добовление элемента по индексу
        numbers.set(0,222);                 //Заменяет элемент по индексу
        System.out.println(numbers);
    }
}

