package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter maximum mark:");
        int maximum = input.nextInt();
        System.out.println("Enter grade:");
        int mark = input.nextInt();

        double percentage = 100.0 *mark / maximum ;

        System.out.println("Mark = " + mark + "/" + maximum + "\nPercentage = " + percentage + "%");

        if (percentage < 0){

        } else if (percentage < 40){
            System.out.println("Grade = U");
        } else if (percentage < 50){
            System.out.println("Grade = E");
        } else if (percentage < 60){
            System.out.println("Grade = D");
        } else if (percentage < 70){
            System.out.println("Grade = C");
        } else if (percentage < 80){
            System.out.println("Grade = B");
        } else
            System.out.println("Grade = A");
    }
}
