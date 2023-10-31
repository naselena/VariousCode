package JavaRushTests;

import java.util.Arrays;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
       capacity*=1.5;
       elements= Arrays.copyOf(elements, capacity);

//        capacity = (int) (capacity *  1.5);
//        String[] newElements = new String[capacity];
//        for (int i = 0; i < elements.length; i++) {
//            newElements[i] = elements[i];
//        }
//        elements = newElements;
    }
    public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        }
    }
}
