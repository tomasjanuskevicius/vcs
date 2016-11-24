package lt.vcs;

import static lt.vcs.VcsUtils.*;

/**
 *
 * @author tomas
 */
public class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
        println("esame Person konstruktoriuje");
        start();
        println("grizom i Person konstruktoriu ir baigem konstruoti");
    }
    
    public void start(){
    println("esam start metode");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
