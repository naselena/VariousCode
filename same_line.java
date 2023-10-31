package JavaRushTests;

import java.util.Scanner;

public class same_line {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        strings=new String[6];
        for(int i=0; i< strings.length; i++){
            strings[i]= console.nextLine();
        }
        for(int i=0; i< strings.length; i++){
            String iString=strings[i];
            for(int j=i+1; j<strings.length; j++){
                if(iString==null)
                {break;}
                if(iString.equalsIgnoreCase(strings[j])){
                    strings[i]=null;
                    strings[j]=null;
                }
            }
        }
        for(int i=0; i< strings.length; i++){
            System.out.println(strings[i] + ", ");
        }
    }
}
