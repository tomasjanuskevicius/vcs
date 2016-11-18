package lt.vcs.klases;

import java.util.Date;

/**
 *
 * @author tomas
 */
public class Person {
    
    private String name;
    private String lastname;
    private String ID;
    private Date  birthdate;

public Person(String name, String lastname, String ID, Date bithdate){
this.name = name; 
this.lastname = lastname; 
this.ID = ID; 
this.birthdate = bithdate; 
}   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    
    
    
}
