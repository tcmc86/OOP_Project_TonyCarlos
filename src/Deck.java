public class Deck {

    //The deck is an array of cards
    private Card[] deck;

    // Deck is an array of rank as string and suit as string.
    public Deck() {

        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7",
                "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        deck = new Card[52];

        for (int i = 0; i < 13; i++) {      // i = cardRank

            for (int j = 0; j < 4; j++) {   // j = cardSuit

                deck[(i + (j * 13))] = new Card(ranks[i], suits[j]);
            }
        }
    }

    // Display the deck of cards in order
    public void displayDeck() {

        for (Card card : deck)
            System.out.println(card);
    }

    // Display the deck in random order.
    public void shuffleDeck() {

        Card temp;
        for (int i = 0; i < deck.length; i++) {
            int j = (int) (Math.random() * deck.length);
            temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

    }

    public void dealPlayer() {

        //The amount of players to be dealt
        for (int i = 0; i < 4; i++) {
            System.out.println("\nPlayer " + (i + 1) + ":");
            //The amount of cards to be dealt to each player
            for (int j = 0; j < 5; j++) {
                System.out.println(deck[i + (j * 4)]);
            }
        }
    }
}
















