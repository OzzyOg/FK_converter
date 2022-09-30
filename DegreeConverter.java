import java.util.*;
import java.text.DecimalFormat;

public class DegreeConverter
{
  public static void main(String[]args)
  {
    int fahrenheit;
    double kelvin;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the temperature in Fahrenheit: ");
    fahrenheit = input.nextInt();

    System.out.println("The temperature you entered in Fahrenheit is: " + fahrenheit);

    kelvin = (fahrenheit + 459.67) * 5/9;

    DecimalFormat fmt = new DecimalFormat("0.##");

    System.out.println("The temperature in Kelvin is: " + fmt.format(kelvin));
  }
}
