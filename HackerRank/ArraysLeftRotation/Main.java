package HackerRank.ArraysLeftRotation;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int sizeOfArray = input.nextInt();
        int numberOfRotations = input.nextInt();
        int[] array = getArray(input, sizeOfArray);

        System.out.println(getLeftRotationArray(array, numberOfRotations));

        input.close();

    }

    public static int[] getArray(Scanner input, int sizeOfArray){

        int[] array = new int[sizeOfArray];

        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

        return array;

    }

    public static String getLeftRotationArray(int[] array, int numberOfRotations){

        String leftRotationArray = "";

        for(int i = 0; i < array.length; i++){
            leftRotationArray += array[(numberOfRotations + i) % array.length] + " ";
        }

        return leftRotationArray;

    }

}
