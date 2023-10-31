package JavaRushTests;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        storage.add(0,s);
    }

    public String pop() {
        storage.get(0);
        return storage.remove(0);
    }

    public String peek() {
return storage.get(0);
    }

    public boolean empty() {
       return storage.isEmpty();
    }

    public int search(String s) {
        if(s==null){
            return -1;}
        return storage.indexOf(s);
    }
}
