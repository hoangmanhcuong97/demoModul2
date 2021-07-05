import java.util.Scanner;

public class WhatNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to read (number < 1000):");
        int number = sc.nextInt();
        int  ones = number % 10;
        int tens = (number / 10) % 10;
        int hundred = number/ 100;
        if(number >= 0 && number < 10){
            switch (number){
                case 0:
                    System.out.print("Zero");
                    break;
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
                default:
                    System.out.print("out of ability");
            }
        }else if(number >= 10 && number < 20){
            switch (ones){
                case 0:
                    System.out.print("Ten");
                    break;
                case 1:
                    System.out.print("Eleven");
                    break;
                case 2:
                    System.out.print("Twelve");
                    break;
                case 3:
                    System.out.print("Thirteen");
                    break;
                case 4:
                    System.out.print("Fourteen");
                    break;
                case 5:
                    System.out.print("Fifteen");
                    break;
                case 6:
                    System.out.print("Sixteen");
                    break;
                case 7:
                    System.out.print("Seventeen");
                    break;
                case 8:
                    System.out.print("Eighteen");
                    break;
                case 9:
                    System.out.print("Nineteen");
                    break;
            }
        }else if(number >= 20 && number < 1000) {
            switch (hundred) {
                case 1:
                    System.out.print("one hundred ");
                    break;
                case 2:
                    System.out.print("Two hundred ");
                    break;
                case 3:
                    System.out.print("Three hundred ");
                    break;
                case 4:
                    System.out.print("Four hundred ");
                    break;
                case 5:
                    System.out.print("Five hundred ");
                    break;
                case 6:
                    System.out.print("Six hundred ");
                    break;
                case 7:
                    System.out.print("Seven hundred ");
                    break;
                case 8:
                    System.out.print("Eight hundred ");
                    break;
                case 9:
                    System.out.print("Nine hundred ");
                    break;
            }
            switch (tens) {
                case 2:
                    System.out.print("Twenty");
                    break;
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Forty");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("Sixty");
                    break;
                case 7:
                    System.out.print("Seventy");
                    break;
                case 8:
                    System.out.print("Eighty");
                    break;
                case 9:
                    System.out.print("Ninety");
                    break;
            }
            switch (ones) {
                case 1:
                    System.out.print("-one");
                    break;
                case 2:
                    System.out.print("-two");
                    break;
                case 3:
                    System.out.print("-three");
                    break;
                case 4:
                    System.out.print("-four");
                    break;
                case 5:
                    System.out.print("-five");
                    break;
                case 6:
                    System.out.print("-six");
                    break;
                case 7:
                    System.out.print("-seven");
                    break;
                case 8:
                    System.out.print("-eight");
                    break;
                case 9:
                    System.out.print("-nine");
                    break;
            }
        } else {
            System.out.println("Can't read!");
        }
    }
}
