import java.util.Arrays;

public class task{
    public static void main(String[] args){
        int[][] field = new int[][] {{0,0,0},{1,1,1},{2,2,2}};
        makePerimeter(field);
        showField(field);
    }

    public static void makePerimeter(int[][] array){
        for (int i = 0; i < array[0].length; i++){
            array[0][i] = -1;
            array[array.length - 1][i] = -1;
        }
        for (int i = 0; i < array[1].length; i++){
            array[i][0] = -1;
            array[i][array[1].length - 1] = -1;
        }
    }

    public static void showField(int[][] array){
        for (int i = 0; i < array[0].length; i++){
            for (int j = 0; j < array[1].length; j++){
                System.out.printf("%4d\t", array[i][j]);
            }
            System.out.println();
        }
    }
}