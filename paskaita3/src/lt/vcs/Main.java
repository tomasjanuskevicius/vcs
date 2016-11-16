package lt.vcs;

import java.util.Scanner;

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
    int skaicius = 8;
    int antras = 1;
    System.out.println(antras);
    antras += skaicius;  
    System.out.println(antras);
    int atsakymas = antras % 2;
    System.out.println(atsakymas);
    System.out.println(++antras);//++ priesais skaiciu prideda vieneta pries operacija, jei ++ gale po operacijos prideda 1
    boolean boolas = false;
    System.out.println(!boolas);
    //siaip("1", "2");
    String rezultatas = skaicius(5);
    System.out.println(rezultatas);
    
    int[] intai2 = {2,3,5,6,8,9};
    System.out.println(intai2.length);
    
     int[] intai = new int[5];
     intai[2] = 7;
     
    String masyvas = "masyvas";
    char[] mass = masyvas.toCharArray();
    
    
    Scanner scan = new Scanner(System.in);//ivesti i programa kazka
    System.out.println("iveskite teksta");
    int ivestas = scan.nextInt();
    System.out.println("ivesta " + ivestas);
    
    
    
    
    
    //public static String siaip2(){ //sitam galima priskirti bet kiek reiksmiu
    //    return null; // negrazina nieko
    }
    public static String skaicius(int sk){
    return "" + sk;
    }
   // public static int skaicius2(String metodas){
   //    return  + metodas;
    }
    
 
    
    
    
    

    
    

