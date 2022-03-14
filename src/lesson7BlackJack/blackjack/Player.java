package lesson7BlackJack.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements IPlayer {

    private ArrayList<Card> cardsToHand = new ArrayList<>();
    private boolean canWin = true;

    public boolean isCanWin() {
        return canWin;
    }

    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }

    @Override
    public void addCardToHand(Card card) {
        cardsToHand.add(card);
    }

    @Override
    public boolean needsMoreCard() {
        System.out.println("------Карты в руке------");
        for (Card c : cardsToHand) {
            c.open();
        }
        System.out.println("Нужна ли карта?!");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("да")) {
            return true;
        }
        return false;
    }

    @Override
    public int valueHand() {
        int summa = 0;
        for (Card c : cardsToHand) {
            summa = summa + c.getValue();
        }
        return summa;
    }

    @Override
    public void openHand() {
        for (Card c : cardsToHand){
            c.open();
        }
    }
}
