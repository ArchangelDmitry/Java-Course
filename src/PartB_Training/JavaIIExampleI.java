package PartB_Training;

public class JavaIIExampleI {

    /**
     * This program finds the square of the largest of two numbers
     */
    public static void main(String[] args) {

        //starts init variables
        int a = 5;
        int b = 10;

        //find max of numbers and print square of it
        if (a > b) {
            System.out.println("a^2 = " + a * a);
        } else {
            System.out.println("b^2 = " + b * b);
        }
    }
}