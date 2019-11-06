package PartA;

public class Task3 {

    public static void main(String[] args) {

        //Сurrency variables
        double Dollar = 24.610;
        double Euro = 27.370;
        double Rub = 0.354;

        int Uah = 5000;

        //Exchange variables
        double UahDollar = Uah / Dollar;
        double UahEuro = Uah / Euro;
        double UahRub = Uah / Rub;

        //Format symbols after ,
        String dollarformat = String.format("%.2f",UahDollar) ;
        String euroformat = String.format("%.2f",UahEuro) ;
        String rubformat = String.format("%.2f",UahRub) ;

        //Char replace
        dollarformat = dollarformat.replace(',','.');
        euroformat = euroformat.replace(',','.');
        rubformat = rubformat.replace(',','.');

        //Results
        System.out.println("По текущему курсу, " +Uah +" гривень это:");
        System.out.println(dollarformat + " Доллара");
        System.out.println(euroformat +" Евро");
        System.out.println(rubformat +" Рубля");

    }
}