public class Card {

    private String rank;
    private String suit;

    //Contructor method for Card
    public Card(String rank, String suit) {

        this.rank = rank;
        this.suit = suit;
    }

    public Card(String rank, String suit, int i) {

    }

    public Card() {

    }

    // Accessor methods
    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    // Mutator methods
    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

   // To String method
    @Override
    public String toString() {
        return getRank() + " of " + getSuit();
    }
}

