package HackerRank.Staircase;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int numberOfSymbols = input.nextInt();
        staircase(numberOfSymbols);
        input.close();

    }

    public static void staircase(int numberOfSymbols){

        for(int i = 0; i < numberOfSymbols; i++){
            System.out.println(" ".repeat(numberOfSymbols - (i + 1)) + "#".repeat(i + 1));
        }

    }

}