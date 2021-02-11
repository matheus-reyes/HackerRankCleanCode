package HackerRank.SalesbyMatch;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int numberOfSocks = input.nextInt();
        int[] colorSocks = getColorSocks(input, numberOfSocks);
        input.close();
        System.out.println(getNumberOfPairsSocks(colorSocks));

    }

    public static int[] getColorSocks(Scanner input, int numberOfSocks){

        int[] colorSocks = new int[numberOfSocks];

        for(int i = 0; i < colorSocks.length; i++){
            colorSocks[i] = input.nextInt();
        }

        input.close();

        return colorSocks;

    }

    public static int getNumberOfPairsSocks(int[] colorSocks){

        int numberOfPairSocks = 0;

        for(int i = 0; i < colorSocks.length; i++){

            for(int j = i + 1; j < colorSocks.length; j++){

                if(colorSocks[i] == colorSocks[j] && colorSocks[i] != -1 && colorSocks[j] != -1){
                    numberOfPairSocks++;
                    colorSocks[i] = -1;
                    colorSocks[j] = -1;
                    
                }

            }

        }

        return numberOfPairSocks;

    }

}