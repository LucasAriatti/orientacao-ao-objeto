
package aula_09;
public class bancoEletrico {
    
    private int posicaoVertical;
    private int posicaoHorizontal;
    private boolean alto;
    private boolean paraTras;

    // Construtor genérico
    public bancoEletrico() {
        this.posicaoVertical = 0;
        this.posicaoHorizontal = 0;
        this.alto = false;
        this.paraTras = true;
    }
    
    public void subirBanco(){
        if(this.posicaoVertical >= 10 ){
            System.out.println("O banco ja subiu no limite");
        } else{
         this.posicaoVertical +=2;
        }
        
        if(this.posicaoVertical > 5){
            this.alto = true;
        }
    }  
   
//--------------------------------------------------------------------\\    
    
    public void baixarBanco(){
        if(this.posicaoVertical <= 0){
            System.out.println("O banco ja baixo no limite");
        }else{
        this.posicaoVertical -=2;
        }
        
        if(this.posicaoVertical > 5){
            this.alto = true;
        }
    }
    
 //--------------------------------------------------------------------\\  
    
    
    public void bancoParaTras(){
        if(this.posicaoHorizontal <=0){
           System.out.println("O banco ja foi tras no limite"); 
        }else{
        this.posicaoHorizontal -=2;
        }
        if(this.posicaoHorizontal < 5){
            paraTras = true;
        }
    }
    
    //--------------------------------------------------------------------\\  
    
    
    public void  bancoParaFrente(){
        if(this.posicaoHorizontal >= 10){
            System.out.println("O banco ja foi para frente no limite");
        }else{
        this.posicaoHorizontal +=2;
        }
        if(this.posicaoHorizontal > 5){
            paraTras = false;
        }
    }

    //--------------------------------------------------------------------\\
        
    public void status(){
    System.out.println("A posicao Verticl do banco é: "+ this.posicaoVertical);
    System.out.println("O banco ta alto ? " + this.alto );
    System.out.println("A posicao Horizontal do banco é: "+ this.posicaoHorizontal);
    System.out.println("Esta para tras ? "+ this.paraTras);
    }   
}
