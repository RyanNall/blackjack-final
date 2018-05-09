
public class Deck{
   Card[] cards = new Card[52];
       int i = 0;
       String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
       String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
       int [] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
       int count = -1;
   public void initializeDeck(){
       
       int i = 0;
       
            for (int j = 0; j < 4; j++){
                //establishes the four suites
                for(int k = 0; k < 13; k++){
                    //establishes ace through king
                    cards[i] = new Card(value[k], suits[j], rank[k]);
                    i++;
                }
            }
            
           // printDeck();
    }
    
    public void printDeck() {
        for(Card c: cards) {
            System.out.println(c);
        }
    }
         
   

    public Deck()
    {
        initializeDeck();
        shuffle();
   }

    public void shuffle(){
        for(int i = 0; i < cards.length; i++){
            Card tempcard = cards[i];
            int index = (int) Math.random() * 52;
            cards[i] = cards[index];
            cards[index] = tempcard;
        }
    }
    public Card deal(){
        //count++;
        //Card is drawn at random from the deck
        count = (int) (Math.random() * 52);
        return cards[count];
        
        
    }
   
     }
