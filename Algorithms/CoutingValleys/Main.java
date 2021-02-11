package HackerRank.CoutingValleys;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int steps = input.nextInt();
        String path = input.next();

        input.close();

        System.out.println(coutingValleys(steps, path));

    }

    public static int coutingValleys(int steps, String path){

        int level = 0;
        int numberOfValleys = 0;

        for(int i = 0; i < path.length(); i++){

            if(path.charAt(i) == 'U') level++;
            if(path.charAt(i) == 'D') level--;
            if(path.charAt(i) == 'U' && level == 0) numberOfValleys++;

        }

        return numberOfValleys;       

    }

}
