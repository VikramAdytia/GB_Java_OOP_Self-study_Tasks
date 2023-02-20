package TaskThirdMyLinkedList;

import TaskThirdMyLinkedList.MyLinkedList.LinkedContainer;

import java.util.Iterator;


//Создать список по аналогии LinkedList (список связанных элементов),
// реализовать в нем iterable интерфейс.
// Список должен содержать элементы со ссылкой на следующий элемент
// (если показалось мало, то реализовать ссылку и на предыдущий элемент)
public class Main {
    public static void main(String[] args) {

        LinkedContainer<String> stringLinked = new LinkedContainer<>();
        stringLinked.addLast("Создать список по аналогии LinkedList 1");
        stringLinked.addFirst("(список связанных элементов)2");
        stringLinked.addLast("реализовать в нем iterable интерфейс 3");
        stringLinked.addLast("Список должен содержать элементы со ссылкой на следующий элемент 4");
        stringLinked.addFirst("(если показалось мало, то реализовать ссылку и на предыдущий элемент) 5");

        System.out.println(stringLinked.size());
        System.out.println(stringLinked.getElementByIndex(0));
        System.out.println(stringLinked.getElementByIndex(1));
        System.out.println(stringLinked.getElementByIndex(2));
        System.out.println(stringLinked.getElementByIndex(3));

        separator();

        Iterator iterator = stringLinked.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        separator();

        for (String s : stringLinked){
            System.out.println(s);
        }

        separator();

        Iterator discendigIterator = stringLinked.discendigIterator();
        while (discendigIterator.hasNext()){
            System.out.println(discendigIterator.next());
        }

    }
    private static void separator() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}