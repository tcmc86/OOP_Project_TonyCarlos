public class Card {

    //Store deck in arrays of rank and suit
    private String rank;
    private String suit;





    //Constructor method
    public Card(String rank, String suit) {

        this.rank = rank;
        this.rank = suit;


    }




    public String getCardRank()
    {
        return rank;
    }

    public String getCardSuit()
    {
        return suit;
    }



    public void setCardRank(String cardRank) {

        this.rank = cardRank;
    }

    public void setCardSuit(String cardSuit) {

        this.suit = cardSuit;
    }


    @Override

    public String toString() {

        return getCardRank() + " of " + getCardSuit();
    }
}


