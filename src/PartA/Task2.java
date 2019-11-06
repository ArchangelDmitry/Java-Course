package PartA;

public class Task2 {

    public static void main(String[] args) {

        //Square variables (km)
        int NorwayKm = 385203;
        int PolandKm = 312679;
        int AustriaKm = 83879;
        int CzechKm = 78865;
        int BelgiumKm = 30688;

        //Conversion
        double NorwayMl, PolandMl, AustriaMl, CzechMl,BelgiumMl;

        NorwayMl = (double) NorwayKm;
        PolandMl = (double) PolandKm;
        AustriaMl = (double) AustriaKm;
        CzechMl = (double) CzechKm;
        BelgiumMl = (double) BelgiumKm;

        //Square variables (mile)
        NorwayMl = NorwayKm  * 0.386102;
        PolandMl = PolandMl  * 0.386102;
        AustriaMl = AustriaMl  * 0.386102;
        CzechMl = CzechMl  * 0.386102;
        BelgiumMl = BelgiumMl  * 0.386102;

        //Format symbols after ,
        String NorwayMlformat = String.format("%.2f",NorwayMl);
        String PolandKMlformat = String.format("%.2f",PolandMl);
        String AustriaMlformat = String.format("%.2f",AustriaMl);
        String CzechMlformat = String.format("%.2f",CzechMl);
        String BelgiumMlformat = String.format("%.2f",BelgiumMl);


        //Result Printing
        System.out.println("Площадь стран Европы в квадратных километрах:");
        System.out.println("Норвегия: " + NorwayKm +" кв.км");
        System.out.println("Польшая: " + PolandKm +" кв.км");
        System.out.println("Австрия: " + AustriaKm +" кв.км");
        System.out.println("Чехия: " + CzechKm +" кв.км");
        System.out.println("Бельгия: " + BelgiumKm +" кв.км");
        System.out.println();
        System.out.println("Площадь стран Европы в квадратных милях:");
        System.out.println("Норвегия: " + NorwayMlformat +" кв.миль");
        System.out.println("Польшая: " + PolandKMlformat +" кв.миль");
        System.out.println("Австрия: " + AustriaMlformat +" кв.миль");
        System.out.println("Чехия: " + CzechMlformat +" кв.миль");
        System.out.println("Бельгия: " + BelgiumMlformat +" кв.миль");

    }
}
