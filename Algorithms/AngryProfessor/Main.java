package HackerRank.AngryProfessor;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int numberOfCases = input.nextInt();

        for(int i = 0; i < numberOfCases; i++){

            int numberOfStudents = input.nextInt();
            int treshholdNumberOfStudents = input.nextInt();
            int[] arrivalTimesOfStudents = getArrivalTimesOfStudents(input, numberOfStudents);
            System.out.println(angryProfessor(treshholdNumberOfStudents, arrivalTimesOfStudents));
            
        }

        input.close();

    }

    public static int[] getArrivalTimesOfStudents(Scanner input, int numberOfStudents){

        int[] arrivalTimesOfStudents = new int[numberOfStudents];

        for(int i = 0; i < arrivalTimesOfStudents.length; i++){
            arrivalTimesOfStudents[i] = input.nextInt();
        }

        return arrivalTimesOfStudents;

    }

    public static String angryProfessor(int treshholdNumberOfStudents, int[] arrivalTimesOfStudents){

        int numberOfLateStudents = 0;

        for(int i = 0; i < arrivalTimesOfStudents.length; i++){
            if(arrivalTimesOfStudents[i] > 0) numberOfLateStudents++;
        }

        if(numberOfLateStudents >= treshholdNumberOfStudents) return "NO";
        else return "YES";

    }

}