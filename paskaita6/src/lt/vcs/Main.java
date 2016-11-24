package lt.vcs;

import static lt.vcs.VcsUtils.inputInt;
import static lt.vcs.VcsUtils.println;

/**
 *
 * @author tomas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = inputInt("iveskite pirma skaiciu");
        int b = inputInt("iveskite antra skaiciu");
        int suma = VcsUtils.Sudetis(a, b);
        println("suma " + suma);
        int atimtis = VcsUtils.Atimtis(a, b);
        println("Atimtis " + atimtis);
        int kvadratu = VcsUtils.Kvadratu(a);
        println("Pirmo skaiciaus kvadratas " + kvadratu);
        
    }
    
}
