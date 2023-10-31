package JavaRushTests;
import java.util.Arrays;
import java.util.Objects;



public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
    for(int i=0; i< array.length; i++){
        if(array[i]!=null&&i>0){
            for(int j=0; j<i; j++){
                if(array[j]==null){
                    array[j]=array[i];
                    array[i]=null;
                    break;
                }
            }
        }
    }



    }
}
