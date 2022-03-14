package lesson7BlackJack.blackjack;

public class Main {
    public static void main(String[] args) {

        Dealer dealer = new Dealer();
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        Game blackjack = new Game();       //Создаю саму игру

        blackjack.addPlayerToGame(dealer);  //Добавляю крупье как игрока
        blackjack.addPlayerToGame(player1); //Добавляю игроков
        blackjack.addPlayerToGame(player2);
        blackjack.addPlayerToGame(player3);


        blackjack.dealPlayersCards();      //Раздача всем игрокам по две карты
        blackjack.dealMainRound();         //Раздача еще карт
        blackjack.printWinner();
    }
}
