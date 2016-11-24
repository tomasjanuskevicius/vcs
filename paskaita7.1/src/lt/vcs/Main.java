package lt.vcs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import static lt.vcs.VcsUtils.*;


/**
 *
 * @author tomas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
     /* 
      println("Main metodas");
      new Person("antanas");
      Person antanas = new Person("antanas");
      println(antanas.getName());
      Person petras = new Person("petras");
      petras.setName("povilas");
      println(petras.getName());
      println("Grizom i Main metoda");
     
      
      File tekstinis = new File("C:\\tmp\\test.txt");
      println("" + tekstinis.exists());
      InputStream in;
      OutputStream out;
      BufferedWriter bw = null;
      try{
      bw = new BufferedWriter(
            new OutputStreamWriter(
                    new FileOutputStream(tekstinis), "utf-8"));
      String nl = System.lineSeparator();
      bw.write("write metodas \r");// \r i kita eilute permeta
      bw.write("write metodas" + nl);// + nl permeta i nauja eilute, tiesiog kitas budas
      bw.append("pakeitem failo turini");
      bw.newLine();//padaro nauja eilute
      bw.append("antra eilute");
      bw.flush();// issaugo
     
      
      } catch (IOException ex){
          println("nepavyko sukurti isvedimo srauto");
          throw new RuntimeException(ex);
      } finally {
          try{
            bw.close();
      } catch (IOException ex){
          throw new RuntimeException(ex);
      }
      }
     
      
      
      BufferedReader br = new BufferedReader(
              new InputStreamReader(
                new FileInputStream(tekstinis), "utf-8"));
      
      String line = null;
      while ((line = br.readLine()) != null ){
      println(line);
      }
      br.close();
      // (br.readLine() == null - end of file)
      */
      String a = inputLine("Iveskite kelia iki failo");
      Fileread(a);
      
    }
    
    
    
    
}
