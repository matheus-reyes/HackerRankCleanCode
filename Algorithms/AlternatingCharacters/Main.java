package HackerRank.AlternatingCharacters;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int numberOfQueries = input.nextInt();

        for(int i = 0; i < numberOfQueries; i++){

            String stringAB = input.next();

            System.out.println(getMinimumNumberOfDeletions(stringAB));

        }

        input.close();

    }

    public static int getMinimumNumberOfDeletions(String stringAB){

        int minimumNumberOfDeletions = 0;

        for(int i = 0; i < stringAB.length() - 1; i++){
            if(stringAB.charAt(i) == stringAB.charAt(i + 1)) minimumNumberOfDeletions++;
        }

        return minimumNumberOfDeletions;

    }

}