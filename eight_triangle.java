package JavaRushTests;

public class eight_triangle {

        public static void main(String[] args) {
            for(int a=1; a<=10; a++){//луп для столбцов
                int start=a;//количество звездочек в первой строке
                for(int j=0; j<start; j++){//луп для звездочек
                    System.out.print("8");
                }
                System.out.println();
            }
        }
}
