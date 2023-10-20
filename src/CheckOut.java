import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean response = false;
        double price = 0;

            while(!response) {
                double item = SafeInput.getRangedDouble(in, "Enter the price of the item", 0.50, 10);
                price += item;
                System.out.println("The price of the item is: " + price);

                response = SafeInput.getYNConfirm(in, "Do you have another item to add? ");
            }


        System.out.printf("Total Price: %.2f", price);
    }
}
