
package javaapplication4;
import com.sun.source.tree.CaseTree;
import java.util.Random;
public class Luta {
    private Lutador desafiado; 
    private Lutador desafiante;
    private int rouds;
   private boolean aprovada;
   private int vencedor;
   Random gerador = new Random();
    
    
     public void marcarLuta (Lutador l1, Lutador l2){
         if((l1.getCategoria() == l2.getCategoria()) && (l1 != l2)){
            aprovada =  true;
            desafiado = l1;
            desafiante = l2;
         }else{
              aprovada =  false;
            desafiado = null;
            desafiante = null;
         }
         
     }
     public void lutar(){
         if (aprovada == true){
             desafiado.apresentar();
             desafiante.apresentar();
             vencedor = gerador.nextInt(3);
          
         
        switch(vencedor){
                case 0: 
                    System.out.println("Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1: 
                    System.out.println("Ganhador: " + desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2: 
                    System.out.println("Ganhador: " + desafiante.getNome());
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
                    
     }else{ 
            System.out.println("Luta não pode acontecer");
        }
     }     
         
     

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd ;
    }
     

    public Lutador getDesafiado() {
        return desafiado;
    }
    
    
    
    
    
    
    
}
