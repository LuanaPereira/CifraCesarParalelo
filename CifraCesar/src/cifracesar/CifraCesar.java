/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifracesar;

/**
 *
 * @author luana
 */
public class CifraCesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String palavra;
        Criptografia crip1 = new Criptografia(0);
        crip1.fork();
        Criptografia crip2 = new Criptografia(1);
        palavra = crip1.join() + " " + crip2.compute();
        
        System.out.println(palavra); //printa a mensagem 
        
    }
    
}
