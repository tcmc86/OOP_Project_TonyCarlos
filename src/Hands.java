public class Hands extends Card{

    private Card[] hand;

    //http://cobweb.cs.uga.edu/~gtb/1302/Project1/PokerHand.java
    public Hands(Card card1,Card card2, Card card3, Card card4, Card card5){


        hand = new Card[5];

        hand[0] = card1;
       hand[1] = card2;
       hand[2] = card3;
       hand[3] = card4;
       hand[4] = card5;

   }


    //http://cobweb.cs.uga.edu/~gtb/1302/Project1/PokerHand.java

    public Hands() {
        this(new Card(),new Card(),new Card(),new Card(), new Card());

    }

   public Card[] getHand() {
        return hand;
    }

    public void setHand(Card[] hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Hand is: \n" + getHand();
    }


    public void displayHand(){
        int i;

       for (i = 0; i < 5; i++){
           System.out.println(hand[i]);
       }


   }
}

