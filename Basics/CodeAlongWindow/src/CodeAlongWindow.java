import java.util.Scanner;

public class CodeAlongWindow {
    public static void main(String[] args) {
        // declare variables for height and width
        float height;
        float width;

        // declare string variables to hold user's height and width input
        String stringHeight;
        String stringWidth;

        // declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        // declare variables for cost of window and trim
        float costOfWindow;
        float costOfTrim;

        // declare no. windows
        int noOfWindows;

        // declare and initialise the Scanner
        Scanner scanner = new Scanner(System.in);

        // get input from the user
        System.out.println("Please enter window height: ");
        stringHeight = scanner.nextLine();
        System.out.println("Please enter window width: ");
        stringWidth = scanner.nextLine();
        System.out.println("Please enter cost of window: ");
        costOfWindow = scanner.nextFloat();
        System.out.println("Please enter cost of trim: ");
        costOfTrim = scanner.nextFloat();
        System.out.println("Please enter number of windows: ");
        noOfWindows = scanner.nextInt();

        // convert String values of height and width to float values
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);

        // calculate area of the window
        areaOfWindow = height * width;

        // calculate perimeter of the window
        perimeterOfWindow = 2 * (height + width);

        // calculate the total cost - use a hard-coded value
        cost = noOfWindows * ((costOfWindow * areaOfWindow) + (costOfTrim * perimeterOfWindow));

        // Display the results to the user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Window cost = " + costOfWindow);
        System.out.println("Trim cost = " + costOfTrim);
        System.out.println("Number of windows = " + noOfWindows);
        System.out.println("Total Cost = " + cost);
    }
}