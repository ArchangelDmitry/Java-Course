import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {

        System.out.println("You have one-dimensional array with 3 values");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a 1 random number: ");
        int num = Integer.parseInt(in.nextLine());

        String [] array1 = {"car","house","tree"};

        switch (num){
            case 1: System.out.print("First array value: " + array1[0]+" ");
                    break;
            case 2: System.out.print("Second array value: " + array1[1]+" ");
                break;
            case 3: System.out.print("Third array value: " + array1[2]+" ");
                break;
            default: System.out.print("Invalid value");
                break;
        }

    }
}