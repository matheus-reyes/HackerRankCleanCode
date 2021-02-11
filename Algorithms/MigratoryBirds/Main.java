package Algorithms.MigratoryBirds;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int numberOfBirds = input.nextInt();
        int[] birds = getBirds(input, numberOfBirds);
        System.out.println(migratoryBirds(birds));
        input.close();

    }

    public static int[] getBirds(Scanner input, int numberOfBirds){

        int[] birds = new int[numberOfBirds];

        for(int i = 0; i < birds.length; i++){
            birds[i] = input.nextInt();
        }

        return birds;

    }

    public static int migratoryBirds(int[] birds){

        int[] birdsIds = new int[5];

        for(int i = 0; i < birds.length; i++){
            birdsIds[birds[i] - 1]++;
        }

        int mostFrequently = birdsIds[0];

        for(int i = 1; i < birdsIds.length; i++){
            if(birdsIds[i] > mostFrequently) mostFrequently = i;
        }

        for(int i = 0; i < birdsIds.length; i++){
            if(birdsIds[i] == mostFrequently) 
                if(i < mostFrequently) mostFrequently = i;
        }

        return mostFrequently + 1;

    }

}