package JavaRushTests;

public class star_triangle {
    public static void main(String[] args) {
        for(int a=0; a<=10; a++){//луп для столбцов
            int start=10-a;//количество звездочек в первой строке
            for(int j=0; j<start; j++){//луп для звездочек
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
