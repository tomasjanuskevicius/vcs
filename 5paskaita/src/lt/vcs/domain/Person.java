package lt.vcs.domain;

import lt.vcs.interfeisas.Named;
import lt.vcs.interfeisas.Identify;
import lt.vcs.interfeisas.PetLover;


/**
 *
 * @author tomas
 */
public abstract class Person implements Named, Identify {
    
    private String name;
    private String lastName;
    private String id;


public Person(String name, String lastname, String id){//konstruktorius kaip padarys Petrson objekta (vardas, pavarde)
this.name = name; 
this.lastName = lastname; 
this.id = id;
talk();
}

protected abstract void talk();

@Override
public String toString() {
    return String.format("Person (name = %s, lastname = %s) object = %s + ", name, lastName, super.toString());
}
    public String toString (String txt ){
        return txt + toString();
        }
      public String toString (int txt ){
        return null;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
 