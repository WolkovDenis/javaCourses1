package lesson9Matrix;

public class MainBook {
    public static void main(String[] args) {
        Book books1 = new Book("Лев Толстой", 234,"Война и мир" , 1987, "Речь");
        Book books2 = new Book("В.Пикуль", 621,"Каторга" , 1985, "Вече");
        Book books3 = new Book("В.Пикуль", 576, "Честь имею", 1983, "Вече");
        Jurnal jurnal1 = new Jurnal(1, "Наука и жизнь", 2021, "Знание", 23);
        Jurnal jurnal2 = new Jurnal(2, "Наука", 2019, "Знание", 125);


        PrintPubl[] printPubl = new PrintPubl[5];
        printPubl[0] = books2;
        printPubl[1] = jurnal1;
        printPubl[2] = jurnal2;
        printPubl[3] = books3;
        printPubl[4] = books1;
        printFatPubl(printPubl);
    }

    public static void printFatPubl(PrintPubl[] printPubl) {
        PrintPubl theFatPubl = printPubl[0];
        for (PrintPubl publ : printPubl) {
            if (publ.getPages() > theFatPubl.getPages()) {
                theFatPubl = publ;
            }
        }
        System.out.println(theFatPubl);
    }

    public static void printFatBook(PrintPubl[] printPubl) {
        PrintPubl theFatPubl = null;
        for (PrintPubl publ : printPubl) {
            if (publ instanceof Book) {
                if (theFatPubl == null) {
                    theFatPubl = publ;
                } else {
                    if (publ.getPages() > theFatPubl.getPages()) {
                        theFatPubl = publ;
                    }
                }
            }
        }
        System.out.println(theFatPubl);
    }
}

