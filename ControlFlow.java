

import java.util.Scanner;

public class ControlFlowAssignment {
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        // Problem 1

        int x = 7;
        if (x < 10) {
            System.out.println("Less than 10");
        }

        x = 15;


       //Problem 2
        x = 7;
        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }

        x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }


       //Problem 3
        x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }

        x = 50;
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }


        //Problem 4
        x = 15;
        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }

        x = 5;
        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }


        //Problem 5
        System.out.print("Enter a score (0-100): ");
        int score = in.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Score out of range");
        } else if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

//Problem 6
        System.out.print("Enter a number (1-7): ");
        int day = in.nextInt();

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
        }


       //Problem 7
        in.nextLine(); // Clear buffer

        System.out.print("Enter filing status (Single / Married Jointly / Married Separately / Head of Household): ");
        String status = in.nextLine();

        System.out.print("Enter income: ");
        double income = in.nextDouble();

        double tax = 0;

        if (status.equalsIgnoreCase("Single")) {
            if (income <= 8350) {
                tax = income * 0.10;
            } else if (income <= 33950) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            } else {
                tax = income * 0.25; // simplified upper bracket
            }
        } else {
            tax = income * 0.20; // simplified for other statuses
        }

        System.out.println("Estimated tax: $" + tax);

        in.close();
    }
