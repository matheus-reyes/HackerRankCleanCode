package Algorithms.GradingStudent;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        int[] grades = getGrades(input, numberOfStudents);
        gradingStudents(grades);
        input.close();

    }

    public static int[] getGrades(Scanner input, int numberOfStudents){

        int[] grades = new int[numberOfStudents];

        for(int i = 0; i < grades.length; i++){
            grades[i] = input.nextInt();
        }

        input.close();

        return grades;
    }

    public static void gradingStudents(int[] grades){

        for(int i = 0; i < grades.length; i++){
            if((grades[i] / 5) * 5 + 5 - grades[i] < 3 && grades[i] >= 38) 
                grades[i] = (grades[i] / 5) * 5 + 5;
            System.out.println(grades[i]);
        }

    }

}