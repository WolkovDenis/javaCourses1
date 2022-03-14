package lesson7BlackJack.dns;

public class Tovar {

    private String name;
    private int fullPrice;
    private int salePrice;
    private Otziv[] otzivs = new Otziv[1000];

    public Tovar() {
    }

    public Tovar(String name, int fullPrice, int salePrice) {
        this.name = name;
        this.fullPrice = fullPrice;
        this.salePrice = salePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public void addOtziv(Otziv otziv1) {
        for (int i = 0; i < otzivs.length; i++) {
            if (otzivs[i] == null) {
                otzivs[i] = otziv1;
                break;
            }
        }
    }
}
