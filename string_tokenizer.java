package JavaRushTests;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.StringTokenizer;

public class string_tokenizer {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query,"\\.");
        int count=tokenizer.countTokens();
      String[]array=new String[count];
      for(int i=0; i<count; i++){
          array[i]=tokenizer.nextToken();
      }
        return array;
    }
}