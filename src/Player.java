public class Player {

     private String name;
     private Card[] hand = new Card[5];
     private int numCards;
     private int numPlayers;



     // Player constructor

     public Player(){

         this("");
     }


     public Player(String name){

         this.name = name;
     }



     public String getName() {

         return name;
    }

    public void setName(String name) {

         this.name = name;
    }

    @Override
    public String toString() {

         return  "Player name: " + getName();
    }


    public Card[] dealPlayer(){

         int i;
         int j;
         for(i = 0; i < numPlayers; i++){
             for(j = 0; j < numCards; j++){
                 System.out.println(hand[j]);
             }
         }
    return hand;
     }




}
