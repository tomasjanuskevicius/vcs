package lt.vcs;

import static lt.vcs.VcsUtils.*;

/**
 *
 * @author Cukrus
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        println("Kauliuku pokeris");
        String p1name = inputWord("Zaidejas 1, iveskite savo varda");
        String p2name = inputWord("Zaidejas 2, iveskite savo varda");
        
        Player p1 = new Player(p1name);
        Player p2 = new Player(p2name);
        boolean zaisti = true;
        
        while (zaisti) {
          //  Game newGame = new Game(p1, p2);
          //  newGame.start();
          int p1bet = inputInt("Zaidejas 1 iveskite statoma suma");
          int p2bet = inputInt("Zaidejas 2 statoma suma yra " + p1bet + " . iveskite stoma suma");
          int p1choice = 0;
          int p2choice = 0;
          if (p1bet <= p2bet){
              p1choice = inputInt("Zaidejas 2 pakele statyma iki " + p2bet + " ar noriet islyginti (1 -taip/ 2 - ne)");
          }
          if (p1choice == 1){
          p1bet = p2bet;
          
          }
          if (p1choice == 2){
          //baigtas
          }
          int[] p1hand = GameUtils.rollHand();
          int[] p2hand = GameUtils.rollHand();
          
          println("p1hand" + GameUtils.intArrayToString(p1hand));
          println("p2hand" + GameUtils.intArrayToString(p2hand));
          
           p1choice = inputInt("Zaidejas 1 ar nori perrident kamuoliuku? 1 - taip / 2 - ne");
           if(p1choice == 1){
           String p1reroll = inputLine("per kableli ivesk kauliuku numerius kuriuos perrident");
           reRollDice(p1hand, p1reroll);
           println("p1hand: " + GameUtils.intArrayToString(p1hand) );
           }
           
           p2choice = inputInt("Zaidejas 2 ar nori perrident kamuoliuku? 1 - taip / 2 - ne");
           if(p2choice == 1){
           String p2reroll = inputLine("per kableli ivesk kauliuku numerius kuriuos perrident");
           reRollDice(p2hand, p2reroll);
           println("p2hand: " + GameUtils.intArrayToString(p2hand) );
           }
   
            int p1diceSum = 0;
            int p2diceSum = 0;
            for(int dice : p1hand){
            p1diceSum += dice;
              }
            
            for(int dice : p2hand){
            p2diceSum += dice;
              }
            
            if(p1diceSum  > p2diceSum){
            p1.setCash(p1.getCash() + p2bet);
            p2.setCash(p2.getCash() - p2bet);
            println("Laimejo 1 " + p1.getCash());
            println("Zaidejas 2 balansas " + p2.getCash());
            }
            else if (p1diceSum  < p2diceSum){
            p1.setCash(p1.getCash() - p2bet);
            p2.setCash(p2.getCash() + p2bet);
            println("Laimejo 2 " + p2.getCash());
            println("Zaidejas 1 balansas " + p1.getCash());
            }
            else{
            println("lygosios, statomos sumos grazintos");
            }
           
           
            String pasirinkimas = inputWord("Ar norite zaisti toliau? (y - taip / n - ne)");
            zaisti = "y".equalsIgnoreCase(pasirinkimas);
        }
    }
    
        
        private static int rollDice() {
            return rand(1, 6);
        }
           

        public static void reRollDice(int[] hand, String dices) {
        dices = dices.replaceAll(" ", "");
        for (String dice : dices.split(",")) {
            Integer nr = new Integer(dice);
            hand [nr - 1] = rollDice();
        }
        }
}


