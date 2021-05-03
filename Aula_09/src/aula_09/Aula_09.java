
package aula_09;
public class Aula_09 {
    public static void main(String[] args) {
       
       //Banco do carro
       bancoEletrico B1 = new bancoEletrico();
        
        B1.status();
        System.out.println("_____________________________");
        B1.subirBanco();
        B1.subirBanco();
        B1.subirBanco();
        B1.subirBanco();
        B1.baixarBanco();
        B1.bancoParaFrente();
        B1.bancoParaFrente();
        B1.bancoParaFrente();
        B1.status();
        
        System.out.println("_____________________________");
        B1.baixarBanco();
        B1.baixarBanco();
        B1.status();
    }

}
