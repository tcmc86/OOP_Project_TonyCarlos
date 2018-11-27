import javax.swing.*;
import java.util.concurrent.Callable;

public class Poker {
    public static void main(String[] args) {

        String name = "";
        String numPlayersAsString;

        //Create a new deck
        Deck deck = new Deck();
        Card card = new Card();


        //Create set amount of players
        Player player = null;
        Player[] players = new Player[4];
        players[0] = new Player();
        players[1] = new Player();
        players[2] = new Player();
        players[3] = new Player();


        //Create set amount of cards
        Card[] hand = new Card[5];
        hand[0] = new Card();
        hand[1] = new Card();
        hand[2] = new Card();
        hand[3] = new Card();
        hand[4] = new Card();

        //Shuffle the deck of cards
        deck.shuffleDeck();

        //Enter the number of players to play
        numPlayersAsString = JOptionPane.showInputDialog("Enter number of player (min 2, max 4 players): ");
        int numPlayers = Integer.parseInt(numPlayersAsString);

        if(numPlayers < 2){
            JOptionPane.showMessageDialog(null,"Not enough players!","Error",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (numPlayers > 4){
            JOptionPane.showMessageDialog(null,"Too many players!","Error",JOptionPane.INFORMATION_MESSAGE);
        }
        //Deal to the number of player selected
        else{
            int i;
            for(i = 0; i < numPlayers; i++){
                name = JOptionPane.showInputDialog("Enter name player " + (i + 1) + ": ");
                players[i] = new Player();

            }

            for (int j = 0; j < numPlayers; j++) {
                JOptionPane.showMessageDialog(null, players[0].toString());
            }









        }


















    }



}
