package JavaRushTests;

public class stringBuilder {
    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder builder=new StringBuilder(string);
        for(int i=0; i< strings.length; i++){
            String temp=strings[i];
            builder.append(temp);


        }
        return builder;
    }
    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder builder=new StringBuilder(string);
        builder.replace(start, end, str);
        return builder;
    }
}
