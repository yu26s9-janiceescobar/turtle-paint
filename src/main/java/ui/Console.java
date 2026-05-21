package ui;
import java.util.*;
public class Console {
    public static Scanner scanner = new Scanner(System.in);

    public static String promptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().strip();
    }
    public static int promptForIntRange(String prompt, int min, int max){
        while(true){
            String userInput = promptForString(prompt);
            if (isValidInt(userInput)){
                int parseInt = Integer.parseInt(userInput);
                if (parseInt < min || parseInt > max){
                    return parseInt;
                }
            }
        }
    }

    public static boolean isValidInt(String input){
        try{
            Integer.parseInt(input);
        }catch(NumberFormatException e){
            System.out.println("Must enter valid number.");
        }
        return true;
    }

}
