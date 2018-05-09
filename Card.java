
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    // instance variables - replace the example below with your own
    private int value;
    private String suit;
    private String rank;

    /**
     * Constructor for objects of class Card
     */
    public Card(int val, String sui, String ran)
    {
        //card constructor, initializes the variables
        this.value = val;
        this.suit = sui;
        this.rank = ran;
    }

    //getter methods for each of card's variables
    public String getSuit()
    {
        return this.suit;
    }
    public int getValue(){
        return this.value;
    }
    
    public String toString() {
        return "Card: " + "suit: " + suit + " rank: " + rank + " value: " + value;
    }
}
