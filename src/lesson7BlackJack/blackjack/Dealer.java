package lesson7BlackJack.blackjack;

public class Dealer extends Player {

    @Override
    public boolean needsMoreCard() {
        int valueCard = this.valueHand();
        if (valueCard < 17) {
            return true;
        }
        return false;
    }
}
