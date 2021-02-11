package Algorithms.RecursiveAndIterativeFatorial;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int numberFatorial = input.nextInt();
        System.out.println("Iterative: "+iterativeFatorial(numberFatorial));
        System.out.println("Recursive: "+recursiveFatorial(numberFatorial));
        input.close();

    }

    public static int iterativeFatorial(int numberFatorial){

        if(numberFatorial == 0) return 1;

        int totalFatorial = 1;

        for(int i = numberFatorial; i > 0; i--){
            totalFatorial *= i;
        }

        return totalFatorial;

    }

    public static int recursiveFatorial(int numberFatorial){
        if(numberFatorial == 0) return 1;
        else return numberFatorial * recursiveFatorial(numberFatorial - 1);
    }

}
