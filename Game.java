import java.util.Scanner;
public class Game
{
    int money;
    Deck deck = new Deck();
    Scanner scan = new Scanner(System.in);
    Player player;
       Dealer dealer;
    public Game()
    {
       System.out.println("How much money do you have?");
       int money= scan.nextInt();
       System.out.println("What is your name?(One word)");
       String name = scan.next();
       player = new Player(name, money);
       dealer = new Dealer();
       //Sets the game up
    }

   
    public void playGame()
    {

       dealPlayerFirstHand();
       addHit();
       //Gathers the players hand
       dealDealerFirstHand();
 
       dealerDetermineHit();
       //Gathers the dealers hand
       determineWinner();
       
    }
   
    public void endGame(){
        determineWinner();
    }
    public void deal(){
        Card c = deck.deal();
        player.hit(c);
    }
    public void dealerDeal(){
        Card c = deck.deal();
        dealer.hit(c);
    }
    public void determineWinner(){
        System.out.println("The Player's total is: " + player.getTotal());
        System.out.println("The Dealer's total is: " + dealer.getTotal());
        if (player.getTotal() < 22){
            //Player has not busted
        if(dealer.getTotal() == player.getTotal()){
            System.out.println("Its a tie!");
        }
        
        if((dealer.getTotal() > player.getTotal()) && (dealer.getTotal() < 22)){
            System.out.println("Dealer wins. Player loses.");
        }
        else{
            System.out.println("Player wins. Dealer loses.");
        }
    }
    //Player has busted
        else if(dealer.getTotal() > 21){
            System.out.println("You and the Dealer busted. No one wins!");
        }
        else{
            System.out.println("You busted. The Dealer wins!");
        }
    }
    
    public void dealPlayerFirstHand(){
        deal();
        deal();
        player.getHandTotal();
    }
    public void addHit(){
        
            
            System.out.println("Would you like to hit? (Yes/ anything else)");
        String response = scan.next();
        
        while(response.equals("Yes")){
            
            deal();
            //Updates the players hand total
            player.getHandTotal();
            //Checks to see if the player has busted yet
            if(player.getTotal()>21){
                player.busted();
                break;
            }
            System.out.println("Would you like to hit?");
            response = scan.next();
            
        }
    
        
        player.stay();
            
        
      
      
      
    }
    public void dealDealerFirstHand(){
        //Deals the dealer his first hand
        dealerDeal();
        dealerDeal();
        //Displays the dealers cards
        dealer.getHandTotal();
        //Updates the dealers hand total
        dealer.getTotal();
        System.out.print("The dealer's hand total after the first deal is ");
        System.out.println(dealer.total);
    }
    
    public void dealerDetermineHit(){
        if ( dealer.getTotal() < 18 ){
            System.out.println("Dealer is hitting");
            dealerDeal();
            dealer.getHandTotal();
            System.out.println("The dealer's hand total is " + dealer.total);
            dealerDetermineHit();
        }
       // dealer.getHandTotal();
        //System.out.println(dealer);
       // System.out.println("Dealer is done hitting");
    }
    public void dealerTotal(){
        System.out.println(dealer.getTotal());
    }
}

