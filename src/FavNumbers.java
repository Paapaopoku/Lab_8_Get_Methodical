import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);


        int fav = SafeInput.getInt(in, "Enter you favorite int");
        double num = SafeInput.getDouble(in, "Enter you favorite double");

        System.out.println("\nYour favorite int is " + fav);
        System.out.println("\nYour favorite double is " + num);
    }
}
