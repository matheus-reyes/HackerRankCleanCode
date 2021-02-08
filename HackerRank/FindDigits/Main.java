package HackerRank.FindDigits;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int numberOfCases = input.nextInt();

        for(int i = 0; i < numberOfCases; i++){
            long number = input.nextLong();
            System.out.println(findDigits(number));
        }

        input.close();

    }

    public static int findDigits(long number){

        int numberOfDigitsDivided = 0;
        String stringNumber = Long.toString(number);

        for(int i = 0; i < stringNumber.length(); i++){
            if((Character.getNumericValue(stringNumber.charAt(i)) != 0) && (number % Character.getNumericValue(stringNumber.charAt(i)) == 0)){
                numberOfDigitsDivided++;
            }
        }

        return numberOfDigitsDivided;

    }

}
