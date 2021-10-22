/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleDeEstoque;

/**
 *
 * @author pedro
 */
public class Produto {
    int id;
    String nome;
    double valor;
    int quantidade;
    
 Produto(){
 
 }
 
 Produto(int id,String n,double v,int qtd){
     this.id = id;
     nome = n;
     valor = v;
     quantidade = qtd;
}

    void adicionar() {
        
    }

    void exibirTabela() {
        
    }

    void remover() {
        
    }

    void sair() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
