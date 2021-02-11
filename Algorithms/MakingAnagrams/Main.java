package Algorithms.MakingAnagrams;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String string1 = input.next();
        String string2 = input.next();

        input.close();

        System.out.println(makeAnagram(string1, string2));

    }

    public static int makeAnagram(String string1, String string2){

        int minimumCaractersToDelete = 0;
        int[] caractersString1 = new int[26];
        int[] caractersString2 = new int[26];

        for(int i = 0; i < string1.length(); i++){
            if(string2.indexOf(string1.charAt(i)) == -1) minimumCaractersToDelete ++;
            else caractersString1[string1.charAt(i) - 97]++;
        }

        for(int i = 0; i < string2.length(); i++){
            if(string1.indexOf(string2.charAt(i)) == -1) minimumCaractersToDelete ++;
            else caractersString2[string2.charAt(i) - 97]++;
        }

        for(int i = 0; i < 26; i++){
            if(caractersString1[i] != caractersString2[i]) 
                minimumCaractersToDelete += Math.abs(caractersString1[i] - caractersString2[i]);
        }

        return minimumCaractersToDelete;

    }

}