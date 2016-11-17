package lt.vcs;

/**
 *
 * @author tomas
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        String text = "";
        String text2 = "test";
        int likutis = 350;
        int suma = 0;
        int galutinis = 0;
        int b = 1;
        while(b <= 3){
        Utils.println("Iveskite pin kodą");
        text = Utils.newScan().next();
         if (text2.equals(text)){
            Utils.println("prisijungėte, jūsų sąskaitoje yra " + likutis);
            Utils.println("Kiek norite išsiimti");
            suma = Utils.newScan().nextInt();
            galutinis = likutis - suma;
            Utils.println("Jūsų likutis " +galutinis);
            b = 3;
        }
        else{
            Utils.println("neteisingai");
            b++;          
        }
        Utils.println("Barbas baigtas");
    }
    
}
}

