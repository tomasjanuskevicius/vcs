package lt.vcs;

/**
 *
 * @author tomas
 */
public class SuKonstruktorium {
    
    private String vardas;
    private String pavarde;
    
    public SuKonstruktorium(String vardas){
        this.vardas = vardas;
        
    } 
    
    public String getVardas(){
    return this.vardas;
    }
    
    public void setVardas(String vardas){
    this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }
    
}
