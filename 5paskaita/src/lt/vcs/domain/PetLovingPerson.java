package lt.vcs.domain;

import lt.vcs.interfeisas.PetLover;

/**
 *
 * @author tomas
 */
public class PetLovingPerson extends Person implements PetLover {
    
    private Pet pet;

    public PetLovingPerson(String name, String lastname, String id) {
        super(name, lastname, id);
    }
    
    /**
     *
     * @param name
     * @param lastName
     * @param id
     */
    public PetLovingPerson (String name, String lastName, String id){
        super (name, lastName, id);
    }
    
    
    

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    protected void talk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
