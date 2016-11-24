package lt.vcs;

import static lt.vcs.VcsUtils.println;

/**
 *
 * @author tomas
 */
public class Game {
    private final Player p1;
    private final Player p2;
    
    public Game(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        
        println("Pirmo zaidejo pasirenkama statymo suma");
        int p1bet = VcsUtils.inInt();
        println("Antro zaidejo statymas");
        int p2bet = VcsUtils.inInt();
        if(p1bet == p2bet){
        int _1ball = VcsUtils.rand(1,6);
        println("" + _1ball);
        }
        
    }
}
