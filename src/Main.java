public class Main {
    public static void main(String[] args) {

        // задача 1

        byte a = 127;
        short b = 227;
        int c = 39000;
        long d = 2282L;
        float e = 12.21f;
        double f = 128.128;

        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);




        // задача 2

        byte a1 = 67;
        short b1 = 569;
        short b2 = 27897;
        short b3 = -159;
        long c1 = 987678965549L;
        float d1 = 27.12f;
        float d2 = 2.786f;




        // задача 3

        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short paperPackage = 480;
        int students = lP + aS + eA;
        int sheetsPerStudent = paperPackage / students;

        System.out.println("Каждому ученику достанется " + sheetsPerStudent + " листов бумаги");




        // задача 4

        byte bottlesPerMin = 8;
        int producedIn20Min = bottlesPerMin * 20;
        int producedInADay = bottlesPerMin * 60 * 24;
        int producedIn3Days = producedInADay * 3;
        int producedInAMonth = producedInADay * 31;

        System.out.println("За 20 минут машина произвела " + producedIn20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + producedInADay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + producedIn3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + producedInAMonth + " штук бутылок");




        // задача 5

        byte tinsBothColors = 120;
        byte white4Classroom = 2;
        byte brown4Classroom = 4;
        int clasrooms = tinsBothColors / (white4Classroom + brown4Classroom);
        int whiteTins = clasrooms * white4Classroom;
        int brownTins = clasrooms * brown4Classroom;

        System.out.println("В школе, где " + clasrooms + " классов, нужно " + whiteTins + " банок белой краски и " + brownTins + " банок коричневой краски");




        // задача 6


        short bananas = 5 * 80;
        float milk = 200 * 1.05f;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;

        float totalWeight = bananas + milk + iceCream + eggs;
        float totalWeightInKg = totalWeight / 1000;

        System.out.println("Вес завтрака " + totalWeightInKg + " кг (" + totalWeight + " г)");




        // задача 7

        short needToLose = 7 * 1000;
        short loss250 = 250;
        short loss500 = 500;
        int loss250InADay = needToLose / 250;
        int loss500InADay = needToLose / 500;
        int averageDays = (loss250InADay + loss500InADay) / 2;

        System.out.println("Теряя в день " + loss250 + " грамм, можно похудеть за " + loss250InADay + " дней");
        System.out.println("Теряя в день " + loss500 + " грамм, можно похудеть за " + loss500InADay + " дней");
        System.out.println("В среднем, ежедневно теряя от " + loss250 + " до " + loss500 + " грамм, можно похудеть за " + averageDays + " день");




        // задача 8

        int mashaCurrentSalary = 67760;
        int denisCurrentSalary = 83690;
        int chrisCurrentSalary = 76230;

        float salaryIncrease = 0.10f;

        float mashaNewSalary = mashaCurrentSalary * (1 + salaryIncrease);
        float denisNewSalary = denisCurrentSalary * (1 + salaryIncrease);
        float chrisNewSalary = chrisCurrentSalary * (1 + salaryIncrease);

        float mIncomeBeforeIncrease = mashaCurrentSalary * 12;
        float dIncomeBeforeIncrease = denisCurrentSalary * 12;
        float cIncomeBeforeIncrease = chrisCurrentSalary * 12;

        float mIncomeAfterIncrease = mashaNewSalary * 12;
        float dIncomeAfterIncrease = denisNewSalary * 12;
        float cIncomeAfterIncrease = chrisNewSalary * 12;

        float mIncomeDifference = mIncomeAfterIncrease - mIncomeBeforeIncrease;
        float dIncomeDifference = dIncomeAfterIncrease - dIncomeBeforeIncrease;
        float cIncomeDifference = cIncomeAfterIncrease - cIncomeBeforeIncrease;

       System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mIncomeDifference + " рублей.");
       System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + dIncomeDifference + " рублей.");
       System.out.println("Кристина теперь получает " + chrisNewSalary + " рублей. Годовой доход вырос на " + cIncomeDifference + " рублей.");
    }
}