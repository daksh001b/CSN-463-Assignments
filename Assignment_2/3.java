package Assignment_2;

import java.util.Scanner;

class q3{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in); // Scanner class object for input
        int num1=0;
        String month = "";
        int days = 0;

        do{
            System.out.print("Enter number of month: ");
            num1 = input.nextInt();

            if(num1>12 || num1<1)
                System.out.println("Please Enter a valid number!");
        }
        while(num1>12 || num1<1);

        switch(num1){

            case(1):
                month = "January";
                days = 31;
                break;
            case(2):
                month = "February";
                days = 28;
                break;
            case(3):
                month = "March";
                days = 31;
                break;
            case(4):
                month = "April";
                days = 30;
                break;
            case(5):
                month = "May";
                days = 31;
                break;
            case(6):
                month = "June";
                days = 30;
                break;
            case(7):
                month = "July";
                days = 31;
                break;
            case(8):
                month = "August";
                days = 31;
                break;
            case(9):
                month = "September";
                days = 30;
                break;
            case(10):
                month = "October";
                days = 31;
                break;
            case(11):
                month = "November";
                days = 30;
                break;
            case(12):
                month = "December";
                days = 31;
                break;
        }

        System.out.println("Month: " + month);
        System.out.print("Number of days in " + month + ": ");
        System.out.print(days);

    }
}