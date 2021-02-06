package HackerRank.RepeatedString;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String repeatedString = input.next();
        long numberOfCharacters = input.nextLong();

        input.close();

        System.out.println(repeatedString(repeatedString, numberOfCharacters));

    }

    public static long repeatedString(String repeatedString, long numberOfCharacters){

        if(repeatedString.equals("a")) return numberOfCharacters;
        
        String completeString = "";
        long frequencyOfa = 0;

        for(int i = 1; i <= numberOfCharacters / repeatedString.length(); i ++){
            completeString += repeatedString;
        }

        if(numberOfCharacters % repeatedString.length() != 0){
            completeString += repeatedString.substring(0, (int) numberOfCharacters % repeatedString.length());
        }

        for(int i = 0; i < completeString.length(); i++){
            if(completeString.charAt(i) == 'a') frequencyOfa++;
        }

        return frequencyOfa;

    }

}