package HackerRank.DiagonalDiference;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int sizeArray = input.nextInt();
        int array[][] = getArray2D(input, sizeArray);

        System.out.println(getDiagonalDifference(array));

        input.close();

    }

    public static int[][] getArray2D(Scanner input, int sizeArray){

        int[][] array = new int[sizeArray][sizeArray];

        for(int i = 0; i < sizeArray; i++){
            for(int j = 0; j < sizeArray; j++){
                array[i][j] = input.nextInt();
            }
        }

        input.close();

        return array;

    }

    public static int getDiagonalDifference(int[][] array){

        int sumFirstDiagonal = 0, sumSecondDiagonal = 0;

        for(int i = 0, j = 0; i < array.length; i++, j++){
            sumFirstDiagonal += array[i][j];
        }

        for(int i = 0, j = array.length - 1; i < array.length; i++, j--){
            sumSecondDiagonal += array[i][j];
        }

        return Math.abs(sumFirstDiagonal - sumSecondDiagonal);

    }

}
