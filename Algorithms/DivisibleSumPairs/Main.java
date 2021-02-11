package Algorithms.DivisibleSumPairs;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int sizeOfArray = input.nextInt();
        int divider = input.nextInt();
        int[] array = getArray(input, sizeOfArray);
        System.out.println(divisibleSumPairs(array, divider));
        input.close();

    }

    public static int[] getArray(Scanner input, int sizeOfArray){

        int[] array = new int[sizeOfArray];

        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

        return array;
    }

    public static int divisibleSumPairs(int[] array, int divider){

        int numberOfPairs = 0;

        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
                if((array[i] + array[j]) % divider == 0) numberOfPairs++;
            }
        }

        return numberOfPairs;

    }

}
