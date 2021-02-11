package HackerRank.JumpingOnTheClouds;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int numberOfClouds = input.nextInt();
        int[] clouds = getClouds(input, numberOfClouds);
        input.close();
        System.out.println(JumpingOnClouds(clouds));

    }

    public static int[] getClouds(Scanner input, int numberOfClouds){

        int[] clouds = new int[numberOfClouds];

        for(int i = 0; i < clouds.length; i++){
            clouds[i] = input.nextInt();
        }

        input.close();

        return clouds;

    }

    public static int JumpingOnClouds(int[] clouds){

        int minimumNumberOfJumps = 0;
        int i = 0;

        while(i < clouds.length - 2){

            if(clouds[i + 2] == 0){
                minimumNumberOfJumps += 1;
                i += 2;
            }

            else if(clouds[i + 2] == 1) {
                minimumNumberOfJumps += 1;
                i += 1;
            }
        }

        if(i == clouds.length - 2){
            if(clouds[i + 1] == 0) minimumNumberOfJumps += 1;
        }

        return minimumNumberOfJumps;

    }

}