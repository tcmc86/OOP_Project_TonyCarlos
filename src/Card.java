public class Card {

    private String rank;
    private String suit;

    public Card(String rank, String suit) {

        this.rank = rank;
        this.suit = suit;
    }

    public Card(String rank, String suit, int i) {

    }

    public Card() {

    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return getRank() + " of " + getSuit();
    }
}

