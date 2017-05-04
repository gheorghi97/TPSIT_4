package fattoriale;

/**
 * Gheorghi Braccitti 4 INB 4/05/2017
 */
public class Stampa extends Thread {
    Integer z;
    Integer somma=0;
    public Stampa(int x){
      this.z=x;
      this.somma=somma;
    }
    public void run(){
        somma=z;
        for(int i=1;i<z;i++){
           somma= somma * i;
        }
        System.out.println("Fattoriale di "+z+"-"+somma);
    }
}
