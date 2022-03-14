package lesson7BlackJack.dns;

import java.util.Date;

public class Otziv {
    private Date dateOfPubl;
    private int rate;
    private String mainText;
    private String username;

    public Otziv() {
    }

    public Otziv(int rate, String mainText, String username) {
        this.dateOfPubl = new Date();
        this.rate = rate;
        this.mainText = mainText;
        this.username = username;
    }

    public Date getDateOfPubl() {
        return dateOfPubl;
    }

    public void setDateOfPubl(Date dateOfPubl) {
        this.dateOfPubl = dateOfPubl;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
