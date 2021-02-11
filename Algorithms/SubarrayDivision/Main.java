package HackerRank.SubarrayDivision;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int numberOfSquares = input.nextInt();
        int[] numberOfChocolateSquares = getNumberOfChocolateSquares(input, numberOfSquares);
        int ronBirthday = input.nextInt();
        int ronBirthMonth = input.nextInt();
        birthday(numberOfChocolateSquares, ronBirthday, ronBirthMonth);
        input.close();

    }

    public static int[] getNumberOfChocolateSquares(Scanner input, int numberOfSquares){

        int[] numberOfChocolateSquares = new int[numberOfSquares];

        for(int i = 0; i < numberOfChocolateSquares.length; i++){
            numberOfChocolateSquares[i] = input.nextInt();
        }

        return numberOfChocolateSquares;

    }

    public static void birthday(int[] numberOfChocolateSquares, int ronBirthday, int ronBirthMonth){

        int numberOfWays = 0, sum = 0;

        for(int i = 0; i <= numberOfChocolateSquares.length - ronBirthMonth; i++){
            for(int j = i; j < ronBirthMonth + i; j++){
                sum += numberOfChocolateSquares[j];
            }
            if(sum == ronBirthday) numberOfWays++;
            sum = 0;
        }

        System.out.println(numberOfWays);

    }

}
