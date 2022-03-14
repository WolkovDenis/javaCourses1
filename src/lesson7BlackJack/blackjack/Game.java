package lesson7BlackJack.blackjack;

import java.util.ArrayList;

public class Game implements IGame {

    private ArrayList<Player> players = new ArrayList<>();
    private Coloda coloda = new Coloda();

    @Override

    public void addPlayerToGame(Player player) {
        players.add(player);
    }

    @Override
    public void dealPlayersCards() {
        for (Player p : players) {
            p.addCardToHand(coloda.getRandomCard());
            p.addCardToHand(coloda.getRandomCard());
        }
    }

    @Override
    public void dealMainRound() {
        for (Player p : players) {
            while (p.needsMoreCard()) {
                p.addCardToHand(coloda.getRandomCard());
            }
        }
    }

    @Override
    public void printWinner() {
        for (Player p : players) {
            if (p.valueHand() > 21) {
                p.setCanWin(false);
            }
        }
        if (this.countPretendWinner() == 0) {
            for (Player p : players) {
                if (p instanceof Dealer) {
                    System.out.println("Победил крупье");
                    p.openHand();
                    return;
                }
            }
        }
        if (this.countPretendWinner() == 1) {
            for (Player p : players) {
                if (p.isCanWin()) {
                    System.out.println("Победитель");
                    p.openHand();
                    return;
                }
            }
        }
        int winnerValue = 0;
        for (Player p : players) {
            if (p.isCanWin() && p.valueHand() > winnerValue) {
                winnerValue = p.valueHand();
            }
        }
        for (Player p : players) {
            if (p.valueHand() == winnerValue) {
                System.out.println("Победитель");
                p.openHand();
            }
        }
    }

    private int countPretendWinner() {
        int summa = 0;
        for (Player p : players) {
            if (p.isCanWin()) {
                summa++;
            }
        }
        return summa;
    }
}
