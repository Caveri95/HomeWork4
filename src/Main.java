public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte a = 1;
        System.out.println("Значение переменной a с типом byte равно " + a);

        short b = 12;
        System.out.println("Значение переменной b с типом short равно " + b);

        int c = 1223423423;
        System.out.println("Значение переменной c с типом int равно " + c);

        long d = 7835633423394874L;
        System.out.println("Значение переменной d с типом long равно " + d);

        float e = 2.19892F;
        System.out.println("Значение переменной e с типом float равно " + e);

        double f = 1.9483934857435;
        System.out.println("Значение переменной f с типом double равно " + f);
        System.out.println("--");
        System.out.println("Задача 2");

        float x = 27.12F;
        long y = 987678965549L;
        byte z = 2;
        short m = 786;
        boolean n = false;
        short k = 569;
        short g = -159;
        short l = 27897;
        short p = 67;
        System.out.println("--");
        System.out.println("Переменные выведены" + x + y + z + m + n + k + g + l + p);
        System.out.println("Задача 3");

        short EkaterinaStudents = 30;
        short LudmilaStudents = 23;
        short AnnaStudents = 27;
        short totalPaper = 480;
        int totalStudents = EkaterinaStudents + LudmilaStudents + AnnaStudents;
        int paperStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");
        System.out.println("--");
        System.out.println("Задача 4");
        short perfomanceBottle2Min = 16;
        int oneDay = 720;
        int perfomanceBottle20Min = perfomanceBottle2Min * 10;
        int perfomanceBottleDay = perfomanceBottle2Min * oneDay;
        int perfomanceBottle3Day = perfomanceBottleDay * 3;
        int perfomanceBottleMonth = perfomanceBottleDay * 30;

        System.out.println("За 20 мин машина произвела " + perfomanceBottle20Min + " штук");
        System.out.println("За один день машина произвела " + perfomanceBottleDay + " штук");
        System.out.println("За 3 дня машина произвела " + perfomanceBottle3Day + " штук");
        System.out.println("За один месяц машина произвела " + perfomanceBottleMonth + " штук");
        System.out.println("--");
        System.out.println("Задача 5");

        int whitePotClass = 2;
        int brownPotClass = 4;
        short totalPot = 120;
        int totalPotClass = whitePotClass + brownPotClass;
        int totalClass = totalPot / totalPotClass;
        int whitePotOnClasses = totalClass * whitePotClass;
        int brownPotOnClasses = totalClass * brownPotClass;

        System.out.println("В школе, где " + totalClass + " классов, нужно " + whitePotOnClasses + " банок белой краски и " + brownPotOnClasses + " коричневой краски");

        System.out.println("--");

        System.out.println("Задача 6");

        short bananas = 5;
        short bananaWeight = 80;
        short milk = 200;
        float milkMlWeight = 1.05F;
        short iceCream = 2;
        short iceCreamWeight = 100;
        short egg = 4;
        short eggWeight = 70;

        float totalBreakfastWeight = (bananas * bananaWeight + milk * milkMlWeight + iceCream * iceCreamWeight + egg * eggWeight) / 1000;

        System.out.println(totalBreakfastWeight);

        System.out.println("--");

        System.out.println("Задача 7");

        short totalNeedLeft = 7000;
        short left250Day = 250;
        short left500Day = 500;
        int daysFor250 = totalNeedLeft / left250Day;
        int daysFor500 = totalNeedLeft / left500Day;
        int averageDays = (daysFor250 + daysFor500) / 2;

        System.out.println(daysFor250);
        System.out.println(daysFor500);
        System.out.println(averageDays);

        System.out.println("--");

        System.out.println("Задача 8");

        int MashaIncome = 67760;
        int DenisIncome = 83690;
        int KrisIncome = 76230;
        int month = 12;
        float upIncomeYear = 1.1F;

        int MashaYearIncome = MashaIncome * month;
        int DenisYearIncome = DenisIncome * month;
        int KrisYearIncome = KrisIncome * month;

        float MashaUpIncome = MashaIncome * upIncomeYear;
        float DenisUpIncome = DenisIncome * upIncomeYear;
        float KrisUpIncome = KrisIncome * upIncomeYear;

        float MashaYearUpIncome = MashaUpIncome * month;
        float DenisYearUpIncome = DenisUpIncome * month;
        float KrisYearUpIncome = KrisUpIncome * month;

        float MashaDifferenceIncome = MashaYearUpIncome - MashaYearIncome;
        float DenisDifferenceIncome = DenisYearUpIncome - DenisYearIncome;
        float KrisDifferenceIncome = KrisYearUpIncome - KrisYearIncome;

        System.out.println("Маша теперь получает " + MashaUpIncome + " рублей. Годовой доход вырос на " + MashaDifferenceIncome + " рублей");
        System.out.println("Денис теперь получает " + DenisUpIncome + " рублей. Годовой доход вырос на " + DenisDifferenceIncome + " рублей");
        System.out.println("Кристина теперь получает " + KrisUpIncome + " рублей. Годовой доход вырос на " + KrisDifferenceIncome + " рублей");












    }
}