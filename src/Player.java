public class Player {

     private String name;
     private Card[] cards;

     public Player(){

         this("Unknown");
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



}
