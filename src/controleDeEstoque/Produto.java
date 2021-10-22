/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleDeEstoque;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class Produto {
    int id = 0;
    String nome;
    double valor;
    int quantidade;
    List<String> produtos = new ArrayList();
    
 Produto(){
       
 
 }
 
 Produto(int id,String n,double v,int qtd){
        
     this.id = id;
     nome = n;
     valor = v;
     quantidade = qtd;
     
}

    String adicionar(String n,double v,int q) {
        id = id + 1;
        nome = n;
        valor = v;
        quantidade = q;
        
        produtos.add(Integer.toString(id));
        produtos.add(nome);
        produtos.add(Integer.toString((int) valor));
        produtos.add(Integer.toString(quantidade));
        return "Adicionado"; 
    }

    void exibirTabela() {
        System.out.println("||  ID  ||  NOME  ||  VALOR  ||  QUANTIDADE  ||");
        System.out.println("-----------------------------------------------");
        if(produtos.size() == 0){
            System.out.print("");
        }else {
            int tamanho = produtos.size();
            for(int x = 0; x<=tamanho; x++){
                    System.out.println("||  "+produtos.get(x)+"   ||  "+produtos.get(x+1)+"  ||   "+produtos.get(x+2)+"   ||       "+produtos.get(x+3)+"      ||");
            }
        }
        
        
    }

    String remover() {
        return "removido";
    }

    String sair() {
        return "sair";
    }
    
    
}
