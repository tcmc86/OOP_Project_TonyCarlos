public class Deck extends Card {



    private Card[] deck;
    private int currentCard;
    private final int CARDS = 52;

    // Deck is an array of rank as string and suit as string.
    public Deck() {



        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        deck = new Card[52];

        for (int i = 0; i < 13; i++) { // i = cardRank

            for (int j = 0; j < 4; j++) { // j = cardSuit

                deck[(i + (j * 13))] = new Card(ranks[i], suits[j]);
            }
        }
    }

    // Display the deck of card in order of lowest to highest rank and suit.
    public void displayDeck(){

        for(Card card : deck)
            System.out.println(card);
    }

    //
    public void shuffleDeck() {

        for(int i = 0; i < deck.length; i++) {
            int j = (int)(Math.random() * deck.length);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

    }

    public Card dealACard()
    {
        if (currentCard >= CARDS)
            shuffleDeck();
        return deck[currentCard++];
    }

}





















