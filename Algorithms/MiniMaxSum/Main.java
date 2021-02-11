package HackerRank.MiniMaxSum;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        long[] array = getArray(input);
        printMinMaxSumOfArray(array);

    }

    public static long[] getArray(Scanner input){

        long[] array = new long[5];

        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

        input.close();

        return array;
    }

    public static void printMinMaxSumOfArray(long[] array){

        long MaxValue = Long.MIN_VALUE, MinValue = Long.MAX_VALUE;
        long MaxSumOfArray = 0, MinSumOfArray = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > MaxValue) MaxValue = array[i];
            if(array[i] < MinValue) MinValue = array[i];
            MaxSumOfArray += array[i];
            MinSumOfArray += array[i];
        }  

        System.out.print(MinSumOfArray - MaxValue + " ");
        System.out.print(MaxSumOfArray - MinValue);

    }
    
}
