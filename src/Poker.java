import javax.swing.*;

public class Poker {
    public static void main(String[] args) {

        String name;
        String numPlayersAsString;

        //Create a new deck
        Deck deck = new Deck();
        Card cards = new Card();

        //Create set amount of players
        Player player = null;
        Player[] players = new Player[4];
        players[0] = new Player();
        players[1] = new Player();
        players[2] = new Player();
        players[3] = new Player();


        Hands hand = new Hands();

        //Shuffle the deck of cards
        deck.shuffleDeck();

        numPlayersAsString = JOptionPane.showInputDialog("Enter number of player (min 2, max 4 players): ");
        int numPlayers = Integer.parseInt(numPlayersAsString);

        if(numPlayers < 2){
            JOptionPane.showMessageDialog(null,"Not enough players!","Error",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (numPlayers > 4){
            JOptionPane.showMessageDialog(null,"Too many players!","Error",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            int i;
            for(i = 0; i < numPlayers; i++){
                name = JOptionPane.showInputDialog("Enter name player " + (i + 1) + ": ");
                players[0] = new Player();
                players[1] = new Player();
            }



        }


















    }



}
