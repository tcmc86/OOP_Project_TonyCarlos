import javax.swing.*;

public class Poker {
    public static void main(String[] args) {

        String playersAsString;
        int players;

        Deck deck = new Deck();
        Player[4] = new Player();


        //Shuffle th deck
        deck.shuffleDeck();


        //Pick the number of players to deal to between 2 and 4
        playersAsString = JOptionPane.showInputDialog("Enter the number of player: " );
        players = Integer.parseInt(playersAsString);

        if (players <= 1) {
            JOptionPane.showMessageDialog(null, "Not enough players", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
        } else if(players >= 5){

            JOptionPane.showMessageDialog(null, "To Many players", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
        }
        else{

        }

        deck.displayDeck();

        //Deal to Players




    }
}
