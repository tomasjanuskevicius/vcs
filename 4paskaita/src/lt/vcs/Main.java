package lt.vcs;

import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.scene.chart.PieChart;
import static lt.vcs.VcsUtils.println;
import lt.vcs.klases.Enumas;
import lt.vcs.klases.Person;

/**
 *
 * @author tomas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VcsUtils.println("paskaita 4");
        println("4paskaita");   
        for(int i=0; i<5;i++){
            if(i == 2){
                continue; //persoka reiksme arba i kita cikla
            }
            if(i == 4){
            break;
            }
            println("" +i);
        }
        println("------------");
        int [] mass = {1, 2, 3};
        for(int i : mass){ //priskirs kintamaji i
        println("" +i);
        }
        println("------------");
        int kint = 0;
        while(kint < 3){
            println("" +kint);
            kint++;
        }
        println("------------");
        int doKint = 0;
        do {
            println(String.format("ivesti %d ", doKint));
            doKint++;
        
        
        } while(doKint <= 3);
        println("------------");
        println((new Date()).toString() );
        SimpleDateFormat sdf = new SimpleDateFormat("'data' yyyy-MMMM-dd 'laikas' HH:mm:ss");
        String data = sdf.format(new Date ());
        println(data);
        println("" + System.currentTimeMillis());
        println("" + new Date(System.currentTimeMillis()));
        println("------------");
        println("metam kauliuka ir rezultatas - " + VcsUtils.rand(1,6));
        println("------------");
        for(int i = 0; i < 5; i++){
         println("metam kauliuka " + (i + 1) + " karta ir rezultatas - " + VcsUtils.rand(1,6));
        }
        println("------------");  
        SuKonstruktorium obj = new SuKonstruktorium("Vardenis");
        println(obj.getVardas());
        obj.setVardas("pavardenis");
        println("------------");
        Person person = new Person("vardas", "pavarde", "123", new Date());
        println(person.getName());
        println("------------");
        println(Enumas.REIKSME1.getEn());
    }
}
