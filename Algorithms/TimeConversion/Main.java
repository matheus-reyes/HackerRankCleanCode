package Algorithms.TimeConversion;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String string = input.next();
        input.close();
        System.out.println(timeConversion(string));

    }

    public static String timeConversion(String string){

        String hourFormat = string.substring(string.length() - 2, string.length());
        int hours = Integer.parseInt(string.substring(0, 2));
        String restOfString = string.substring(2, string.length() - 2);

        if(hourFormat.equals("AM")) hours -= 12;
        if(hourFormat.equals("PM") && hours < 12) hours += 12;

        if(hours < 10) return "0" + hours + restOfString;
        else return hours + restOfString;
        
    }
}
