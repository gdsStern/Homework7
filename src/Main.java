public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int salary = 15000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000){
            total += total/100;
            total += salary;
            System.out.println("Месяц "+ month + ", сумма накоплений равна " + total +" рублей");
            month++;
        }
        // По заданию, нужно накопить конкретную сумму, но по окончанию цикла не будет нужной суммы
        total += total/100;
        total += salary;
        System.out.println("Месяц "+ month + ", сумма накоплений равна " + total +" рублей");

        System.out.println("Задание 2");
        int i = 0;
        while (i<10) {
            i++;
            System.out.print(i+" ");
        }
        System.out.println(" ");
        for (;i>0;i--) {
            System.out.print(i+" ");
        }
        System.out.println(" ");

        System.out.println("Задание 3");
        int peoples = 12_000_000;
        int totalBirth = peoples/1000*17;
        int totalMortality = peoples/1000*8;
        for (int years = 1;years<=10;years++) {
            peoples = peoples + totalBirth - totalMortality;
            System.out.println("Год "+ years +" , численность населения составляет " + peoples);
        }

        System.out.println("Задание 4");
        int totalSavings = 15000;
        int month4 = 1;
        System.out.println("Месяц "+month4+" - кол-во накоплений: "+totalSavings);
        do {
            totalSavings = totalSavings + totalSavings/100*7;
            month4++;
            System.out.println("Месяц "+month4+" - кол-во накоплений: "+totalSavings);
        }
        while (totalSavings<12_000_000);

        System.out.println("Задание 5");
        int totalSavings5 = 15000;
        int month5 = 1;
        do {
            totalSavings5 = totalSavings5 + totalSavings5/100*7;
            month5++;
            if (month5 % 6==0) {
                System.out.println("Месяц " + month5 + " - кол-во накоплений: " + totalSavings5);
            }
        }
        while (totalSavings5<12_000_000);

        System.out.println("Задание 6");
        int totalSavings6 = 15000;
        int years = 9;
        for (int month6 = 1;month6<=12*years;month6++) {
            totalSavings6 = totalSavings6 + totalSavings6/100*7;
            if (month6%6==0) {
                System.out.println("Месяц "+month6+" - сумма накоплений: "+totalSavings6);
            }
        }

        System.out.println("Задание 7");
        int FridayNumber = 2;
        for (int DayOfMonth = 1;DayOfMonth <= 31;DayOfMonth++) {
            if (DayOfMonth%7==FridayNumber) {
                System.out.println("Сегодня пятница, "+DayOfMonth+"-е число. Необходимо подготовить отчет");
            }
        }

        System.out.println("Задание 8");
        int year = 0;
        for (;year<200;year++) {
            if (year%79==0) {
                System.out.println(1896+year);
            }
        }
    }
}