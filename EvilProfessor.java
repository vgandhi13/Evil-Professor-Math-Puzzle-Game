import java.util.*;
public class EvilProfessor {
       
   int coins;
   Random rand = new Random();
       
   public EvilProfessor() {
      coins = 10;
   }
       
   public int getCoins() {
      return coins;
   }
       
   public int profChance() {
       
      if((coins - 2) % 3 == 0) {
         coins = coins - 2;
         return coins;
      }
       
      if((coins - 1) % 3 == 0) {
         coins = coins - 1;
         return coins;         
      }
         
      if((coins % 3) == 0) {
         int randomNum = rand.nextInt(1);
         coins = coins - (randomNum+1);
         return coins;
      }
   
      return 0;
   }
       
   public void changeCoins(int picks) {
      coins = coins - picks;
   }

    
   public static void main(String[] Args) {
       
      Scanner in = new Scanner(System.in);
      EvilProfessor ob = new EvilProfessor();
      int pick, k, a, m;
       
      System.out.println("The game will start with 10 coins.");  
       
      while(ob.getCoins() > 0) {
       
         System.out.println("Pickup 1 or 2 coins.");
         pick = in.nextInt();
         ob.changeCoins(pick);
         k = ob.getCoins();
         System.out.println("The total coins left are: " + k);  
         System.out.println();
         if(k==0) {
            System.out.println();
            System.out.println("Congrats, you won the game.");
            break;
         } 
         m=ob.profChance();
         if((k-m) == 1) {
            System.out.println("The evil professor picked up 1 coin.");  
         }
         else {
            System.out.println("The evil professor picked up 2 coins.");  
         }
         System.out.println("The total coins left are: " + m); 
         System.out.println();
         if(m == 0) {
            System.out.println();
            System.out.println("Sorry, the Evil Professor won the game.");
            System.out.println("Better luck next time.");
            break;
         } 
      
      }
   }
}