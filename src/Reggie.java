import java.util.Scanner;

public class Reggie
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        String SSN = "^\\d{3}-\\d{2}-\\d{4}$";
        String mySSN = SafeInput.getRegExString(in, "Enter your SSN", SSN);
        System.out.println("Your SSN is: " + mySSN);

        String mNumber = "^(M|m)\\d{5}$";
        String myMNum = SafeInput.getRegExString(in, "Enter your M number", mNumber);
        System.out.println("Your M number is: " + myMNum);


         String menuC = "^[OoSsVvQq]$";
         String myMenuC = SafeInput.getRegExString(in, "Enter a menu choice", menuC);
         System.out.println("Your menu choice is: " + myMenuC);


    }
}
