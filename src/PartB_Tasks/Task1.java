package PartB_Tasks;

public class Task1 {
    static public void main(String[] args) {

        int value1 = 2;
        int value2 = 3;
        int value3 = 1;

        if (value1 > value2||value1 > value3) {
            value1 = value1 * value1;
            System.out.println("First value is One of the largest of the three and it's sum of squares: " + value1);
        }
        if (value2 > value1||value2 > value3) {
            value2 = value2 * value2;
            System.out.println("Second value is One of the largest of the three and it's sum of squares: " + value2);
        }
        if (value3 > value1||value3 > value2) {
            value3 = value3 * value3;
            System.out.println("Third value is is One of the largest of the three and it's sum of squares: " + value3);
        }
    }
}
