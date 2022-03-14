package lesson5;

public class ToursUtils {

    public static void printToursByCountry(String[][] tours, String country) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0].equals(country)) {
                System.out.printf("Тур: %s,%s рублей,на %s дней,%s,транспорт-%s \n", tours[i][0], tours[i][1],
                        tours[i][2], tours[i][3], tours[i][4]);

            }
        }
    }

    public static void printToursFromToPrice(String[][] tours, int from, int to) {
        for (int i = 0; i < tours.length; i++) {
            String tourPrice = tours[i][1];
            int tourPriceNum = Integer.parseInt(tourPrice); //Преобразуем String в int
            if (tourPriceNum >= from && tourPriceNum <= to) {
                System.out.printf("Тур: %s,%s рублей,на %s дней,%s,транспорт-%s \n", tours[i][0], tours[i][1],
                        tours[i][2], tours[i][3], tours[i][4]);
            }
        }
    }


    public static void printToursByStars(String[][] tours, int from) {
        for (int i = 0; i < tours.length; i++) {
            String tourStars = tours[i][3];
            tourStars = tours[i][3].substring(0, 1);
            int tourStarsNum = Integer.parseInt(tourStars);
            if (tourStarsNum >= from) {
                System.out.printf("Тур: %s,%s рублей,на %s дней,%s,транспорт-%s \n", tours[i][0], tours[i][1],
                        tours[i][2], tours[i][3], tours[i][4]);
            }
        }
    }

    public static void printToursToCountryOnBudget(String[][] tours, String country, int from, int to) {
        for (int i = 0; i < tours.length; i++) {
            String tourBudget = tours[i][1];
            int toursBudgetNum = Integer.parseInt(tourBudget);
            if (tours[i][0].equals(country) == toursBudgetNum >= from && toursBudgetNum <= to) {
                System.out.printf("Тур: %s,%s рублей,на %s дней,%s,транспорт-%s \n", tours[i][0], tours[i][1],
                        tours[i][2], tours[i][3], tours[i][4]);
            }
        }
    }

    public static void printToursByModeOfTransport(String[][] tours, String transport) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][4].equals(transport)) {
                System.out.printf("Тур: %s,%s рублей,на %s дней,%s,транспорт-%s \n", tours[i][0], tours[i][1],
                        tours[i][2], tours[i][3], tours[i][4]);
            }
        }
    }

    public static void printTourWithAveragePrice(String[][] tours, String country) {

        int summaPriceTur = 0;
        int toursToCountry = 0;

        for (int i = 0; i < tours.length; i++) {
            String tourPrice = tours[i][1];
            int tourPriceNum = Integer.parseInt(tourPrice);
            if  (tours[i][0].equals(country)){
                summaPriceTur += tourPriceNum;
                toursToCountry++;
                int averagePriceTur = summaPriceTur / toursToCountry;
                System.out.printf("Тур: %s, средняя цена-%s рублей \n", tours[i][0], averagePriceTur);
            }
        }
    }
}
