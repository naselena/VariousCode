package JavaRushTests;

public class triangle_array {
    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        int[][]array=new int[10][];
        array[0]=new int[1];
        array[1]=new int[2];
        array[2]=new int[3];
        array[3]=new int[4];
        array[4]=new int[5];
        array[5]=new int[6];
        array[6]=new int[7];
        array[7]=new int[8];
        array[8]=new int[9];
        array[9]=new int[10];

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                array[i][j]=i+j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
