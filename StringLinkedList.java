package JavaRushTests;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node newNode = new Node();
        Node lastNode = new Node();
        newNode.value = value;
        if (first.next == null) {       // условие для случая, если добавляем самую первую ноду - в коллекции не было элементов
            first.next = newNode;       // в поле next ноды first будет ссылка на новую ноду
            last.prev = newNode;        // в поле prev ноды last будет ссылка на новую ноду
        } else {
            lastNode = last.prev;       // копируем ссылку на будущую предпоследнюю ноду
            newNode.prev = last.prev;   // в поле prev ноды, которую добавляем в коллекцию, присваиваем ссылку на ноду, которая последняя на данный момент
            last.prev = newNode;        // в поле prev ноды last копируем ссылку на новый элемент коллекции - теперь он будет последним
            lastNode.next = newNode;    // в поле next предпоследней ноды копируем ссылку на новый последний элемент коллекции
        }
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
class SolutionLinkedList{
    public static void main(String[] args) {
        StringLinkedList stringLinkedList = new StringLinkedList();
        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.add("3");
        stringLinkedList.add("4");
        stringLinkedList.add("5");
        stringLinkedList.add("6");
        stringLinkedList.add("7");
        stringLinkedList.add("8");
        stringLinkedList.add("9");
        stringLinkedList.printAll();
    }
}