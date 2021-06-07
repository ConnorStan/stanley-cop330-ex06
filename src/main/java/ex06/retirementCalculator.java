/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Connor Stanley
 */

package ex06;

import java.util.Scanner;
import java.util.Date;

public class retirementCalculator {
    public static void main(String[] args) {

        Date d = new Date();
        int year = d.getYear() + 1900;


        Scanner in = new Scanner(System.in);

        // Asking for user's age and retirement age
        System.out.print("What is your current age? ");
        String currentAge = in.nextLine();
        System.out.print("At what age would you like to retire? ");
        String retirementAge = in.nextLine();


        // Numerical Conversion from string to type double to allow for decimals as well as whole numbers
        int age = Integer.parseInt(currentAge);
        int retire = Integer.parseInt(retirementAge);
        int difference = retire - age;
        int yearRetired = year + difference;


        // Output
        System.out.print("You have "+ difference + " years left until you can retire.\n");
        System.out.print("It's " + year + " now so you can retire in " + yearRetired + ".");

    }
}
