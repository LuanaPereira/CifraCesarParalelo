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
       
        String texto = "LuanaPereira"; //texto a ser processado
        char aux; //auxiliar para receber o texto
        String metade1 = ""; 
        String metade2 = "";
        int quantidade; //tamanho da string
        
        quantidade = texto.length(); //a quantidade recebe o tamanho do texto
        quantidade /=2; //divide na metadde para saber a posicao
        
        for (int i=0; i<quantidade; i++){ //percorre ate a primeira metade da string
            aux = texto.charAt(i);  // auxiliar recebe o texto na posicao i
            metade1 += aux; //string recebe a primeira metade do texto
        }
        
        for(int j=quantidade; j<texto.length(); j++){ // percorre começando na metade ate o fim do texto
            aux = texto.charAt(j); //auxiliar recebe o texto na posicao i 
            metade2 += aux; // a segunda metade recebe o texto auxiliar
        }
        
        
        
        String palavra;
        Criptografia crip1 = new Criptografia(metade1);
        crip1.fork(); //manda para outro processador
        Criptografia crip2 = new Criptografia(metade2);
        palavra = crip1.join() + " " + crip2.compute();
        
        System.out.println(palavra); //printa a mensagem 
        
    }
    
}
