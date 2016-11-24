package lt.vcs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import static lt.vcs.VcsUtils.println;
import lt.vcs.klases.Person;

/**
 *
 * @author tomas
 */
public class PersonNd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Person person = new Person("","","", new Date());
        println("Iveskite varda");
        person.setName(VcsUtils.newScan().next());
        println("Iveskite pavarde");
        person.setLastname(VcsUtils.newScan().next());
        println("Iveskite asmens koda");
        person.setID(VcsUtils.newScan().next());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        println("Iveskite datą formatu yyyy-MM-dd");
        println("Pavyzdys " + sdf.format(new Date()));
        Date date = null;
        while (date == null) {
        String line = VcsUtils.newScan().nextLine();
            try {
                date = sdf.parse(line);
            } catch (ParseException e) {
        System.out.println("Atsiprasome, data negalioja");
        }
        String str_date=line;
        DateFormat formatter ; 
        Date date1 ; 
        formatter = new SimpleDateFormat("yyyy-MM-dd");
        date1 = formatter.parse(str_date);
        person.setBirthdate(date1);
        println("Vardas: " + person.getName() + " Pavarde: " + person.getLastname() );
        println("Asmens kodas: " + person.getID()); 
        String datestring = formatter.format(person.getBirthdate());
        println("Gimimo metai: " + datestring);
}
    }
   
}
