package Algorithms.BigSorting;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int numberOfElementsOfArray = input.nextInt(); 
        long[] arrayOfStrings = getArrayOfStrings(input, numberOfElementsOfArray);
        bigSorting(arrayOfStrings);
        input.close();

    }

    public static long[] getArrayOfStrings(Scanner input, int numberOfElementsOfArray){

        long[] arrayOfStrings = new long[numberOfElementsOfArray];

        for(int i = 0; i < arrayOfStrings.length; i++){
            arrayOfStrings[i] = Long.parseLong(input.next());
        }

        return arrayOfStrings;

    }

    public static void bigSorting(long[] arrayOfStrings){

        for(int i = 0; i < arrayOfStrings.length - 1; i++){
            for(int j = i + 1; j < arrayOfStrings.length; j++){
                if(arrayOfStrings[i] > arrayOfStrings[j]){
                    long element = arrayOfStrings[i];
                    arrayOfStrings[i] = arrayOfStrings[j];
                    arrayOfStrings[j] = element;
                }
            }
        }

        for(int i = 0; i < arrayOfStrings.length; i++){
            System.out.println(Long.toString(arrayOfStrings[i]));
        }

    }

}
