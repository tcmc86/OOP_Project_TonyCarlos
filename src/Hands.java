public class Hands {

    private final int HAND_DRAW = 5;


   Card[] hand;




   public boolean royalFlush(){

        if(hand[0].getCardRank() == "10" && hand[1].getCardRank() == "jack" && hand[2].getCardRank() == "queen" && hand[3].getCardRank() == "king" && hand[4].getCardRank() == "ace"){
            return true;
        }
        if (hand[0].getCardSuit() == "clubs" && hand[1].getCardSuit() == "clubs" && hand[2].getCardSuit() == "clubs" && hand[3].getCardSuit() == "clubs" && hand[4].getCardSuit() == "clubs") {
            return true;
        }
        if(hand[0].getCardSuit() == "diamonds" && hand[1].getCardSuit() == "diamonds" && hand[2].getCardSuit() == "diamonds" && hand[3].getCardSuit() == "diamonds" && hand[4].getCardSuit() == "diamonds"){
            return true;
        }
        if(hand[0].getCardSuit() == "hearts" && hand[1].getCardSuit() == "hearts" && hand[2].getCardSuit() == "hearts" && hand[3].getCardSuit() == "hearts" && hand[4].getCardSuit() == "hearts"){
            return true;
        }
        if(hand[0].getCardSuit() == "spades" && hand[1].getCardSuit() == "spades" && hand[2].getCardSuit() == "spades" && hand[3].getCardSuit() == "spades" && hand[4].getCardSuit() == "spades"){
            return true;
        }
        return false;
    }

    public boolean flush(){

        if (hand[0].getCardSuit() == "clubs" && hand[1].getCardSuit() == "clubs" && hand[2].getCardSuit() == "clubs" && hand[3].getCardSuit() == "clubs" && hand[4].getCardSuit() == "clubs") {
            return true;
        }
        if(hand[0].getCardSuit() == "diamonds" && hand[1].getCardSuit() == "diamonds" && hand[2].getCardSuit() == "diamonds" && hand[3].getCardSuit() == "diamonds" && hand[4].getCardSuit() == "diamonds"){
            return true;
        }
        if(hand[0].getCardSuit() == "hearts" && hand[1].getCardSuit() == "hearts" && hand[2].getCardSuit() == "hearts" && hand[3].getCardSuit() == "hearts" && hand[4].getCardSuit() == "hearts"){
            return true;
        }
        if(hand[0].getCardSuit() == "spades" && hand[1].getCardSuit() == "spades" && hand[2].getCardSuit() == "spades" && hand[3].getCardSuit() == "spades" && hand[4].getCardSuit() == "spades"){
            return true;
        }
        return false;
    }


    public boolean fourOfAKind(){
       if(hand[0].getCardRank() == hand[1].getCardRank() && hand[0].getCardRank() == hand[2].getCardRank() && hand[0].getCardRank() == hand[3].getCardRank()){
           return true;
       }
       if(hand[0].getCardRank() == hand[2].getCardRank() && hand[0].getCardRank() == hand[3].getCardRank() && hand[0].getCardRank() == hand[4].getCardRank()){
           return true;
       }
       if(hand[1].getCardRank() == hand[0].getCardRank() && hand[1].getCardRank() == hand[2].getCardRank() && hand[3].getCardRank() == hand[4].getCardRank()){
           return true;
       }
        return false;
    }

}

