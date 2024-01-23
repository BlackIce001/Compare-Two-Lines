public class Main
{
    public static void main(String[] args)
    {
        stline line1 = new stline(2.0, 3.0);
        stline line2 = new stline(2.0, 3.0);

        // Displaying the slope and intercept of each line
        System.out.println("Line 1 - Slope: " + line1.calculateSlope() + ", Intercept: " + line1.calculateIntercept());
        System.out.println("Line 2 - Slope: " + line2.calculateSlope() + ", Intercept: " + line2.calculateIntercept());

        if (line1.equals(line2)) {
            System.out.println("both lines are same");
        } else {
            System.out.println("lines are not same");
        }

    }
}