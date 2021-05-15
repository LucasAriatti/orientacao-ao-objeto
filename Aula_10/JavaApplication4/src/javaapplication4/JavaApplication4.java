
package javaapplication4;
public class JavaApplication4 {
    public static void main(String[] args) {
       Lutador L[] = new Lutador[6];
       
       L[0] = new Lutador("lucas","Brazil",19,1.80,57,11,5,10 );
        L[1] = new Lutador("loro ","portugal",19,1.80,60,11,5,10 );
        L[2] = new Lutador("cai","frança",19,1.80,70,11,5,10 );
        L[3] = new Lutador("subi","de la ",19,1.80,60,11,5,10 );
        L[4] = new Lutador("fernanda","Jubislavia ",19,1.80,58,11,5,10 );
        L[5] = new Lutador("Guilheme","Fernandovisk ",19,1.80,58,11,5,10 );
        
        Luta UFC01 = new Luta();
        UFC01.marcarLuta(L[0], L[5]);
        UFC01.lutar();
        
        
        
    }
    
}
