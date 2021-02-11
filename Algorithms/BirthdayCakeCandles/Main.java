package Algorithms.BirthdayCakeCandles;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int numberOfCandles = input.nextInt();
        int[] candles = getCandles(input, numberOfCandles);
        input.close();
        System.out.println(birthdayCakeCandles(candles));

    }

    public static int[] getCandles(Scanner input, int numberOfCandles){

        int[] candles = new int[numberOfCandles];

        for(int i = 0; i < candles.length; i++){
            candles[i] = input.nextInt();
        }

        input.close();

        return candles;

    }

    public static int birthdayCakeCandles(int[] candles){

        int tallestCandle = 0;
        int numberOfTallestCandles = 0;

        for(int i = 0; i < candles.length; i++){
            if(candles[i] > tallestCandle){
                tallestCandle = candles[i];
                numberOfTallestCandles = 1;
            } 
            else if(tallestCandle == candles[i]) numberOfTallestCandles++;
        }

        return numberOfTallestCandles;

    }

}
