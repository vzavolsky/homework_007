import java.util.Date;

public class Main {
    public static void main(String[] args) {
        task_01();
        space();
        task_02();
        space();
        task_03();
        space();
        task_04();
        space();
        task_05();
        space();
        task_06();
        space();
        task_07();
        space();
        task_08();
    }

    private static void space() {
        System.out.println();
    }

    private static void task_08() {
        Date date = new Date();
        int currentYear = date.getYear() + 1900;
        int yearCounter = 0;
        while (yearCounter < currentYear + 100) {
            yearCounter++;
            if ((yearCounter % 79 == 0) && (yearCounter >= currentYear - 200 && yearCounter <= currentYear + 100)) {
                System.out.println(yearCounter);
            }
        }
    }

    private static void task_07() {
        int     dayCounter = 6,
                daysInTheMonth = 31;
        while (dayCounter <= daysInTheMonth) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет",dayCounter);
            System.out.println();
            dayCounter = dayCounter + 7;
        }
    }
    private static void task_06() {
        int     totalyearsh = 9,
                monthPercent = 7,
                monthCounter = 0;
        double deposit = 15_000;
        while (monthCounter < totalyearsh * 12) {
            monthCounter++;
            deposit = deposit + deposit * monthPercent / 100;
            System.out.printf("%d месяцев потребуется, чтобы накопить %.2f",monthCounter, deposit);
            System.out.println();
        }
    }
    private static void task_05() {
        int     total = 12_000_000,
                monthPercent = 7,
                monthCounter = 0;
        double deposit = 15_000;
        while (deposit <= total) {
            monthCounter++;
            deposit = deposit + deposit * monthPercent / 100;
            if (monthCounter % 6 == 0) {
                System.out.printf("%d месяцев потребуется, чтобы накопить %.2f",monthCounter, deposit);
                System.out.println();
            }
        }
    }

    private static void task_04() {
        int     total = 12_000_000,
                monthPercent = 7,
                monthCounter = 0;
        double deposit = 15_000;
        while (deposit <= total) {
            monthCounter++;
            deposit = deposit + deposit * monthPercent / 100;
            System.out.printf("%d месяцев потребуется, чтобы накопить %.2f",monthCounter, deposit);
            System.out.println();
        }
    }

    private static void task_03() {
        int     population = 12_000_000,
                wereBorn = 17, // per thousand in a year
                haveDied = 8, // per thousand in a year
                periodOfYears = 10;
        int     counter = 0;
        // Get newborns function: (wereBorn - haveDied) / 1000 * population
        while (counter < periodOfYears) {
            counter++;
            population = population + (population * (wereBorn - haveDied) / 1000);
            System.out.printf("Год %d, численность населения составляет %d",counter, population);
            System.out.println();
        }
    }

    private static void task_02() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i+ " ");
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) System.out.print(j + " ");
    }

    private static void task_01() {
        int     total = 0,
                i = 0;

        while (total < 2_459_000) {
            total = total + 15000;
            i++;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей", i, total);
            System.out.println();
        }
    }
}