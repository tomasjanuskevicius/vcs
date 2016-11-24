package lt.vcs.domain;

/**
 *
 * @author tomas
 */
public enum PetType {
    
    FLYING("skraidantys"),
    AQUA("plaukiantys"),
    LAND("vaikstantys");
    
    private final String description;
    
    private PetType(String description){  //konstruktorius private!
        this.description = description;
    }

    public String getDescription() { //pasiekti konstruktoriu
        return description;
    }
    
 } 
