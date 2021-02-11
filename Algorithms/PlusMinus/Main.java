package Algorithms.PlusMinus;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int sizeOfArray = input.nextInt();
        int[] array = getArray(input, sizeOfArray);

        plusMinus(array);

        input.close();

    }

    public static int[] getArray(Scanner input, int sizeOfArray){

        int[] array = new int[sizeOfArray];

        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

        input.close();

        return array;

    }

    public static void plusMinus(int[] array){

        DecimalFormat decimalFormat = new DecimalFormat("#0.000000");
        int numberOfPositives = 0, numberOfNegatives = 0, numberOfZeros = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > 0) numberOfPositives++;
            if(array[i] < 0) numberOfNegatives++;
            if(array[i] == 0) numberOfZeros++;
        }

        System.out.println(decimalFormat.format((double) numberOfPositives / array.length));
        System.out.println(decimalFormat.format((double) numberOfNegatives / array.length));
        System.out.println(decimalFormat.format((double) numberOfZeros / array.length));

    }

}
