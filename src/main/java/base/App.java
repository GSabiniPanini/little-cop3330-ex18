package base;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Glenroy Little
 */
import java.util.Scanner;
/**
 Exercise 18 - Temperature Converter
 You’ll often need to determine which part of a program is run based on user input or other events.

 Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit. Prompt for the starting temperature. The program should prompt for the type of conversion and then perform the conversion.

 The formulas are

 C = (F − 32) × 5 / 9
 and

 F = (C × 9 / 5) + 32
 Example Output
 Press C to convert from Fahrenheit to Celsius.
 Press F to convert from Celsius to Fahrenheit.
 Your choice: C
 Please enter the temperature in Fahrenheit: 32
 The temperature in Celsius is 0.

 Constraints
 Ensure that you allow upper or lowercase values for C and F.
 Use as few output statements as possible and avoid repeating output strings.
 Challenges
 Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
 Break the program into functions that perform the computations.
 Implement this program as a GUI program that automatically updates the values when any value changes.
 Modify the program so it also supports the Kelvin scale.
 */
public class App 
{
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        App myApp = new App();
        String msg;

        String choice = myApp.getchoice();
        if(choice.equals("c") || choice.equals("C"))
        {
            Integer temp = myApp.gettempcelsius();
            msg = myApp.celsiusoutput(temp);
        }
        else
        {
            Integer temp = myApp.gettempfahrenheit();
            msg = myApp.fahrenheitoutput(temp);
        }

        myApp.output(msg);
    }

    public String getchoice()
    {
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit");
        System.out.print("Your choice: ");
        String choice = in.nextLine();
        return choice;
    }

    public void output(String msg)
    {
        System.out.println(msg);
    }

    public String fahrenheitoutput(Integer temp)
    {
        String msg = ("The temperature in Fahrenheit is " + temp);
        return msg;
    }

    public String celsiusoutput(Integer temp)
    {
        String msg = ("The temperature in Celsius is " + temp);
        return msg;
    }

    public Integer gettempfahrenheit()
    {
        System.out.print("Please enter the temperature in Fahrenheit: ");
        Integer intemp = in.nextInt();
        Integer temp = intemp * 9 / 5 + 32;
        return temp;
    }

    public Integer gettempcelsius()
    {
        System.out.print("Please enter the temperature in Fahrenheit: ");
        Integer intemp = in.nextInt();
        Integer temp = (intemp - 32) * 5 / 9;
        return temp;
    }
}
