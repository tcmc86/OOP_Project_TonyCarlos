public class Card {

    //Store deck in arrays of rank and suit
    private String cardRank;
    private String cardSuit;
    private int cardValue;




    //Constructor method
    public Card(String rank, String suit,int value) {

        this.cardRank = rank;
        this.cardSuit = suit;
        this.cardValue = value;

    }

    public String getCardRank() {
        return cardRank;
    }

    public String getCardSuit() {
        return cardSuit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardRank(String cardRank) {
        this.cardRank = cardRank;
    }

    public void setCardSuit(String cardSuit) {
        this.cardSuit = cardSuit;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }
    @Override

    public String toString() {
        return this.cardRank + " of " + this.cardSuit;
    }
}


