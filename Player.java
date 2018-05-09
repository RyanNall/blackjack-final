
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Player
{
    // instance variables - replace the example below with your own
    private String name;
    private int money;
    ArrayList<Card> hand = new ArrayList<Card>();
    private int handTotal;
    int total = 0;
    
    public Player(String nm, int m)
    {
        this.name = nm;
        this.money = m;
    }

   
    public void bet(){
        
    }
    public void hit(Card c){
        hand.add(c);
    }
    public void stay(){
        System.out.println("You stayed!");
        System.out.println("Its the dealer's turn now");
    }
    public void busted(){
        System.out.println("You busted!");
    }
    public String toString(){
        return null;
    }
    public void getHand(){
        
    }
    public int getHandTotal(){
        total = 0;
        //Prints out the cards in the player's hand and declares the player's hand total
        for (Card c: hand){
            System.out.println(c);
            total += c.getValue();
        }
        
        System.out.println("Your total is: " + total);
        return total;
    }
    public int getTotal(){
        //getter method for player hand total
        return this.total;
    }
   
  
    
    
    
   }
