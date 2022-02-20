import java.util.Scanner;
/** This class is about prompting the user for the specific input values.
 * This class consists of static methods which are utitlity based.
 * */
public class Validator
{
   
    /** This method prompts the user to key-in any string as input
     **/
   
	public static String getString(String prompt)
    {
		Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        String s = sc.next();  // read user entry
        sc.nextLine();  // discard any other data entered on the line
        return s;
    }
     /** This method prompts the user to key-in any integer as input
     **/
    public static int getInt(String prompt)
    {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

 /** This method prompts the user to key-in any integer between the provided range as input
     * */
    public static int getInt(String prompt, int min, int max)
    {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            i = getInt(prompt);
            if (i <= min)
                System.out.println(
                    "Error! Number must be greater than " + min + ".");
            else if (i >= max)
                System.out.println(
                    "Error! Number must be less than " + max + ".");
            else
                isValid = true;
        }
        return i;
    }

  /** This method prompts the user to key-in any double as input
     **/
     public static double getDouble(String prompt)
    {
        Scanner sc = new Scanner(System.in);
        double d = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

}