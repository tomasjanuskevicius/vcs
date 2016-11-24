package lt.vcs;
import static lt.vcs.VcsUtils.*; //suimportuojam Utils klase su visasi metodais
import lt.vcs.domain.Person;
/**
 *
 * @author tomas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Person antanas = new Person("antanas", "antanauskas", "ak");
      println(antanas.toString()); //pavercia i string
      //println("" + antanas); //tas pats kas println(antanas.toString());
    }
    
}
