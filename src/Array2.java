import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {

        System.out.println("You have two-dimensional array with 6 values:");

        String[][] array = {{"car", "house", "tree"}, {"road", "door", "apple"}};

        { for (int first = 0; first < array.length; first++)
            for (int second = 0; second < array[first].length; second++) {
                System.out.print(array[first][second] + "  ");
                System.out.println();

                Scanner in = new Scanner(System.in);
                System.out.print("Input a 1 random number: ");
                int num = Integer.parseInt(in.nextLine());

                switch (num) {
                    case 1:
                        System.out.print("First array value: " + array[0][0] + " ");
                        break;
                    case 2:
                        System.out.print("Second array value: " + array[0][1] + " ");
                        break;
                    case 3:
                        System.out.print("Third array value: " + array[0][2] + " ");
                        break;
                    default:
                        System.out.print("Invalid value");
                        break;
                }

                System.out.print("Input a 2 random number: ");
                int num2 = Integer.parseInt(in.nextLine());

                switch (num2) {
                    case 1:
                        System.out.print("First array value: " + array[1][0] + " ");
                        break;
                    case 2:
                        System.out.print("Second array value: " + array[1][1] + " ");
                        break;
                    case 3:
                        System.out.print("Third array value: " + array[1][2] + " ");
                        break;
                    default:
                        System.out.print("Invalid value");
                        break;

                }

            }
        }
    }
}