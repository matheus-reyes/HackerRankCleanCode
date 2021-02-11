package HackerRank.Array2D;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[][] array2D = getArray2D(input);

        System.out.println(getMaxSumArray2D(array2D));

        input.close();

    }

    public static int[][] getArray2D(Scanner input){
        
        int[][] array2D = new int[6][6];

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                array2D[i][j] = input.nextInt();
            }
        }

        return array2D;

    }

    public static int getMaxSumArray2D(int[][] array2D){

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int topSum = array2D[i][j] + array2D[i][j + 1] + array2D[i][j + 2];
                int middleSum = array2D[i + 1][j + 1];
                int bottomSum = array2D[i + 2][j] + array2D[i + 2][j + 1] + array2D[i + 2][j + 2];
                if((topSum + middleSum + bottomSum) > maxSum) maxSum = topSum + middleSum + bottomSum;
            }
        }

        return maxSum;

    }

}