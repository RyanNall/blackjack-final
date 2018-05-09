import java.util.ArrayList;
public class Dealer extends Player
{
    ArrayList<Card> dealerHand = new ArrayList<Card>();
    private int handTotal;
    //private int total = 0;
    int total = 0;
    public Dealer()
    {
      super("Dealer", -1);
    }
    public void hit(Card c){
        dealerHand.add(c);
    }
    public int getHandTotal(){
        total = 0;
        //prints the cards in the dealers hand
        for (Card c: dealerHand){
          System.out.println(c);
            total += c.getValue();
            
        }

        return total;
    }
    public int getTotal(){
        //updates the dealers hand total and acts as a getter method
        getHandTotal();
        
        return this.total;
    }
   
}
   
 
     
   

