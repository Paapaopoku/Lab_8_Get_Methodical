import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        int setDays = 0;
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter the year",1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter the month", 1, 12);


        switch(month)
        {
            case 2:
                setDays = 28;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                setDays = 30;
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                setDays = 31;
                break;
        }

        int day = SafeInput.getRangedInt(in, "Enter the day: ", 1, setDays);
        int hour = SafeInput.getRangedInt(in, "Enter the hour", 1, 24);
        int minutes = SafeInput.getRangedInt(in, "Enter the minute", 1, 59);

        System.out.println("The birthdate is: " + month + "/" + day + "/" + year);
        System.out.println("The time of birth is: " + hour + ":" + minutes + ":00");

    }
}
