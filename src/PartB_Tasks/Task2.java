package PartB_Tasks;

public class Task2 {

    public static void main(String[] args) {

        //ax^2 + bx + c = 0

        double a = 2;
        double b = 3;
        double c = 1;
        double d;

        d = b * b - 4 * a *c;
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);;
            double x2 = (-b - Math.sqrt(d)) / (2 * a);;
            System.out.println("Корни x1 = " + x1 + ", x2 = " + x2);
        }
        else if (d == 0) {
            double x = (-b / (2 * a));
            System.out.println("Корень x = " + x);
        }
        else {
            System.out.println("Нет решения для таких a,b,c.");
        }
    }
}

//ax^2 + bx + c = 0
//d = b * b - 4 * a * c;