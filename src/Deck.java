public class Deck {

    private Card[] deck;
    private int startCard = 0;

    public Deck() {

        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        deck = new Card[52];

        for (int i = 0; i < 13; i++) {

            for (int j = 0; j < 4; j++) {

                deck[(i + (j * 13))] = new Card(ranks[i], suits[j], i + 2);
            }
        }
    }

    public void displayDeck(){

        for(Card card : deck)
            System.out.println(card);
    }

    public void shuffleDeck() {

        for(int i = 0; i < deck.length; i++) {
            int j = (int)(Math.random() * deck.length);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }



    }}







