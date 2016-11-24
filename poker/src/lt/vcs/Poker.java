package lt.vcs;

import static lt.vcs.VcsUtils.inputWord;
import static lt.vcs.VcsUtils.println;

/**
 *
 * @author tomas
 */
public class Poker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         println("Pokeris");
        String p1name = inputWord("Iveskite varda pirmo zaidejo");
        String p2name = inputWord("Iveskite varda antro zaidejo");
        
        Player p1 = new Player(p1name);
        Player p2 = new Player(p2name);
        
        Game newGame = new Game(p1, p2);
    }
    
}
