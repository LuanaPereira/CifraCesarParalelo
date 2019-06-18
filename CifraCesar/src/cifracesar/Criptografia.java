/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifracesar;

import java.util.concurrent.RecursiveTask;

/**
 *
 * @author luana
 */
public class Criptografia extends RecursiveTask<String> {
    public String texto = "LuanaPereira"; //texto a ser processado
    public int chave = 1; //quantidade de caracter usada na criptografia
    public String retorno = ""; //retorno do metido encriptografar
    public int posicao; //posicao do vetor de string
    public String divisaoTexto[]= new String[2]; //
    
    public Criptografia(int posicao){ //construtor recebendo a posicao da string a ser encriptografada
        this.posicao = posicao; //atualizando a posicao
    }
    
    
    @Override
    protected String compute(){ //metodo compute
        dividirTexto(); //metodo que separa o texto
        retorno = emcriptografar(divisaoTexto[posicao], chave); //chamada do metodo encriptografar
        return retorno; //retorno da encriptação
    }
    private String emcriptografar(String texto, int chave){ //metodo encriptar
        int n = texto.length(); // n recebeo o tamanho do texto
        String aux =""; //auxiliar para guardar o texto encriptografado
        
        for (int i=0; i<n; i++){ //percorre o texto
           aux = aux + (char)(texto.charAt(i) + chave); //a string auxiliar recebe a propria string + o caracter do texto + a chave da criptografia
        }
        System.out.println(texto); 
        return (aux); //retorna o texto encriptografado
    }
    
    public void dividirTexto(){ //metodo dividir texto
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
        
        divisaoTexto[0] = metade1;//atribuicao das partes da string para a divisão do texto
        divisaoTexto[1] = metade2;
    }
}
